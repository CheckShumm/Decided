package com.example.nathanshumm.decided.view.login;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.example.nathanshumm.decided.R;
import com.example.nathanshumm.decided.databinding.ActivityLaunchBinding;
import com.example.nathanshumm.decided.databinding.ActivityLoginBinding;
import com.example.nathanshumm.decided.databinding.ActivitySignUpBinding;
import com.example.nathanshumm.decided.viewmodel.launcher.LauncherViewModel;
import com.example.nathanshumm.decided.viewmodel.launcher.LauncherViewModelFactory;
import com.example.nathanshumm.decided.viewmodel.login.LoginViewModel;
import com.example.nathanshumm.decided.viewmodel.login.LoginViewModelFactory;
import com.example.nathanshumm.decided.viewmodel.signup.SignUpViewModel;
import com.example.nathanshumm.decided.viewmodel.signup.SignUpViewModelFactory;

public class LoginActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityLoginBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory()).get(LoginViewModel.class));
        setToolbar();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void setToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Log In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        window = this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimary));
    }
}
