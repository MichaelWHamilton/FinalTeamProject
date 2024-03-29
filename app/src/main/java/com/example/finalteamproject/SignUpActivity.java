package com.example.finalteamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalteamproject.databinding.SignUpBinding;

public class SignUpActivity extends AppCompatActivity
{

    private SignUpBinding mBinding;

    private Button signUpButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=SignUpBinding.inflate(getLayoutInflater());
        //View view=mBinding.getRoot();
        setContentView(R.layout.sign_up);

        signUpButton=findViewById(R.id.SignUpButton_SignUp);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

    }


}
