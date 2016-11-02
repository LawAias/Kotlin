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
import sihuan.com.kotlin.net.bean.WeatherInfos

/**
 *sihuan.com.kotlin.adapter
 * Created by sihuan on 2016/11/1.
 */
class MyAdapter(val item: List<WeatherInfos.WeatherInfo>?, context: Context) : Adapter<MyAdapter.ViewHolder>() {
    val inflater: LayoutInflater
    val mContext: Context

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        mContext = context
    }

    override fun getItemCount(): Int = item?.size as Int

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_recyler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tv?.text = item?.get(position)?.weather?.get(0)?.main
        holder?.image?.setImageResource(R.mipmap.ic_launcher)
        holder?.rootview?.setOnClickListener {
//            mContext.startActivity(Intent(mContext,))
        }
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