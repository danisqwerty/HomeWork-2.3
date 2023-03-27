package com.example.homework23;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   double ticketAdults = 70;
   double ticketChild = 70*0.50;
   double ticketElder = 70*0.30;


   int adults = 9;
   int child = 11;
   int elder = 5;

   double ticketPriceAdults = ticketAdults * adults;
   double ticketPriceChild = ticketChild * child;
   double ticketPriceElder = ticketElder * elder;

   double ticketPriceAll = ticketPriceAdults + ticketPriceChild + ticketPriceElder;


    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketElderOut ;
    private TextView railwayTicketTotalOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);
        railwayTicketElderOut = findViewById(R.id.railwayTicketElderOut);


        railwayTicketOut.setText(ticketPriceAdults + " монет");
        railwayTicketChildOut.setText(ticketPriceChild + " монет");
        railwayTicketElderOut.setText(ticketPriceElder + " монет");
        railwayTicketTotalOut.setText(ticketPriceAll + " монет");
    }
}