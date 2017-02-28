package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Terry.Tian on 2017/2/28 0028. 20:25
 * mail:1015236187@qq.com
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private int countyCode;//县的代号
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

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
