package com.example.webview

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webViewSetup(webView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webView: WebView){
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl("https://www.instagram.com/ayush_nargaye?igsh=MXVxb2lqaGRzcWdocA==")
        }
    }
}