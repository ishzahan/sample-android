package com.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }
  @OnClick(R.id.btn_doctor)
  public void doctor(){
    Intent intent=new Intent(this,DoctorActivity.class);
    startActivity(intent);

  }
  @OnClick(R.id.btn_woman)
  public void woman(){
    Intent intent=new Intent(this,WomanRegistrationActivity.class);
    startActivity(intent);
  }
}
