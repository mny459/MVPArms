package com.mny.pango.di.module

import com.mny.pango.http.log.RequestInterceptor
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Interceptor
import okhttp3.internal.threadFactory
import java.util.concurrent.ExecutorService
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
class GlobalConfigModule internal constructor(builder: Builder) {
    private var mExecutorService: ExecutorService = builder.executorService
    private var mLogInterceptor: Interceptor = builder.logInterceptor
    private var mHttpUrl: HttpUrl = builder.httpUrl
    fun builder(): Builder {
        return Builder()
    }

    fun provideExecutorService(): ExecutorService = mExecutorService
    fun provideLogInterceptor(): Interceptor = mLogInterceptor
    fun provideHttpUrl(): HttpUrl = mHttpUrl
    class Builder {
        internal var httpUrl: HttpUrl = "https://api.github.com".toHttpUrl()
        internal var executorService: ExecutorService = ThreadPoolExecutor(0,
                Int.MAX_VALUE,
                60,
                TimeUnit.SECONDS,
                SynchronousQueue(),
                threadFactory("Pango Executor", false))
        internal var logInterceptor: Interceptor = RequestInterceptor()

        fun executorService(executorService: ExecutorService) = apply {
            this.executorService = executorService
        }

        fun logInterceptor(interceptor: Interceptor) = apply {
            this.logInterceptor = interceptor
        }

        fun httpUrl(url: String) = apply {
            this.httpUrl = url.toHttpUrl()
        }

        fun build(): GlobalConfigModule = GlobalConfigModule(this)
    }
}