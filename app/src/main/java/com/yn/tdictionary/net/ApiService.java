package com.yn.tdictionary.net;

import com.yn.tdictionary.model.BaseCallResultBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * describtion:
 * Created by pengyn on 2016/9/7.
 */

public interface  ApiService {

    public static final String HOST = "http://v.juhe.cn/";

    public static final String XHZD = HOST + "xhzd/";

    public static final String XYCD = HOST + "chengyu/";

    public static final String TODAY_ON_HISTORY = HOST +"todayOnhistory/";

    public static final String NEWS = HOST +"onebox/news/";

    @POST("query")
    Call<BaseCallResultBean> queryWord(@Query("word") String word, @Query("key") String key);

    @POST("bushou")
    Call<BaseCallResultBean> queryBushouList(@Query("key") String key);

    @POST("pinyin")
    Call<BaseCallResultBean> queryPinyinList(@Query("key") String key);

    @POST("querybs")
    Call<BaseCallResultBean> queryBs(@Query("word") String word, @Query("key") String key);

    @POST("querypy")
    Call<BaseCallResultBean> queryPy(@Query("word") String word, @Query("key") String key);

    @POST("queryid")
    Call<BaseCallResultBean> queryId(@Query("word") String word, @Query("key") String key);

    @POST("query")
    Call<BaseCallResultBean> queryIdiom(@Query("word") String word, @Query("key") String key);

    @GET("queryEvent.php")
    Call<BaseCallResultBean> queryTHistory(@Query("date") String date, @Query("key") String key);

    @GET("queryDetail.php")
    Call<BaseCallResultBean> queryTHistoryDetail(@Query("e_id") String e_id, @Query("key") String key);

    @GET("query")
    Call<BaseCallResultBean> queryNews(@Query("q") String q, @Query("key") String key);

    @GET("words")
    Call<BaseCallResultBean> queryNewsWords(@Query("key") String key);
}
