package com.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 1/30/2017.
 */

public class WomanRegistrationActivity extends AppCompatActivity {

  @BindView(R.id.layout_woman) LinearLayout mLayoutWoman;
  @BindView(R.id.radio_woman) RadioButton mWoman;
  @BindView(R.id.radio_other) RadioButton mOther;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_woman_registration);
    ButterKnife.bind(this);
  }

  @Override protected void onStart() {
    super.onStart();
    mLayoutWoman.setVisibility(View.GONE);
  }

  @OnClick(R.id.radio_woman) public void woman() {
    if (mOther.isChecked()) {
      mOther.setChecked(false);
      mLayoutWoman.setVisibility(View.VISIBLE);
    }
  }

  @OnClick(R.id.radio_other) public void other() {
    if (mWoman.isChecked()) {
      mWoman.setChecked(false);
      mLayoutWoman.setVisibility(View.GONE);
    }
  }
  @OnClick(R.id.btn_woman_save) public void womanReg() {
    Intent intent = new Intent(this, WomanActivity.class);
    startActivity(intent);
  }
}