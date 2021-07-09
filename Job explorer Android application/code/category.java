package info.androidhive.loginandregistration.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import info.androidhive.loginandregistration.R;
import info.androidhive.loginandregistration.helper.SQLiteHandler;
import info.androidhive.loginandregistration.helper.SessionManager;

/**
 * Created by saihemanththota on 21-Oct-17.
 */

public class category extends AppCompatActivity{
    private Button bttnSE;
    private Button bttnCE;
    private Button bttnIN;
    private Button bttnGJ;
    private Button bttnMD;
    private Button bttnT;
    private Button bttnF;
    private Button bttnTC;
    private Button bttnOC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);


        bttnSE= (Button) findViewById(R.id.bttnSE);
        bttnCE= (Button) findViewById(R.id.bttnCE);
        bttnIN= (Button) findViewById(R.id.bttnIN);
        bttnGJ= (Button) findViewById(R.id.bttnGJ);
        bttnMD= (Button) findViewById(R.id.bttnMD);
        bttnT= (Button) findViewById(R.id.bttnT);
        bttnF= (Button) findViewById(R.id.bttnF);
        bttnTC= (Button) findViewById(R.id.bttnTC);
        bttnOC= (Button) findViewById(R.id.bttnOC);





    }

    /**
     * Logging out the user. Will set isLoggedIn flag to false in shared
     * preferences Clears the user data from sqlite users table
     * */



    public void onButtonClick(View view) {

        if (view.getId()==R.id.bttnSE) {

                Intent intent = new Intent(category.this,jobsearch.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnCE) {

            Intent intent = new Intent(category.this,jobsearch1.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnIN) {

            Intent intent = new Intent(category.this,jobsearch2.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnGJ) {

            Intent intent = new Intent(category.this,jobsearch3.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnMD) {

            Intent intent = new Intent(category.this,jobsearch4.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnT) {

            Intent intent = new Intent(category.this,jobsearch5.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnF) {

            Intent intent = new Intent(category.this,jobsearch6.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnTC) {

            Intent intent = new Intent(category.this,jobsearch7.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bttnOC) {

            Intent intent = new Intent(category.this,jobsearch8.class);
            startActivity(intent);
        }


    }
}

    



