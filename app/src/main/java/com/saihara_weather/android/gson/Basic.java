package com.saihara_weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/10/18 0018.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
