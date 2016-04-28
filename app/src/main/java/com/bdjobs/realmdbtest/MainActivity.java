package com.bdjobs.realmdbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.bdjobs.realmdbtest.RealmModelClass.Dog;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RealmConfiguration realmConfig = new RealmConfiguration.Builder(getApplicationContext()).build();
        Realm realm = Realm.getInstance(realmConfig);



        realm.beginTransaction();
        Dog myDog = realm.createObject(Dog.class);
        myDog.setName("Fido");
        myDog.setAge(1);
        realm.commitTransaction();

        RealmResults<Dog> puppies = realm.where(Dog.class).lessThan("age", 2).findAll();


        String a =String.valueOf(puppies.size());
        Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
    }
}
