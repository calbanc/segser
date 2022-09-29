package com.devsoft.segser;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



import com.google.android.material.textfield.TextInputEditText;

import id.ionbit.ionalert.IonAlert;


public class MainActivity extends AppCompatActivity {
    TextInputEditText txtusuario,txtclave;
    Button btningresar;
//    AsyncHttpClient client;
    //RequestParams params;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtusuario=findViewById(R.id.txtusuario);
        txtclave=findViewById(R.id.txtclave);
        btningresar=findViewById(R.id.btningresar);
     //  client=new AsyncHttpClient();
      //  params=new RequestParams();

        btningresar.setOnClickListener(view -> {
            if(txtusuario.getText().toString().isEmpty()||txtclave.getText().toString().isEmpty()){
                new IonAlert(MainActivity.this,IonAlert.ERROR_TYPE)
                        .setTitleText("SEGSER SEGURIDAD")
                        .setContentText("DEBE INGRESAR USUARIO Y CLAVE")
                        .show();
            }else{
                String usuario=txtusuario.getText().toString().trim().replaceAll(" ","%20");
                String clave=txtclave.getText().toString().trim().replaceAll(" ","%20");
                login(usuario,clave);
            }
        });
    }

    private void login(String usuario, String clave) {

        String url=Global.url+"login";

    }
}