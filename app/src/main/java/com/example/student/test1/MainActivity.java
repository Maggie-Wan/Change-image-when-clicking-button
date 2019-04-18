package com.example.student.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button pre,next;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pre=(Button)findViewById(R.id.pre);
        next=(Button)findViewById(R.id.next);
        img=(ImageView)findViewById(R.id.img);

    }
    int[] s={
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08};
    int i=-1;
    public void pre(View v){
        i--;
        if(i<0){i=s.length-1;}
        img.setImageResource(s[i]);

    }
    public void next(View v){
        i++;
        if(i==s.length){i=0;}
        img.setImageResource(s[i]);

    }
}
