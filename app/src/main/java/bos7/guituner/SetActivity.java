package bos7.guituner;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SetActivity extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {

    //buttons======
    public Button sixStrBtn;
    public Button fifStrBtn;
    public Button fouStrBtn;
    public Button thrStrBtn;
    public Button secStrBtn;
    public Button firStrBtn;

    public Spinner spinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        //Buttons=========================
        sixStrBtn = (Button) this.findViewById(R.id.sixStrBtn);
        fifStrBtn = (Button) this.findViewById(R.id.fifStrBtn);
        fouStrBtn = (Button) this.findViewById(R.id.fouStrBtn);
        thrStrBtn = (Button) this.findViewById(R.id.thrStrBtn);
        secStrBtn = (Button) this.findViewById(R.id.secStrBtn);
        firStrBtn = (Button) this.findViewById(R.id.firStrBtn);

        //Spinner=========================
        spinner = (Spinner) this.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.another, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

// onItemSelected stuff start==================================
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // Standard Tuning
        final MediaPlayer sta6 = MediaPlayer.create(this, R.raw.standard_e1);
        final MediaPlayer sta5 = MediaPlayer.create(this, R.raw.standard_a2);
        final MediaPlayer sta4 = MediaPlayer.create(this, R.raw.standard_d3);
        final MediaPlayer sta3 = MediaPlayer.create(this, R.raw.standard_g4);
        final MediaPlayer sta2 = MediaPlayer.create(this, R.raw.standard_b5);
        final MediaPlayer sta1 = MediaPlayer.create(this, R.raw.standard_e26);

        //Open D
        final MediaPlayer opend6 = MediaPlayer.create(this, R.raw.dropped_d1);
        final MediaPlayer opend3 = MediaPlayer.create(this, R.raw.open_d_fsharp4);
        final MediaPlayer opend2 = MediaPlayer.create(this, R.raw.open_d_a5);
        final MediaPlayer opend1 = MediaPlayer.create(this, R.raw.open_d_d26);

        //Open G
        final MediaPlayer openg5 = MediaPlayer.create(this, R.raw.open_g2);





        switch (position) {
            case 0: //Standard Tuning eadgbE

                sixStrBtn.setText(R.string.StandardE);
                fifStrBtn.setText(R.string.StandardA);
                fouStrBtn.setText(R.string.StandardD);
                thrStrBtn.setText(R.string.StandardG);
                secStrBtn.setText(R.string.StandardB);
                firStrBtn.setText(R.string.StandardE);


                sixStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta6.start();

                    }
                });

                fifStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta5.start();

                    }
                });

                fouStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta4.start();

                    }
                });

                thrStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta3.start();

                    }
                });

                secStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta2.start();

                    }
                });

                firStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta1.start();

                    }
                });

                break;

            case 1: //Dropped D dagbE

                sixStrBtn.setText(R.string.StandardD);
                fifStrBtn.setText(R.string.StandardA);
                fouStrBtn.setText(R.string.StandardD);
                thrStrBtn.setText(R.string.StandardG);
                secStrBtn.setText(R.string.StandardB);
                firStrBtn.setText(R.string.StandardE);


                sixStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend6.start();

                    }
                });

                fifStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta5.start();

                    }
                });

                fouStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta4.start();

                    }
                });

                thrStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta3.start();

                    }
                });

                secStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta2.start();

                    }
                });

                firStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta1.start();

                    }
                });

                break;

            case 2: //Open D daDf#AD2

                sixStrBtn.setText(R.string.StandardD);
                fifStrBtn.setText(R.string.StandardA);
                fouStrBtn.setText(R.string.StandardD);
                thrStrBtn.setText(R.string.OpenDf);
                secStrBtn.setText(R.string.StandardA);
                firStrBtn.setText(R.string.StandardD);


                sixStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend6.start();

                    }
                });

                fifStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta5.start();

                    }
                });

                fouStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta4.start();

                    }
                });

                thrStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend3.start();

                    }
                });

                secStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend2.start();

                    }
                });

                firStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend1.start();

                    }
                });

                break;

            case 3: //Open G  dgDGBD2

                sixStrBtn.setText(R.string.StandardD);
                fifStrBtn.setText(R.string.StandardG);
                fouStrBtn.setText(R.string.StandardD);
                thrStrBtn.setText(R.string.StandardG);
                secStrBtn.setText(R.string.StandardB);
                firStrBtn.setText(R.string.StandardD);


                sixStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend6.start();

                    }
                });

                fifStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openg5.start();

                    }
                });

                fouStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta4.start();

                    }
                });

                thrStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta3.start();

                    }
                });

                secStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta2.start();

                    }
                });

                firStrBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend1.start();

                    }
                });

                break;


        }
        // Case End
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
// onItemSelected END ==================================
}

