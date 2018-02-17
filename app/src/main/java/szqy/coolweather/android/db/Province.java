package szqy.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 一非 on 2018/2/17.
 */

public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public Province(){}

    public Province(int id,String provincename,int provinceCode){
        this.id = id;
        this.provinceName = provincename;
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
