package com.candidcold.preferences

import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_preference_dialog.*


abstract class UtilityPreferenceItem : PreferenceItem() {

    override fun getLayout() = R.layout.item_preference_dialog

    override fun bind(viewHolder: ViewHolder, position: Int) {

        with(viewHolder) {
            title.text = getTitle()
            summary.text = getSummary()

            itemView.setOnClickListener {
                addToRecentlyUsed()
                execute().invoke()
            }
        }
    }

    abstract fun execute(): () -> Unit
}