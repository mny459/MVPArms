package com.mny.pango.demo.di

import com.mny.pango.demo.mvvm.model.UserModel
import com.mny.pango.demo.mvvm.ui.adapter.UserAdapter
import com.mny.pango.demo.mvvm.vm.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {
    factory { UserModel() }
    factory { UserAdapter() }
    viewModel { UserViewModel(get()) }
}