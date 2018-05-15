package com.example.aula7.cleanarchitecture.calcular.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aula7.cleanarchitecture.R;
import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresente;
import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private MainActivityPresente presenter;
    private EditText editText1;
    private EditText editText2;
    private TextView textVMs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // enlazado paquete presente con view
        presenter =  new MainActivityPresenterImpl(this);

        editText1 = (EditText) findViewById(R.id.id_edt_num1);
        editText2 = (EditText) findViewById(R.id.id_edt_num2);
        textVMs = (TextView) findViewById(R.id.id_tv_ms);

    }

    @Override
    public void showResult(String result) {
        textVMs.setText(result);

    }

    @Override
    public void showError(String error) {

    }

    public void onClickSuma(View view){
        presenter.suma(editText1.getText().toString(), editText2.getText().toString());

    }
}
