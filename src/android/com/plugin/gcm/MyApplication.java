package com.plugin.gcm;

import com.parse.Parse;
import android.app.Application;

public class MyApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();

    Parse.enableLocalDatastore(this);

    Parse.initialize(this, "<PARSE_APP_ID>", "<PARSE_CLIENT_KEY>");
  }
}