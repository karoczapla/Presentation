package com.example.presentation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class IntroFragment extends Fragment
{
    WebView webView;
    WebSettings webSettings;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_intro, null);
        webView = (WebView)inf.findViewById(R.id.webView);
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String htmlText = " %s ";
        String myData = "<html><body style=\"text-align:justify; color:#126A7C\">College student pursuing a Bachelor of Engineering degree in Computer Science. " +
                "Spends free time creating Android apps with AndroidStudio and 3D models with Blender. Currently looking for an internship in Fall and/or Winter 2019/20.</body></Html>";
        webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");
        webView.setBackgroundColor(getResources().getColor(R.color.colorLighterBg));
        return inf;
    }
}
