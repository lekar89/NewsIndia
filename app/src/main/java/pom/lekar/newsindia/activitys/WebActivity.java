package pom.lekar.newsindia.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import pom.lekar.newsindia.R;

public class WebActivity extends AppCompatActivity {
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.setWebViewClient(new MyWebViewClient());

        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.loadUrl(getIntent().getStringExtra("web"));

    }
    private class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}
