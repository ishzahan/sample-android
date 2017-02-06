package com.sample;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by User on 2/6/2017.
 */

public class HospitalSearchActivity extends Activity {
  private final String TAG= HospitalSearchActivity.class.getName();
  @Override public void onCreate(Bundle savedInstanceState) {

    handleIntent(getIntent());
  }

  @Override protected void onNewIntent(Intent intent) {
    handleIntent(intent);
  }

  private void handleIntent(Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
      String query = intent.getStringExtra(SearchManager.QUERY);
      Log.i(TAG,"query : "+query);
    }
  }
}