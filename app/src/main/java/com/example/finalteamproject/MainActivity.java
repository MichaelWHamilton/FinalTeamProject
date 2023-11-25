package com.example.finalteamproject;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.finalteamproject.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity
{

    private MainActivityBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=MainActivityBinding.inflate(getLayoutInflater());
        //View view=mBinding.getRoot();
        setContentView(R.layout.main_activity);

    }
}
