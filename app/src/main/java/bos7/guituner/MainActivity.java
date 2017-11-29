package bos7.guituner;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {

    private ImageButton imBuSet;
    private ImageButton imBuFree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ============Front image Buttons================
        imBuSet = (ImageButton) findViewById(R.id.imBuSet);
        imBuFree = (ImageButton) findViewById(R.id.imBuFree);
        imBuSet.setOnClickListener(this);
        imBuFree.setOnClickListener(this);
        // ====== Image Buttons set to onClick=====
    }

    //==========onClick Function=========
    public void onClick(View v){
        //====Switch statement for multiple intents because that's how I got it to work...
        switch (v.getId()){
        //==Intent for set screen
            case R.id.imBuSet:
                Intent intentSet = new Intent(this, SetActivity.class);
                startActivity(intentSet);
                break;
        //==intent for free screen
            case R.id.imBuFree:
                Intent intentFree = new Intent(this, FreeActivity.class);
                startActivity(intentFree);
                break;

            default:
                break;
        }

    }


}
