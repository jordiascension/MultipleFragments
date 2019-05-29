package com.example.formexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.view.LayoutInflater;
import android.view.ViewGroup;


public class ArticleFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_article, container, false);

    }
}
