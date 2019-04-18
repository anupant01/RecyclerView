package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);

        List<Contacts> contactsList =new ArrayList<>();
        contactsList.add(new Contacts("Aakash Shrestha","12345678",R.drawable.aakash));
        contactsList.add(new Contacts("Aashirman Joshi","12345678",R.drawable.aashirman));
        contactsList.add(new Contacts("Anmol KC","12345678",R.drawable.anmol));
        contactsList.add(new Contacts("Bhuwan KC","12345678",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dahayang Rai","12345678",R.drawable.dahayang));
        contactsList.add(new Contacts("Nischal Basnet","12345678",R.drawable.nischal));
        contactsList.add(new Contacts("Paul Shah","12345678",R.drawable.paul));
        contactsList.add(new Contacts("Pradeep Khadka","12345678",R.drawable.pradeep));
        contactsList.add(new Contacts("Rajesh Himal","12345678",R.drawable.rajesh));
        contactsList.add(new Contacts("Saugat Malla","12345678",R.drawable.saugat));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
