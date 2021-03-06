package com.appclr8.simpleweather.models

data class Hourly(
    var dt: Long = 0L, var temp: Double = 0.0, var feels_like: Double = 0.0, var pressure: Int = 0,
    var humidity: Int = 0, var dew_point: Double = 0.0, var clouds: Int = 0, var uvi: Double = 0.0,
    var visibility: Double = 0.0, var wind_speed: Double = 0.0, var wind_deg: Double = 0.0,
    var wind_gust: Double = 0.0, var weather: ArrayList<Weather> = ArrayList(), var pop: Double = 0.0
)
