package yapp11th.devcamp.co.kr.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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

    @Override
    public void setConfirmText(String text) {
        confirmButton.setText(text);
    }
}