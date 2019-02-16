package com.candidcold.yourfeed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.candidcold.preferences.PreferenceGroup
import com.candidcold.preferences.RecentlyUsedSection
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import javax.inject.Inject


class YourFeedActivity : AppCompatActivity() {

//    @Inject
//    lateinit var preferenceGroups: PreferenceGroup
//
//    private val recyclerView: RecyclerView by lazy {
//        findViewById<RecyclerView>(R.id.debug_settings_recyclerview)
//    }
//    private val groupAdapter = GroupAdapter<ViewHolder>()
//    private val linearLayoutManager: LinearLayoutManager by lazy {
//        LinearLayoutManager(this)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_feed)

//        (application as YourFeedApplication).component.inject(this)

//        recyclerView.apply {
//            layoutManager = linearLayoutManager
//            adapter = groupAdapter
//        }

//        RecentlyUsedSection.setTitle(R.string.debug_settings_recently_used)
//        groupAdapter.add(RecentlyUsedSection)
//        groupAdapter.addAll(preferenceGroups)
//        groupAdapter.add(preferenceGroups)

    }

}
