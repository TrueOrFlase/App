package com.example.android.OurApp;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DummyFragment extends Fragment
{
    public static final String ARG_SECTION_NUMBER = "section_number";

    // 该方法的返回值就是该Fragment显示的View组件
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = null;
        Bundle args = getArguments();
        switch(args.getInt(ARG_SECTION_NUMBER))
        {
            case 1:v = inflater.inflate(R.layout.firstpage, container, false);break;
            case 2:v = inflater.inflate(R.layout.secondpage, container, false);break;
            case 3:v = inflater.inflate(R.layout.thirdpage, container, false);break;
        }
        return v;
    }
}