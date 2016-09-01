package com.yn.tdictionary.model;

import android.support.v7.util.SortedList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by yanni on 2016/7/12.
 */
public abstract class MyCallback<T extends BaseCallModel> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        if (response.raw().code() == 200) {    // 200是服务器有合理响应
//            if(response.body().errno == 0){
//                onSuc(response);
//            }else if(response.body().errno == 1){
//
//            }else if(response.body.errno == 2){
//
//            }
//            // ...
//            else{
//                onFail(response.body().msg);
//            }
//        }else{
//            onFailure(call, new RuntimeException("response error, detail = " + response.raw().toString()));
//        }
        }
    }
}