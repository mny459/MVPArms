package com.mny.pango.demo.mvvm.model.entity

data class User(val id: Int, val login: String, val avatar_url: String){
    fun getAvatarUrl(): String {
        return if (avatar_url.isEmpty()) avatar_url else avatar_url.split("\\?").toTypedArray()[0]
    }
}