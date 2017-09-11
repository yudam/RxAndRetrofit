package view.com.rxandretrofit;

import java.util.HashMap;
import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/9/8.
 */

public interface WorkerApis {

    public static String apis="接口请自己选择";


    @GET("接口")
    Observable<List<LoginBean>> getLoginInfo(@QueryMap HashMap<String,String> map);

}
