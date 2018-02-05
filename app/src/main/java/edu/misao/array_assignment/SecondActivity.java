package edu.misao.array_assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView name,phone,email,pass,weight,gender;
    Button back,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );


        name = findViewById( R.id.tv1 );
        phone = findViewById( R.id.tv2 );
        email = findViewById( R.id.tv3 );
        pass = findViewById( R.id.tv4 );
        weight = findViewById( R.id.tv5 );
        gender = findViewById( R.id.tv6 );
        back = findViewById( R.id.btnBack );
        exit = findViewById( R.id.btnExit );

        back.setOnClickListener( this );
        exit.setOnClickListener( this );


        String s []  = new String[6];

        s[0] = getIntent().getStringExtra( "A" );
        s[1] = getIntent().getStringExtra( "B" );
        s[2] = getIntent().getStringExtra( "C" );
        s[3] = getIntent().getStringExtra( "D" );
        s[4] = getIntent().getStringExtra( "E" );
        s[5] = getIntent().getStringExtra( "G" );

        name.setText(s[0] );
        phone.setText(s[1] );
        email.setText(s[2] );
        pass.setText(s[3] );
        weight.setText(s[4] );
        gender.setText( s[5] );


    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnBack:
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity( intent );

                Toast.makeText(getApplicationContext(),"Pushed Back",Toast.LENGTH_LONG).show();
                break;

            case R.id.btnExit:
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory( Intent.CATEGORY_HOME );
                i.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity( i );
                finish();
                System.exit( 0 );
                break;
        }

    }
}
