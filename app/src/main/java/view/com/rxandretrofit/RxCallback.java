package view.com.rxandretrofit;

import rx.Subscriber;

/**
 *回调接口
 */

public abstract  class RxCallback<T> extends Subscriber<T> {

    public abstract void onSuccess(T t);

    public abstract  void onFails(Throwable t);

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

        onFails(e);
    }

    @Override
    public void onNext(T t) {

        onSuccess(t);
    }
}
