package com.candidcold.preferences

import androidx.annotation.StringRes
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_preference_header.*

open class HeaderItem(@StringRes private val titleString: Int) : Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.item_preference_header_title.setText(titleString)
    }

    override fun getLayout(): Int {
        return R.layout.item_preference_header
    }

}