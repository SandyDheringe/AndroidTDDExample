package com.sandeep.unittestingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View
{

    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etMobileNumber)
    EditText etNumber;

    @BindView(R.id.btnLogin)
    Button  btnLogin;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgress()
    {
        Log.d(TAG, "showProgress: ");
    }

    @Override
    public void hideProgress()
    {
        Log.d(TAG, "hideProgress: ");
    }

    @Override
    public void showMessage(String msg)
    {
        Log.d(TAG, "showMessage: ");
    }

    @Override
    public void showSuccessScreen()
    {
        Log.d(TAG, "showSuccessScreen: ");
    }
}
