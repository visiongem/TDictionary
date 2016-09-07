package com.yn.tdictionary.model;

/**
 * describtion: 历史上的今天详情
 * Created by pengyn on 2016/9/7.
 */
public class TodayHistoryDetailBean {

    private int e_id;           // 事件id
    private String content;     // 事件详情
    private String picNo;       // 图片数量
    private String url;         // 图片地址
    private String title;       // 事件标题
    private String pic_title;   // 图片标题
    private int id;             // 图片顺序id

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicNo() {
        return picNo;
    }

    public void setPicNo(String picNo) {
        this.picNo = picNo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic_title() {
        return pic_title;
    }

    public void setPic_title(String pic_title) {
        this.pic_title = pic_title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
