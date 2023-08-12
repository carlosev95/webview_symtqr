package com.example.symtqr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val visor = findViewById<WebView>(R.id.web)

        visor.webChromeClient = object : WebChromeClient(){

        }

        visor.webViewClient = object : WebViewClient(){

        }

        val settings:WebSettings = visor.settings
        settings.javaScriptEnabled = true

        visor.loadUrl("192.168.100.4:8000")
    }
}