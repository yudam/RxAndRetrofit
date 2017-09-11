package view.com.rxandretrofit;

import java.util.HashMap;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/9/8.
 */

public class RxJavaRequest {

    public RetrofitRequest retrofitRequest=new RetrofitRequest();

    public WorkerApis workerApis;


    public void getRequestDatas(HashMap map, Subscriber subscriber){

        workerApis=retrofitRequest.getRetrofit().create(WorkerApis.class);


        workerApis.getLoginInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);


    }
}
