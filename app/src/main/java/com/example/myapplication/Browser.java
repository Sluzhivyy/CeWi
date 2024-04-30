package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Browser extends AppCompatActivity {

    private WebView webView;
    private Button backButton, forwardButton, refreshButton, sendButton;
    private EditText autoCompleteTextView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.browser);
        webView = findViewById(R.id.webView);
        backButton = findViewById(R.id.backButton);
        forwardButton = findViewById(R.id.forwardButton);
        refreshButton = findViewById(R.id.refreshButton);
        sendButton = findViewById(R.id.sendButton);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        progressBar = findViewById(R.id.progressBar);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (webView.canGoBack())
                    webView.goBack();
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (webView.canGoForward())
                    webView.goForward();
            }
        });

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.reload();
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = autoCompleteTextView.getText().toString();
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }
                webView.loadUrl(url);
            }
        });

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {progressBar.setProgress(newProgress);
                if (newProgress == 100)
                    progressBar.setVisibility(View.GONE);
                else
                    progressBar.setVisibility(View.VISIBLE);
            }
        });


        webView.loadUrl("https://www.google.com");
    }
}


