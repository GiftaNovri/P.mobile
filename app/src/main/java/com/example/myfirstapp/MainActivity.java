package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstapp.pertemuan5.ListActivity;
import com.example.myfirstapp.pertemuan5.RecyclerActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variabel
        final TextView txtView = (TextView)findViewById(R.id.mainActivityTextView);
        Button myBtn = (Button)findViewById(R.id.btnEnter);
        final EditText myEditText = (EditText)findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);

        //pertemuan2
        Button btnList = (Button)findViewById(R.id.buttonListView);
        Button btnRecycler = (Button)findViewById(R.id.buttonRecyclerView);
        Button btnCard = (Button)findViewById(R.id.buttonCardView);

        //action
        txtView.setText(R.string.text_hello_world);
        myBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               // Log.d("COBA KLIKK ZEYENG", myEditText.getText().toString());
                txtView.setText(myEditText.getText().toString());
            }
        });
    btnHelp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
               Intent intent = new Intent( MainActivity.this,HelpActivity.class);;
            Bundle b = new Bundle();

            b.putString("help_string",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    });
    btnList.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            startActivity(intent);
        }
    });
    btnRecycler.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
            startActivity(intent);
        }
    });

    }

}