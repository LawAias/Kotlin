package sihuan.com.kotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import sihuan.com.kotlin.R
import sihuan.com.kotlin.adapter.MyAdapter
import sihuan.com.kotlin.net.WeatherService

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)
        val items = resources.getStringArray(R.array.items)
        val list = items.asList()


        val retrofit: Retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.openweathermap.org/")
                .build()

        val weatherService: WeatherService = retrofit.create(WeatherService::class.java)
        weatherService.getWeatherInfo("Nanjing", "json", "0b8912d482d43bce8d98340ac4ee5bb7")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { weatherInfos ->
                    recycler_view.adapter = MyAdapter(weatherInfos.list, this)

                }


    }
}
