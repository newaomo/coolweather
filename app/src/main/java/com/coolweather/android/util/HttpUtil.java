package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 李嵩 on 2017/2/12.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String adderss,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adderss).build();
        client.newCall(request).enqueue(callback);
    }

}
