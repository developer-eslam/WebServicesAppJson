package com.erpproject.androidapp.webservicesappjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btngetjson;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngetjson=(Button)findViewById(R.id.btngetjson);
        textView=(TextView)findViewById(R.id.textview);
        btngetjson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BachServerTask bachServerTask = new BachServerTask();
                bachServerTask.execute();

            }
        });
    }
}
