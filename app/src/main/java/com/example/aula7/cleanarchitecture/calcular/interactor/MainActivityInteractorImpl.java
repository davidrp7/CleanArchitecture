package com.example.aula7.cleanarchitecture.calcular.interactor;

import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresente;

/**
 * Created by AULA 7 on 15/05/2018.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresente presente;

    public MainActivityInteractorImpl(MainActivityPresente presente) {
        this.presente = presente;
    }

    @Override
    public void sumar(String num1, String num2) {
        Integer result = Integer.valueOf(num1) + Integer.valueOf(num2);
        presente.showResult(String.valueOf(result));
    }
}
