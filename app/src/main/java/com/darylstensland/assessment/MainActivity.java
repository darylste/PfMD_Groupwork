package com.darylstensland.assessment;

import android.os.Bundle;
import android.graphics.Point;
import android.view.Display;

import androidx.appcompat.app.AppCompatActivity;

import com.darylstensland.assessment.SpaceGameView;

public class MainActivity extends AppCompatActivity {

    SpaceGameView spaceGameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);

        spaceGameView = new SpaceGameView(this, size.x, size.y);
        setContentView(spaceGameView);

    }

    // This method executes when the player starts the game
    @Override
    protected void onResume() {
        super.onResume();

        // Tell the gameView resume method to execute
        spaceGameView.resume();
    }

    // This method executes when the player quits the game
    @Override
    protected void onPause() {
        super.onPause();

        // Tell the gameView pause method to execute
        spaceGameView.pause();
    }

    public void restartGame() {
        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);

        spaceGameView = new SpaceGameView(this, size.x, size.y);
        setContentView(spaceGameView);
    }
}

