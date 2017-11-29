package bos7.guituner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FreeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Button freeButton;
    public Spinner spinnerFree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free);

        freeButton = (Button) findViewById(R.id.freeButton);
        spinnerFree = (Spinner) findViewById(R.id.spinnerFree);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.free, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFree.setAdapter(adapter);

        spinnerFree.setOnItemSelectedListener(this);


    }

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

        switch (position){

            case 0: //standard low E
                freeButton.setText(R.string.StandardE);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta6.start();
                    }

                });
                break;

            case 1: //standard A
                freeButton.setText(R.string.StandardA);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta5.start();
                    }
                });
                break;

            case 2: //standard D
                freeButton.setText(R.string.StandardD);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta4.start();
                    }
                });
                break;

            case 3: //standard G
                freeButton.setText(R.string.StandardG);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta3.start();
                    }
                });
                break;

            case 4: //standard B
                freeButton.setText(R.string.StandardB);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta2.start();
                    }
                });
                break;

            case 5: //standard High E
                freeButton.setText(R.string.StandardE);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sta1.start();
                    }
                });
                break;

            case 6: //open D low D
                freeButton.setText(R.string.StandardD);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend6.start();
                    }
                });
                break;

            case 7: //open D F#
                freeButton.setText(R.string.OpenDf);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend3.start();
                    }
                });
                break;

            case 8: //open D High A
                freeButton.setText(R.string.StandardA);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend2.start();
                    }
                });
                break;

            case 9: //open D High D
                freeButton.setText(R.string.StandardD);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        opend1.start();
                    }
                });
                break;

            case 10: //openG G
                freeButton.setText(R.string.StandardG);
                freeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openg5.start();
                    }
                });
                break;


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
