package com.example.theobaldo.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Principal extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        firebaseAuth = FirebaseAuth.getInstance();

        //Login Usuario

        /*firebaseAuth.signInWithEmailAndPassword("renato@gmail.com", "123456")
                .addOnCompleteListener(Principal.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Log.i("signIn", "Sucesso ao Logar");
                        } else {
                            Log.i("signIn", "Erro ao Logar");

                        }

                    }
                });*/

        //Verifica Usuário

       if (firebaseAuth.getCurrentUser() != null){

        Log.i("verificarusuario", "Usuario  Logado");

    }else{
        Log.i("verificarusuario", "Usuario não Logado" );

    }

        //cadastro
       /* firebaseAuth.createUserWithEmailAndPassword("renato@gmail.com" , "123456")
                .addOnCompleteListener(Principal.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            Log.i("createUser", "Sucesso ao Cadastrar Usuario");
                        }else{
                            Log.i("createUser", "Erro ao Cadastrar Usuario");

                        }

                    }
                });*/
    }
}