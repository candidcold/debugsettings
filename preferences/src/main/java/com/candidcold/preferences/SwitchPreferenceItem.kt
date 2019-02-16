package com.candidcold.preferences

import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_preference_switch.*

abstract class SwitchPreferenceItem : PersistablePreferenceItem<Boolean>() {

    override fun getLayout() = R.layout.item_preference_switch

    override fun bind(viewHolder: ViewHolder, position: Int) {
        with(viewHolder) {
            title.text = getTitle()
            summary.text = getSummary()
            toggle.isSelected = value!!

            itemView.setOnClickListener {
                toggle.toggle()
                val selected = toggle.isSelected
                value = selected
                addToRecentlyUsed()
                execute(selected).invoke()
            }
        }
    }

    abstract fun execute(selected: Boolean): () -> Unit

}
