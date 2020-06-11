package com.mny.pango.demo.mvvm.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blankj.utilcode.util.LogUtils
import com.mny.pango.demo.mvvm.model.UserModel
import com.mny.pango.demo.mvvm.model.entity.User
import kotlinx.coroutines.launch

/**
 *@author mny on 2020/5/18.
 *        Email：mny9@outlook.com
 *        Desc:
 */
class UserViewModel(val userModel: UserModel) : ViewModel() {
    private var lastUserId = 1
    private var isFirst = true
    private val preEndIndex = 0
    val mUserList = MutableLiveData<MutableList<User>>()
    fun requestUsers(pullToRefresh: Boolean) {
        LogUtils.d("requestUsers ============ ")
        if (pullToRefresh) lastUserId = 1

        //关于RxCache缓存库的使用请参考 http://www.jianshu.com/p/b58ef6b0624b
        var isEvictCache = pullToRefresh //是否驱逐缓存,为ture即不使用缓存,每次下拉刷新即需要最新数据,则不使用缓存


        if (pullToRefresh && isFirst) { //默认在第一次下拉刷新时使用缓存
            isFirst = false
            isEvictCache = false
        }
        viewModelScope.launch {
            val users = userModel.getUsers(lastUserId, isEvictCache)
            LogUtils.d("response = $users")
            mUserList.postValue(users)
        }
    }
}