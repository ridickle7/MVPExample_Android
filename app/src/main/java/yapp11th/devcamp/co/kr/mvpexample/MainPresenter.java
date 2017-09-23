package yapp11th.devcamp.co.kr.mvpexample;

/**
 * Created by ridickle on 2017. 9. 23..
 */

// Presenter 는 실질적인 기능을 제어하는 곳으로써 ViewController 로써 이해하면 쉽다.

public interface MainPresenter {

    // 1. 뷰 설정
    void setView(MainPresenter.View view);

    // 2. 뷰 이벤트 확인
    void onConfirm();

    // 3. 뷰의 이벤트와 매치되어 실행할 이벤트 모음
    public interface View {
        void setConfirmText(String text);
    }

}