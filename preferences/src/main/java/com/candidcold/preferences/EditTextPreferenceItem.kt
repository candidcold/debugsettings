package com.candidcold.preferences

import android.text.Editable
import android.text.TextWatcher
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_preference_edit_text.*

abstract class EditTextPreferenceItem : PreferenceItem() {

    override fun bind(viewHolder: ViewHolder, position: Int) {

        with(viewHolder) {
            title.text = getTitle()
            edit_text.hint = getSummary()
            edit_text.inputType = getInputType()

            button.isEnabled = edit_text.text?.isNotBlank() ?: false
            button.text = getButtonText()
            button.setOnClickListener {
                addToRecentlyUsed()
                execute(edit_text.text.toString())
            }

            edit_text.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                    // No-op
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    // No-op
                }

                override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    button.isEnabled = text?.isNotBlank() ?: false
                }
            })

        }
    }

    override fun getLayout() = R.layout.item_preference_edit_text

    abstract fun getButtonText(): String

    abstract fun execute(text: String?): () -> Unit

    abstract fun getInputType(): Int

}