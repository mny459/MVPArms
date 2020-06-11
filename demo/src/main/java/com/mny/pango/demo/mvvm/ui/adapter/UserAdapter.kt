package com.mny.pango.demo.mvvm.ui.adapter

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mny.pango.demo.mvvm.model.entity.User
import me.mny.pango.demo.R

class UserAdapter : BaseQuickAdapter<User, BaseViewHolder>(R.layout.recycle_list) {
    override fun convert(holder: BaseViewHolder, item: User) {
        holder.setText(R.id.tv_name, item.login)
        val imgAvatar = holder.getView<ImageView>(R.id.iv_avatar)
        Glide.with(imgAvatar)
                .load(item.getAvatarUrl())
                .into(imgAvatar)
    }
}