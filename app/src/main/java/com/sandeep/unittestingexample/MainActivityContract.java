package com.sandeep.unittestingexample;

public class MainActivityContract
{

    public interface View
    {
        void showProgress();

        void hideProgress();

        void showMessage(String msg);

        void showSuccessScreen();

    }

    public interface Presenter
    {

    }
}
