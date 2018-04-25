package com.example.root.allfragmentcountshowtask;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    private TextView count3_tv;
    private TextView count3_btn;
    int count3;
    private MainActivity mMainActivity;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_third, container, false);

        mMainActivity=(MainActivity)getActivity();

        count3_tv=(TextView)view.findViewById(R.id.count3_tv);
        count3_btn=(TextView)view.findViewById(R.id.count3_btn);

        count3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                count3_tv.setText(String.valueOf(count3));
                mMainActivity.countUpdate3(count3_tv.getText().toString());
            }
        });

        return view;
    }

    public void countUpdate1(int mcount) {
        this.count3=mcount;
        count3_tv.setText(String.valueOf(count3));
    }

    public void countUpdate2(int mcount) {
        this.count3=mcount;
        count3_tv.setText(String.valueOf(count3));
    }
}
