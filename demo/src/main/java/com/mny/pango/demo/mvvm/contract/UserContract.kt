package com.mny.pango.demo.mvvm.contract

import com.mny.pango.demo.mvvm.model.entity.BaseResponse
import com.mny.pango.demo.mvvm.model.entity.User
import com.mny.pango.mvvm.IView

interface UserContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View : IView

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,如是否使用缓存
    interface Model {
       suspend fun getUsers(lastIdQueried: Int, update: Boolean): MutableList<User>
    }
}