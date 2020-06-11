package com.mny.pango.data

import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Retrofit

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
class RepositoryManager : IRepository, KoinComponent {
    val mRetrofit: Retrofit by inject()
    override fun <T> obtainRetrofitService(serviceClass: Class<T>): T {
        return mRetrofit.create(serviceClass)
    }
}