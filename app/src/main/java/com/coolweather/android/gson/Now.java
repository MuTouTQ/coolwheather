package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Terry.Tian on 2017/3/1 0001. 14:24
 * mail:1015236187@qq.com
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
