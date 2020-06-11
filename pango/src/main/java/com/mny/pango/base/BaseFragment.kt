package com.mny.pango.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mny.pango.base.delegate.IFragment

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
abstract class BaseFragment : Fragment(), IFragment {
    protected val TAG = this.javaClass.simpleName
    protected var mActivity: Context? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mActivity = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView(inflater, container, savedInstanceState)
    }

    override fun onDetach() {
        super.onDetach()
        mActivity = null
    }

    override fun useEventBus(): Boolean = true
}