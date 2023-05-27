package continentalinvesment.securities.newcostumer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    private Button botonregistronuevousuario;
    private EditText correo, contrasena;
    private String cor,con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);

        botonregistronuevousuario = (Button) findViewById(R.id.botoninicioregistrocliente);
        correo = (EditText) findViewById(R.id.correelectronico);
        contrasena = (EditText) findViewById(R.id.contrasena);
        botonregistronuevousuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cor= correo.getText().toString();
                con= contrasena.getText().toString();
                System.out.println(cor);
                System.out.println(con);
                if(correo.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Username / Password Required", Toast.LENGTH_LONG).show();
                }else if (contrasena.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Username / Password Required", Toast.LENGTH_LONG).show();
                } else{
                    //proceed to login
                    LoginRequest loginRequest =  new LoginRequest();
                    loginRequest.setUsername(cor);
                    loginRequest.setPassword(con);
                    login(loginRequest);
                }

            }
        });
    }
    public void login(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall= ApiClient.getUserService().loginuser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                System.out.println("response    " + response);
                System.out.println("response.body()    " +response.body());
                System.out.println("response.code()    " +response.code());
                LoginResponse loginResponse = response.body();
                System.out.println("loginResponse.getcorreo    " +loginResponse.getCorreo());
                if(response.isSuccessful()){
                    if(loginResponse.getCorreo() == null){
                        Toast.makeText(MainActivity.this,"Correo/Contraseña Incorrecta", Toast.LENGTH_LONG).show();
                    } else  {
                        Toast.makeText(MainActivity.this,"selogrobeibi", Toast.LENGTH_LONG).show();
                        Intent  intent= new Intent(MainActivity.this,MenuInicialActivity.class).putExtra("data",loginResponse);
                        startActivity(intent);
                    }
                    //LoginResponse loginResponse = response.body();

                }else{
                    //LoginResponse loginResponse = response.body();
                    Toast.makeText(MainActivity.this,"noselogro   " + loginResponse, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,loginResponseCall +"", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"noselogro  peroniunpoco " + t, Toast.LENGTH_LONG).show();
            }
        });

    }
    /*            */
}