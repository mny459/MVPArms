package com.mny.pango.data

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
interface IRepository {
    fun <T> obtainRetrofitService(serviceClass: Class<T>):T
}