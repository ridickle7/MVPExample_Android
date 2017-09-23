package yapp11th.devcamp.co.kr.mvpexample;

import android.app.Activity;

/**
 * Created by ridickle on 2017. 9. 23..
 */

public class MainPresenterImpl implements MainPresenter {
    private Activity activity;
    private MainModel mainModel;
    private MainPresenter.View view;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    @Override
    public void setView(MainPresenter.View view) {
        this.view = view;
    }

    @Override
    public void onConfirm() {
        if (view != null) {
            view.setConfirmText(mainModel.getClickedText());
        }
    }


}