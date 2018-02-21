package szqy.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 一非 on 2018/2/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
