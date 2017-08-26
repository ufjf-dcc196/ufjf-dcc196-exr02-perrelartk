package br.ufjf.dcc196.dcc196exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button botaosoma;
    private Button botaosubtrair;
    private Button botaomultiplicar;
    private Button botaodividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //1- Encontre os componentes de entrada
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        //2- Procure os compenentes de saída
        resultado = (TextView) findViewById(R.id.resultado);

        //3- Procure os componentes de controle
        botaosoma = (Button) findViewById(R.id.soma);
        botaosubtrair = (Button) findViewById(R.id.subtrair);
        botaomultiplicar = (Button) findViewById(R.id.multiplicar);
        botaodividir = (Button) findViewById(R.id.dividir);

        //4- Configurar os ouvintes para eventos
        Ouvinte ouvinteInstancia = new Ouvinte();
        Ouvintedois  ouvinteInstancia2 = new Ouvintedois();
        Ouvintetres  ouvinteInstancia3 = new Ouvintetres();
        Ouvintequatro  ouvinteInstancia4 = new Ouvintequatro();
        botaosoma.setOnClickListener(ouvinteInstancia);
        botaosubtrair.setOnClickListener(ouvinteInstancia2);
        botaomultiplicar.setOnClickListener(ouvinteInstancia3);
        botaodividir.setOnClickListener(ouvinteInstancia4);
    }

    private class Ouvinte implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());
            Integer soma = n1+n2;

            resultado.setText("A soma de "+n1+" + "+n2+" eh: "+soma);
        }
    }

    private class Ouvintedois implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());
            Integer subtrair = n1-n2;

                resultado.setText("A soma de "+n1+" + "+n2+" eh: "+subtrair);
        }
    }

    private class Ouvintetres implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());
            Integer multiplicar = n1*n2;

                resultado.setText("A soma de "+n1+" + "+n2+" eh: "+multiplicar);
        }
    }

    private class Ouvintequatro implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());
            Integer dividir = n1/n2;

                resultado.setText("A soma de "+n1+" + "+n2+" eh: "+dividir);
        }
    }
}
