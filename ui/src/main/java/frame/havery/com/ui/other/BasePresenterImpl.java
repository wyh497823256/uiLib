package frame.havery.com.ui.other;



import rx.Subscription;

/**
 * ClassName: BasePresenterBasePresenterImpl<p>
 * Author:oubowu<p>
 * Fuction: 代理的基类实现<p>
 * CreateDate:2016/2/14 1:45<p>
 * UpdateUser:<p>
 * UpdateDate:<p>
 */
public class BasePresenterImpl<T extends BaseView> implements BasePresenter {

    protected Subscription mSubscription;
    protected T mView;

    public BasePresenterImpl(T view) {
        mView = view;
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onDestroy() {
        if (mSubscription != null && !mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
        mView = null;
    }




}
