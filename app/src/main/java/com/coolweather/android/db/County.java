package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terry.Tian on 2017/2/28 0028. 20:25
 * mail:1015236187@qq.com
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气id


    private int cityId;//市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
