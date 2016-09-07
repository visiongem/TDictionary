package com.yn.tdictionary.model;

/**
 * describtion: 历史上的今天
 * Created by pengyn on 2016/9/7.
 */
public class TodayHistoryBean {

    private String day;     // 日期
    private String date;    // 事件日期
    private int e_id;       // 事件id,即下一接口中所用的e_id
    private String title;   // 事件标题

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
