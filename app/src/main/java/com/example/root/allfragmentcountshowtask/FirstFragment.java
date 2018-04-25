package com.example.root.allfragmentcountshowtask;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    private TextView count1_tv;
    private Button count1_btn;
    private Button change_btn;
    private MainActivity mMainActivity;
    int count1;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first, container, false);

        mMainActivity=(MainActivity)getActivity();

        count1_tv=(TextView)view.findViewById(R.id.count1_tv);
        count1_btn=(Button)view.findViewById(R.id.count1_btn);
        change_btn=(Button)view.findViewById(R.id.change_btn);

        count1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                count1_tv.setText(String.valueOf(count1));
                mMainActivity.countUpdate1(count1_tv.getText().toString());
            }
        });

        change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivity.change();
            }
        });

        return view;
    }

    public void countUpdate2(int mcount) {
        this.count1=mcount;
        count1_tv.setText(String.valueOf(count1));
    }

    public void countUpdate3(int mcount) {
        this.count1=mcount;
        count1_tv.setText(String.valueOf(count1));
    }
}
