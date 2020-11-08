package com.example.passingperiod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Random;


public class MainActivity2 extends AppCompatActivity {

    String[] names = {"Kevin To", "Justin Ho", "Sebastian Garcia", "Fuga Obidi", "Tony Hawk", "Bob Joe", "Alyssa Kordvani",
            "Mushu Kordvani", "Joe Jonas", "Sam Smith", "Dominic Fike", "Jack Black", "Morgan Freeman", "Jimmy Neutron", "Timmy Turner", "Danny Phantom", "Joe Biden"};;


    ListView listView;
      public static String getRandom() {
          String[] names = {"Kevin To", "Justin Ho", "Sebastian Garcia", "Fuga Obidi", "Tony Hawk", "Bob Joe", "Alyssa Kordvani",
                  "Mushu Kordvani", "Joe Jonas", "Sam Smith", "Dominic Fike", "Jack Black", "Morgan Freeman", "Jimmy Neutron", "Timmy Turner", "Danny Phantom", "Joe Biden"};;

          int rnd = new Random().nextInt(names.length);
        return names[rnd];
    }
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listviewy);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);
    }
}