package sihuan.com.kotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import sihuan.com.kotlin.R
import sihuan.com.kotlin.adapter.MyAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)
        val items = resources.getStringArray(R.array.items)
        var list = items.asList()
        recycler_view.adapter = MyAdapter(list!!, this)
    }
}
