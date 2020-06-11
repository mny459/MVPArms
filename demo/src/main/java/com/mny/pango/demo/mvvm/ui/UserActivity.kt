package com.mny.pango.demo.mvvm.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import com.mny.pango.base.BaseMVVMActivity
import com.mny.pango.demo.di.userModule
import com.mny.pango.demo.mvvm.model.entity.User
import com.mny.pango.demo.mvvm.ui.adapter.UserAdapter
import com.mny.pango.demo.mvvm.vm.UserViewModel
import kotlinx.android.synthetic.main.activity_user.*
import me.mny.pango.demo.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class UserActivity : BaseMVVMActivity<UserViewModel>() {
    val userViewModel: UserViewModel by viewModel()
    val mAdapter: UserAdapter by inject()
    override fun initView(savedInstanceState: Bundle?): Int = R.layout.activity_user

    override fun initData(savedInstanceState: Bundle?) {
        loadKoinModules(userModule)
        recyclerView.adapter = mAdapter
        userViewModel.mUserList.observe(this, object : Observer<MutableList<User>> {
            override fun onChanged(t: MutableList<User>?) {
                t?.apply {
                    mAdapter.addData(t)
                }
            }
        })
        userViewModel.requestUsers(false)
    }

}
