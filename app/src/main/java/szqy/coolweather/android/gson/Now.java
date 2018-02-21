package szqy.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 一非 on 2018/2/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temerature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
