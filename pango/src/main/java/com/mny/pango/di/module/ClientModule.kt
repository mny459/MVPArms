package com.mny.pango.di.module

import com.google.gson.Gson
import okhttp3.Dispatcher
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.ExecutorService
import java.util.concurrent.TimeUnit

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
object ClientModule {
    private const val TIME_OUT = 15L
    private var mGlobalConfigModule:GlobalConfigModule?=null
    fun provideOkHttp(builder: OkHttpClient.Builder, interceptor: Interceptor, executorService: ExecutorService): OkHttpClient {
        builder.connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
//                .addNetworkInterceptor(interceptor)
                .dispatcher(Dispatcher(executorService))

        return builder.build()
    }

    fun provideRetrofit(builder: Retrofit.Builder, client: OkHttpClient, url: HttpUrl, gson: Gson): Retrofit {
        builder.baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
        return builder.build()
    }

    fun provideGlobalConfigModule():GlobalConfigModule{
        if (mGlobalConfigModule==null){
            mGlobalConfigModule = GlobalConfigModule.Builder().build()
        }
        return mGlobalConfigModule!!
    }
}