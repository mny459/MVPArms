package com.mny.pango.demo.mvvm.model

import com.mny.pango.demo.mvvm.contract.UserContract
import com.mny.pango.demo.mvvm.model.api.UserService
import com.mny.pango.demo.mvvm.model.entity.BaseResponse
import com.mny.pango.demo.mvvm.model.entity.User
import com.mny.pango.mvvm.BaseModel

class UserModel : BaseModel(), UserContract.Model {
    companion object {
        const val USERS_PER_PAGE = 10
    }

    override suspend fun getUsers(lastIdQueried: Int, update: Boolean): MutableList<User> {
        return mRepository.obtainRetrofitService(UserService::class.java)
                .getUsers(lastIdQueried, USERS_PER_PAGE)
    }

}