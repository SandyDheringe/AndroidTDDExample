package com.sandeep.unittestingexample;

public class MainActivityPresenter implements MainActivityContract.Presenter
{

    MainActivityContract.View view;

    MainActivityInteractor mainActivityInteractor;

    public MainActivityPresenter(MainActivityContract.View view, MainActivityInteractor mainActivityInteractor)
    {
        this.view = view;
        this.mainActivityInteractor = mainActivityInteractor;
    }

    void validateUser(String uname, String pwd)
    {
        view.showProgress();

       // if(mainActivityInteractor.validateUser(uname, pwd))
        {
            view.hideProgress();
            view.showSuccessScreen();
        }


    }
}
