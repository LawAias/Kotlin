package sihuan.com.kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import sihuan.com.kotlin.R

/**
 *sihuan.com.kotlin.adapter
 * Created by sihuan on 2016/11/1.
 */
class MyAdapter(val item: List<String>, val context: Context) : Adapter<MyAdapter.ViewHolder>() {
    var inflater: LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getItemCount(): Int = item.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = inflater.inflate(R.layout.item_recyler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tv?.text = item.get(position)
        holder?.image?.setImageResource(R.mipmap.ic_launcher)
    }


    class ViewHolder(val rootview: View) : RecyclerView.ViewHolder(rootview) {
        var tv: TextView? = null
        var image: ImageView? = null

        init {
            image = rootview.findViewById(R.id.image) as ImageView?
            tv = rootview.findViewById(R.id.tv) as TextView?
        }


    }


}