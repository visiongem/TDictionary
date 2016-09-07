package com.yn.tdictionary.model;

/**
 * describtion:
 * Created by pengyn on 2016/9/7.
 */
public class WordResultBean {

    private String zi;          // 查询的汉字
    private String py;          // 拼音
    private String wubi;        // 五笔
    private String pinyin;      // 读音
    private String bushou;      // 部首
    private int bihua;       // 笔画数
    private String jijie;       // 简解
    private String xiangjie;    // 详解

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getWubi() {
        return wubi;
    }

    public void setWubi(String wubi) {
        this.wubi = wubi;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getBushou() {
        return bushou;
    }

    public void setBushou(String bushou) {
        this.bushou = bushou;
    }

    public int getBihua() {
        return bihua;
    }

    public void setBihua(int bihua) {
        this.bihua = bihua;
    }

    public String getJijie() {
        return jijie;
    }

    public void setJijie(String jijie) {
        this.jijie = jijie;
    }

    public String getXiangjie() {
        return xiangjie;
    }

    public void setXiangjie(String xiangjie) {
        this.xiangjie = xiangjie;
    }
}
