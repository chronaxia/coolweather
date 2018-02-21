package szqy.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 一非 on 2018/2/18.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;
    public class AQICity {
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
