package com.mny.pango.base.delegate

import android.os.Bundle

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
interface IActivity {
    fun initBeforeOnCreate(savedInstanceState: Bundle?)
    fun initView(savedInstanceState: Bundle?): Int
    fun initData(savedInstanceState: Bundle?)
    fun useEventBus(): Boolean
}