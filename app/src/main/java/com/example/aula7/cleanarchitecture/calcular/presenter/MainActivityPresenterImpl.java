package com.example.aula7.cleanarchitecture.calcular.presenter;

import com.example.aula7.cleanarchitecture.calcular.interactor.MainActivityInteractor;
import com.example.aula7.cleanarchitecture.calcular.interactor.MainActivityInteractorImpl;
import com.example.aula7.cleanarchitecture.calcular.view.MainActivity;
import com.example.aula7.cleanarchitecture.calcular.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresente {


    //enlaza paquete presente con interactor
    private MainActivityInteractor interactor;

    //**
    private MainActivityView view;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        view.showResult(result);

    }

    @Override
    public void showError(String error) {


    }

    @Override
    public void suma(String num1, String num2) {
        interactor.sumar(num1, num2);

    }
}
