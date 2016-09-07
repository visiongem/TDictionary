package com.yn.tdictionary.model;

/**
 * 基类实体类
 * Created by yanni on 2016/7/12.
 */
public class BaseCallResultBean {

    private String reason;      // 返回说明
    private String result;      // 返回结果集
    private String error_code;  // 返回码

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }
}