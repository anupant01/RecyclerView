package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {


    CircleImageView circimg;
    TextView tvfullname, tvphoneno,tvemailad, tvaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circimg=findViewById(R.id.circimg);
        tvfullname=findViewById(R.id.tvfullname);
        tvphoneno=findViewById(R.id.tvphoneno);
        tvaddress=findViewById(R.id.tvaddress);
        tvemailad=findViewById(R.id.tvemailad);


        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){

            circimg.setImageResource(bundle.getInt("image"));
            tvfullname.setText(bundle.getString("name"));
            tvphoneno.setText(bundle.getString("phone"));
            tvemailad.setText(bundle.getString("email"));
            tvaddress.setText(bundle.getString("address"));

        }

    }
}
