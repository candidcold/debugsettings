package com.candidcold.preferences

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_preference_spinner.*

abstract class SpinnerPreferenceItem : PersistablePreferenceItem<String>() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        with(viewHolder) {
            title.text = getTitle()
            button.text = getButtonText()

            val dataAdapter = ArrayAdapter<String>(title.context,
                    android.R.layout.simple_spinner_dropdown_item,
                    getOptions())

            spinner.adapter = dataAdapter
            spinner.setSelection(findPositionInOptions(value))
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // Do nothing
                }

                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    val selection = parent?.getItemAtPosition(position).toString()
                    button.isEnabled = value != selection
                }
            }

            button.setOnClickListener {
                val selection = spinner.selectedItem.toString()
                value = selection
                addToRecentlyUsed()
                execute(selection).invoke()
            }
        }

    }

    private fun findPositionInOptions(value: String?): Int {
        for (i in 0..getOptions().size) {
            if (getOptions()[i] == value) {
                return i
            }
        }

        throw IllegalStateException("$value is not an option provided from getOptions()")
    }

    override fun getLayout() = R.layout.item_preference_spinner

    abstract fun getOptions(): List<String>

    abstract fun execute(selected: String?): () -> Unit

    abstract fun getButtonText(): String

}