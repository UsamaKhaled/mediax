package com.usama2.mediax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_start;
    private Button btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = findViewById(R.id.btn_start);
        btn_stop  = findViewById(R.id.btn_stop);
        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, PlayerService.class);

        switch (v.getId()){
            case R.id.btn_start:

                startService(intent);
                break;

            case R.id.btn_stop:
                stopService(intent);
                break;
        }
    }
}
