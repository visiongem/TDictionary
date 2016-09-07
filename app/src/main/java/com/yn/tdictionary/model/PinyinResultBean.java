package com.yn.tdictionary.model;

/**
 * describtion: 拼音列表
 * Created by pengyn on 2016/9/7.
 */
public class PinyinResultBean {

    private String id;
    private String pinyin_key;  // 拼音首字母
    private String pinyin;      // 拼音

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPinyin_key() {
        return pinyin_key;
    }

    public void setPinyin_key(String pinyin_key) {
        this.pinyin_key = pinyin_key;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
