package com.mny.pango.demo.mvvm.model.api

import com.mny.pango.demo.mvvm.model.entity.BaseResponse
import com.mny.pango.demo.mvvm.model.entity.User
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 *@author mny on 2020/5/18.
 *        Email：mny9@outlook.com
 *        Desc:
 */
interface UserService {
    companion object {
        const val HEADER_API_VERSION = "Accept: application/vnd.github.v3+json"
    }

    @Headers(HEADER_API_VERSION)
    @GET("/users")
    suspend fun getUsers(@Query("since") lastIdQueried: Int, @Query("per_page") perPage: Int):MutableList<User>
}