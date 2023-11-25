package com.example.finalteamproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalteamproject.databinding.SignInBinding;

public class SignInActivity extends AppCompatActivity
{
    private  SignInBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=SignInBinding.inflate(getLayoutInflater());
        //View view=mBinding.getRoot();
        setContentView(R.layout.sign_in);

    }
}
