package com.sandeep.unittestingexample;

public class MainActivityInteractor
{

    public MainActivityInteractor()
    {
    }


    boolean validateUser(String userName, String password)
    {

        return userName.equalsIgnoreCase(password);
    }
}
