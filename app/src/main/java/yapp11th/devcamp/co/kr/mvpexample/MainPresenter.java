package yapp11th.devcamp.co.kr.mvpexample;

/**
 * Created by ridickle on 2017. 9. 23..
 */

public interface MainPresenter {

    void setView(MainPresenter.View view);

    void onConfirm();

    public interface View {
        void setConfirmText(String text);
    }

}