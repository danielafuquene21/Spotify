package com.spotify;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Login  {

    public static final int MULTIPLE_PERMISSIONS = 10;
    Button ingresar;
    private ProgressDialog progressDialog;
    String usuarioActual = null;
    Font font = null;
    public Dialog dialogo;
    public Boolean bandera = false;
    private Intent intentMemoryService;
    String retornoPlaca = "";
    String placaSel = "";
    private ProgressBar progressBar;
    private long lastClickTime = 0;
    String sesion;


    private ArrayList<Sesion> sesions;

    private MiFirebaseInstanceIdService refrescarToken;
//    Button registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login__vigia);
        getSupportActionBar().hide();

        //refrescarToken = new MiFirebaseInstanceIdService();

        //RECUPERAR ELEMENTOS
        ingresar = (Button) findViewById(R.id.btnIngresarLogin);
        //EVENTOS ONCLICK
        ingresar.setOnClickListener(this);

        refrescarToken = new MiFirebaseInstanceIdService();


    }

}
