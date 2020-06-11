package com.mny.pango.demo.mvvm.ui

import android.os.Bundle
import com.mny.pango.base.BaseMVVMActivity
import com.mny.pango.demo.mvvm.vm.UserViewModel
import me.mny.pango.demo.R

class UserActivity : BaseMVVMActivity<UserViewModel>() {
    override fun initView(savedInstanceState: Bundle?): Int = R.layout.activity_user

    override fun initData(savedInstanceState: Bundle?) {
    }

}
