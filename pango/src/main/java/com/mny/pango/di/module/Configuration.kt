package com.mny.pango.di.module

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
interface Configuration<T> {
    fun config(appContext: Context, target: T)
}

interface OkHttpConfiguration : Configuration<OkHttpClient.Builder>
interface RetrofitConfiguration : Configuration<Retrofit.Builder>
