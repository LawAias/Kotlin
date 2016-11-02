package sihuan.com.kotlin.net

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import sihuan.com.kotlin.net.bean.WeatherInfos

/**
 *sihuan.com.kotlin.net
 * Created by sihuan on 2016/11/2.
 */
interface WeatherService {
    //    http://api.openweathermap.org/data/2.5/forecast/daily?q=nanjing&mode=json&units=metric&cnt=7&appid=0b8912d482d43bce8d98340ac4ee5bb7
    @GET("data/2.5/forecast/daily")
    fun getWeatherInfo(@Query("q") city: String, @Query("nmode") mode: String, @Query("appid") appid: String): Observable<WeatherInfos>
}