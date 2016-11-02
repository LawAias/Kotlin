package sihuan.com.kotlin.net.bean

/**
 *sihuan.com.kotlin.net.bean
 * Created by sihuan on 2016/11/2.
 */
open class WeatherInfos {
    open var city: City? = null
    open var cod: Int = 0
    open var message: Float = 0.0f
    open var list: List<WeatherInfo>? = null

    open class City {
        open var id: Int = 0

        open var name: String? = null

        open var country: String? = null

        open var population: Int = 0
    }


    open class WeatherInfo {
        open var temp: Tmep? = null
        open var pressure: Float? = 0.0f
        open var humidity: Int = 0
        open var speed: Float = 0.0f
        open var deg: Int = 0
        open var clouds: Int = 0
        open var weather: List<Weather>? = null

        open class Weather {
            open var id: Int = 0
            open var main: String? = null
            open var description: String? = null
            open var icon: String? = null

        }

        open class Tmep {
            open var day: Float = 0.0f
            open var min: Float = 0.0f
            open var max: Float = 0.0f
            open var night: Float = 0.0f
            open var eve: Float = 0.0f
            open var morn: Float = 0.0f
        }
    }

}