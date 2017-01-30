package com.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * Created by User on 1/30/2017.
 */

public class DoctorActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_doctor);
    ButterKnife.bind(this);
  }
}
