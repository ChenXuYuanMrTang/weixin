package com.example.asus1.wei_xin;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {


    private String content;
    private String titles;

    public MyFragment(String content,String titles) {
        this.content = content;
        this.titles = titles;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);

        TextView txt_content = (TextView) view.findViewById(R.id.tvfr);
        TextView title_txt = (TextView) view.findViewById(R.id.titlex);

        title_txt.setText(titles);
        txt_content.setText(content);
        return view;
    }
}
