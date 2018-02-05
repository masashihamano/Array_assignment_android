package edu.misao.array_assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name,phone,email,pass,weight;
    Button submit;
    RadioGroup gender;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        name = findViewById( R.id.etName );
        phone = findViewById( R.id.etPhone );
        email = findViewById( R.id.etEmail );
        pass = findViewById( R.id.etPass );
        weight = findViewById( R.id.etWeight );
        submit = findViewById( R.id.btnSubmit );
        gender = findViewById( R.id.Gender );


        submit.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {

        int checked = gender.getCheckedRadioButtonId();
        radioButton =findViewById( checked );   //xmlにidをつけないとエラーになる

        String []a = new String[6];
        a[0]=name.getText().toString();
        a[1]=phone.getText().toString();
        a[2]=email.getText().toString();
        a[3]=pass.getText().toString();
        a[4]=weight.getText().toString();
        a[5]=radioButton.getText().toString();

//        String []a = new EditText[]{name, phone, email, pass, weight, radioButton}.getText().toString();　//←間違い

//        Intent intent =new Intent( MainActivity.this,SecondActivity.class ); //こっちでも良い
        Intent intent = new Intent( getApplicationContext(),SecondActivity.class );

        intent.putExtra( "A",a[0]);
        intent.putExtra( "B",a[1]);
        intent.putExtra( "C",a[2]);
        intent.putExtra( "D",a[3]);
        intent.putExtra( "E",a[4]);
        intent.putExtra( "G",a[5]);


//        for(int i=0;i<a.length;i++)
//        {
//            intent.putExtra(a[i]);
//        }


        startActivity( intent );


    }

}
