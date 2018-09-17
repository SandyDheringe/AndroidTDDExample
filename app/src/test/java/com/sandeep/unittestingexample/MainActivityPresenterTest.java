package com.sandeep.unittestingexample;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MainActivityPresenterTest
{

    @Mock
    private MainActivityInteractor mainActivityInteractor;

    @Mock
    private MainActivityContract.View view;

    @Mock
    private MainActivityPresenter mainActivityPresenter;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        mainActivityPresenter = new MainActivityPresenter(view, mainActivityInteractor);
    }

    @Test
    public void validateVerifyUserAndPwd_InputNull_ReturnFalse()
    {
        Assert.assertThat(mainActivityPresenter.verifyUserName(null), CoreMatchers.is(false));
        Assert.assertThat(mainActivityPresenter.verifyPassword(null), CoreMatchers.is(false));
    }

    @Test
    public void validateVerifyUserAndPwd_InputEmpty_ReturnFalse()
    {
        Assert.assertThat(mainActivityPresenter.verifyUserName(""), CoreMatchers.is(false));
        Assert.assertThat(mainActivityPresenter.verifyPassword(""), CoreMatchers.is(false));
    }

    @Test
    public void validateUserName_InputEmpty_ShowError()
    {
        Mockito.when(view.getUserName()).thenReturn("");
        mainActivityPresenter.validateUser();
        Mockito.verify(view).showUserNameIncorrect(R.string.app_name);
    }

    @Test
    public void validatePassword_InputEmpty_ShowError()
    {
        Mockito.when(view.getUserName()).thenReturn("sandy");
        Mockito.when(view.getPassword()).thenReturn("");
        mainActivityPresenter.validateUser();
        Mockito.verify(view).showPasswordIncorrect(R.string.app_name);
    }

    @Test
    public void validateUser_InputIncorrect_ShowErrorScreen()
    {
        Mockito.when(view.getUserName()).thenReturn("sandy");
        Mockito.when(view.getPassword()).thenReturn("sandy1");
        mainActivityPresenter.validateUser();
        Mockito.verify(view).showErrorScreen();
    }

    @Test
    public void validateUser_InputCorrect_ShowSuccessScreen()
    {
        Mockito.when(view.getUserName()).thenReturn("sandy1");
        Mockito.when(view.getPassword()).thenReturn("sandy1");
        mainActivityPresenter.validateUser();
        Mockito.verify(view).showErrorScreen();
    }

    @After
    public void tearDown()
    {
    }
}