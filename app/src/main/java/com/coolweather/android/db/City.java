package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terry.Tian on 2017/2/28 0028. 20:21
 * mail:1015236187@qq.com
 */

public class City extends DataSupport{

    private int id;
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//省的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
