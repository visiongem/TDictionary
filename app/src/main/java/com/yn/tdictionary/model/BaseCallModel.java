package com.yn.tdictionary.model;

/**
 * 基类实体类
 * Created by yanni on 2016/7/12.
 */
public class BaseCallModel<T>{
    public int error_code;
    public String reason;
    public T result;
}