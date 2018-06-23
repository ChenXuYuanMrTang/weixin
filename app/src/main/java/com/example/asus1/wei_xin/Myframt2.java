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
public class Myframt2 extends Fragment{

    private String cen;

    public Myframt2(String cen){
        this.cen = cen;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);

        TextView txt_content = (TextView) view.findViewById(R.id.tvfr);

        txt_content.setText(cen);
        return view;
    }
}
