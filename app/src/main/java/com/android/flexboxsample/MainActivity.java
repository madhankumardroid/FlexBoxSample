package com.android.flexboxsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFlexBoxLayoutOne(View view) {
        Intent intent = new Intent(getApplicationContext(), FlexBoxLayoutOne.class);
        startActivity(intent);
    }

    public void onClickFlexBoxLayoutTwo(View view) {
        Intent intent1 = new Intent(getApplicationContext(), FlexBoxLayoutTwo.class);
        startActivity(intent1);
    }

    public void OnClickFlexBoxLayoutThree(View view) {
        Intent intent2 = new Intent(getApplicationContext(), FlexBoxLayoutThree.class);
        startActivity(intent2);
    }
}
