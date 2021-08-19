package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/*设计数据库的表结构
    province、county、city三个文件
*/

public class Province extends DataSupport {
    //id是每个实体类中都应该有的字段
    private int id;
    //privineName：省的名字
    private String provinceName;
    //provinceCode：省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
