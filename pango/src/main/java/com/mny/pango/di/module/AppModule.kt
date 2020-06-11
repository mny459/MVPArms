package com.mny.pango.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mny.pango.data.IRepository
import com.mny.pango.data.RepositoryManager
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import java.util.concurrent.ExecutorService

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
val appModule = module {
    // Gson
    single<Gson> {
        val builder = GsonBuilder()
        // TODO 增减 Gson 的配置像
        builder.create()
    }

    // Retrofit.Builder
    single<Retrofit.Builder> {
        Retrofit.Builder()
    }

    // OkHttpClient Builder
    single<OkHttpClient.Builder> {
        OkHttpClient.Builder()
    }

    // GlobalConfigModule
    single<GlobalConfigModule> {
        ClientModule.provideGlobalConfigModule()
    }

    // ExecutorService
    single<ExecutorService> {
        val config: GlobalConfigModule = get()
        config.provideExecutorService()
    }

    single<HttpUrl> {
        val config: GlobalConfigModule = get()
        config.provideHttpUrl()
    }

    // OkHttp log interceptor
    single<Interceptor> {
        val config: GlobalConfigModule = get()
        config.provideLogInterceptor()
    }

    // OkHttpClient
    single<OkHttpClient> {
        ClientModule.provideOkHttp(get(), get(), get())
    }

    // Retrofit
    single<Retrofit> {
        ClientModule.provideRetrofit(get(), get(), get(), get())
    }

    single<IRepository> {
        RepositoryManager()
    }

}

