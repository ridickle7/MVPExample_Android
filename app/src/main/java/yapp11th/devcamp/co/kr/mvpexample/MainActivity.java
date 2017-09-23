package yapp11th.devcamp.co.kr.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// View      는 실제 view 에 대한 직접적인 접근을 담당한다. (Activity)
//  1. 컴포넌트와 xml의 연계(ex> findViewById)와 해당 컴포넌트에 처리되는 작업(ex> setText) 은 여기에서 진행
//  2. View에서 발생하는 이벤트는 직접 핸들링하지만 이벤트 실질적인 처리는 Presenter 에 위임

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    private MainPresenter mainPresenter;
    private Button confirmButton;

    @Override
    public void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenterImpl(MainActivity.this);
        mainPresenter.setView(this);

        confirmButton = (Button) findViewById(R.id.btn_confirm);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.onConfirm();
            }
        });
    }

    // 3-1. 뷰의 이벤트와 매치되어 실행되는
    @Override
    public void setConfirmText(String text) {
        confirmButton.setText(text);
    }
}