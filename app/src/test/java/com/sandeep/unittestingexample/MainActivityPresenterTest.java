package com.sandeep.unittestingexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class MainActivityPresenterTest
{

    @Mock
    private MainActivityInteractor  mainActivityInteractor;
    @Mock
    private MainActivityContract.View view;

    @Mock
    private MainActivityPresenter mainActivityPresenter;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
        mainActivityPresenter = new MainActivityPresenter(view,mainActivityInteractor);

    }


    @Test
    public void validateUser()
    {
        mainActivityPresenter.validateUser("sandy","sandy");
        Mockito.verify(view).showSuccessScreen();
    }


    @After
    public void tearDown() throws Exception
    {
    }
}