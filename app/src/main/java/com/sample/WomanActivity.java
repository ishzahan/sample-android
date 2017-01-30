package com.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 1/30/2017.
 */

public class WomanActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_woman);
    ButterKnife.bind(this);
  }
  @OnClick(R.id.btn_woman_reg)
  public void womanReg(){
    Intent intent=new Intent(this,WomanRegistrationActivity.class);
    startActivity(intent);
    finish();
  }
}
