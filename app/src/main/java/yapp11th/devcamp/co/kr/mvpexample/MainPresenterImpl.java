package yapp11th.devcamp.co.kr.mvpexample;

import android.app.Activity;

/**
 * Created by ridickle on 2017. 9. 23..
 */

// Presenter 는 실질적인 기능을 제어하는 곳으로써 ViewController 로써 이해하면 쉽다.
    
public class MainPresenterImpl implements MainPresenter {
    private Activity activity;
    private MainModel mainModel;
    private MainPresenter.View view;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    // 1. 뷰 설정
    @Override
    public void setView(MainPresenter.View view) {
        this.view = view;
    }

    // 2. 뷰 이벤트 확인
    @Override
    public void onConfirm() {
        if (view != null) {
            // 3. 뷰의 이벤트와 매치되어 실행할 이벤트
            view.setConfirmText(mainModel.getClickedText());
        }
    }


}