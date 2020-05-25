package com.mny.pango.base.delegate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
interface IFragment {
    fun initView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    fun initData(savedInstanceState: Bundle?)
    fun useEventBus(): Boolean
}