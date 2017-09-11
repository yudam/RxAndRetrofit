package view.com.rxandretrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/9/8.
 */

public class RetrofitRequest {

    public Retrofit retrofit;


    public Retrofit getRetrofit(){

        retrofit=new Retrofit.Builder()
                .baseUrl(WorkerApis.apis)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getOkHttpClient())
                .build();

        return retrofit;
    }

    public OkHttpClient getOkHttpClient(){

        OkHttpClient okHttpClient=new OkHttpClient();

        //设置超时时间
        okHttpClient.newBuilder().connectTimeout(10, TimeUnit.SECONDS);

        return  okHttpClient;
    }
}
