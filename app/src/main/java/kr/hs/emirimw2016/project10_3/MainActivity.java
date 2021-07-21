package kr.hs.emirimw2016.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btncall = findViewById(R.id.btn_call);
        Button btnfinish = findViewById(R.id.btn_finish);

        btncall.setOnClickListener(btnListener);
        btnfinish.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.btn_call:
                    break;
                case R.id.btn_finish:
                    break;
            }
        }
    };
}