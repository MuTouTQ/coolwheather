package com.coolweather.android.gson;

/**
 * Created by Terry.Tian on 2017/3/1 0001. 14:23
 * mail:1015236187@qq.com
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
