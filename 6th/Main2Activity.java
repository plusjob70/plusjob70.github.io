package com.example.mypage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://plusjob70.github.io/.");

}
}
