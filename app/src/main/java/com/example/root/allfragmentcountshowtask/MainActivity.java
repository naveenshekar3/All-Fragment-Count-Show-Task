package com.example.root.allfragmentcountshowtask;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends Activity {


    private FragmentManager mFragManager;
    private FirstFragment mFirstFrag;
    private FragmentTransaction mFragTransaction;
    private SecondFragment mSecFrag;
    private ThirdFragment mThirdFrag;
    int mcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSecFrag=new SecondFragment();
        mThirdFrag=new ThirdFragment();

        mFragManager=getFragmentManager();
        mFirstFrag=(FirstFragment)mFragManager.findFragmentById(R.id.fragment1);
        mFragTransaction=mFragManager.beginTransaction();
        mFragTransaction.add(R.id.myframe,mSecFrag);
        mFragTransaction.commit();

    }


    public void countUpdate1(String count1) {
        this.mcount=Integer.parseInt(String.valueOf(count1));
        if (mSecFrag.isResumed())
        {
            mSecFrag.countUpdate1(mcount);
        }
        else
        {
            mThirdFrag.countUpdate1(mcount);
        }


    }

    public void countUpdate2(String count2) {
        this.mcount=Integer.parseInt(String.valueOf(count2));
        mFirstFrag.countUpdate2(mcount);
        mThirdFrag.countUpdate2(mcount);
    }

    public void countUpdate3(String count3) {
        this.mcount=Integer.parseInt(String.valueOf(count3));
        mFirstFrag.countUpdate3(mcount);
        mSecFrag.countUpdate3(mcount);
    }

    public void change() {
        mFragTransaction=mFragManager.beginTransaction();
        if (mSecFrag.isResumed())
        {
            mThirdFrag=new ThirdFragment();
            mFragTransaction.replace(R.id.myframe,mThirdFrag);
        }
        else
        {
            mSecFrag=new SecondFragment();
            mFragTransaction.replace(R.id.myframe,mSecFrag);
        }
        mFragTransaction.commit();
    }
}
