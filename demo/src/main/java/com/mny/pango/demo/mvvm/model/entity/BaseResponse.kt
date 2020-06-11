package com.mny.pango.demo.mvvm.model.entity

import com.mny.pango.demo.mvvm.model.api.Api
import java.io.Serializable

data class BaseResponse<T>(val code: String?, val msg: String?, val data: T?) : Serializable {
    fun isSuccess(): Boolean = code == Api.RequestSuccess
}