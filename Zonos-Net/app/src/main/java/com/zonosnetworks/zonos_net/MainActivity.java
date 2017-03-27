package com.zonosnetworks.zonos_net;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
public class MainActivity extends AppCompatActivity {
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2500);
        viewFlipper.startFlipping();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu_3dot,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.main_screen) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
        return true;
    }


        if (id == R.id.event_information) {
            Intent eventInfo = new Intent(this, Event_Info.class);
            startActivity(eventInfo);
            return true;
        }

        if (id == R.id.when_and_where) {
            Intent when_Where = new Intent(this, WhenAndWhere.class);
            startActivity(when_Where);
            return true;
        }



        return super.onOptionsItemSelected(item);
}


}



