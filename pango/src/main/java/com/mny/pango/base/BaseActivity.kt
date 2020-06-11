package com.mny.pango.base

import android.os.Bundle
import android.view.InflateException
import androidx.appcompat.app.AppCompatActivity
import com.mny.pango.base.delegate.IActivity

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
abstract class BaseActivity : AppCompatActivity(), IActivity {
    companion object {
        val TAG = javaClass.canonicalName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initBeforeOnCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        try {
            val layoutResID = initView(savedInstanceState)
            //如果initView返回0,框架则不会调用setContentView()
            if (layoutResID != 0) {
                setContentView(layoutResID)
            }
        } catch (e: Exception) {
            if (e is InflateException) throw e
            e.printStackTrace()
        }
        initData(savedInstanceState)
    }

    override fun initBeforeOnCreate(savedInstanceState: Bundle?) {}

    override fun useEventBus(): Boolean = true

}