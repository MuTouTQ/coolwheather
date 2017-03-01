package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Terry.Tian on 2017/3/1 0001. 14:19
 * mail:1015236187@qq.com
 */

public class Basic  {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
