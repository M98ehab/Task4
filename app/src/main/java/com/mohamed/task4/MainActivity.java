package com.mohamed.task4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText name = (EditText)findViewById(R.id.name);
        final EditText number = (EditText)findViewById(R.id.number);
        final Button show = (Button)findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showTab = new Intent(MainActivity.this,PreviewActivity.class);
               showTab.putExtra("name",name.getText().toString());
                showTab.putExtra("number",number.getText().toString());
                startActivity(showTab);
            }
        });
    }
}
