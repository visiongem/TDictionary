package com.yn.tdictionary.model;

/**
 * describtion: 部首列表
 * Created by pengyn on 2016/9/7.
 */
public class BushouResultBean {

    private String id;
    private String bihua;   // 笔画数
    private String bushou;  // 部首

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBihua() {
        return bihua;
    }

    public void setBihua(String bihua) {
        this.bihua = bihua;
    }

    public String getBushou() {
        return bushou;
    }

    public void setBushou(String bushou) {
        this.bushou = bushou;
    }
}
