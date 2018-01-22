package com.example.android.project2footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.project2footballcounter.R;

public class MainActivity extends AppCompatActivity {

    static final String ScoreRealMadrid = "scoreRealMadrid";
    static final String ScoreBarcelona = "scoreBarcelona";
    static final String FoulsRealMadrid = "foulsRealMadrid";
    static final String FoulsBarcelona = "foulsBarcelona";
    static final String YellowCardReal = "yellowCardReal";
    static final String YellowCardBarcelona = "yellowCardBarca";
    static final String RedCardReal = "redCardReal";
    static final String RedCardBarcelona = "redCardBarca";
    int scoreRealMadrid = 0;
    int scoreBarcelona = 0;
    int foulsRealMadrid = 0;
    int foulsBarcelona = 0;
    int yellowCardReal = 0;
    int yellowCardBarca = 0;
    int redCardReal = 0;
    int redCardBarca = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        /** Save the teams' current score state*/

        savedInstanceState.putInt(ScoreRealMadrid, scoreRealMadrid);
        savedInstanceState.putInt(ScoreBarcelona, scoreBarcelona);

        /**stats for Team A*/

        savedInstanceState.putInt(FoulsRealMadrid, foulsRealMadrid);
        savedInstanceState.putInt(YellowCardReal, yellowCardReal);
        savedInstanceState.putInt(RedCardReal, redCardReal);

        /**stats for Team B*/

        savedInstanceState.putInt(FoulsBarcelona, foulsBarcelona);
        savedInstanceState.putInt(YellowCardBarcelona, yellowCardBarca);
        savedInstanceState.putInt(RedCardBarcelona, redCardBarca);

        /** Always call the superclass so it can save the view hierarchy state*/

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        /** Always call the superclass so it can restore the view hierarchy*/

        super.onRestoreInstanceState(savedInstanceState);

        /** Restore state members from saved instance*/

        scoreRealMadrid = savedInstanceState.getInt(ScoreRealMadrid);
        scoreBarcelona = savedInstanceState.getInt(ScoreBarcelona);

        /**stats for Team A*/

        foulsRealMadrid = savedInstanceState.getInt(FoulsRealMadrid);
        yellowCardReal = savedInstanceState.getInt(YellowCardReal);
        redCardReal = savedInstanceState.getInt(RedCardReal);

        /**stats for Team B*/

        foulsBarcelona = savedInstanceState.getInt(FoulsBarcelona);
        yellowCardBarca = savedInstanceState.getInt(YellowCardBarcelona);
        redCardBarca = savedInstanceState.getInt(RedCardBarcelona);

        /**display scores & stats for Team A*/

        displayForRealMadrid(scoreRealMadrid);
        displayFoulsRealMadrid(foulsRealMadrid);
        displayYellowCardReal(yellowCardReal);
        displayRedCardReal(redCardReal);

        /**display scores & stats for Team B*/

        displayForBarcelona(scoreBarcelona);
        displayFoulsBarcelona(foulsBarcelona);
        displayYellowCardBarcelona(yellowCardBarca);
        displayRedCardBarcelona(redCardBarca);

    }

    /**
     * Displays the given score for Real Madrid.
     */
    public void displayForRealMadrid(int score) {
        TextView scoreView = findViewById(R.id.team_realmadrid_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Barcelona.
     */
    public void displayForBarcelona(int score) {
        TextView scoreView = findViewById(R.id.team_barcelona_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Real Madrid.
     */
    public void displayFoulsRealMadrid(int fouls) {
        TextView scoreView = findViewById(R.id.fouls_real_madrid);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the fouls for Barcelona.
     */
    public void displayFoulsBarcelona(int fouls) {
        TextView scoreView = findViewById(R.id.fouls_barcelona);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays yellow cards for Real Madrid.
     */
    public void displayYellowCardReal(int yellow) {
        TextView scoreView = findViewById(R.id.yellow_real_madrid);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays yellow cards for Barcelona.
     */
    public void displayYellowCardBarcelona(int yellow) {
        TextView scoreView = findViewById(R.id.yellow_barcelona);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays red cards for Real Madrid.
     */
    public void displayRedCardReal(int yellow) {
        TextView scoreView = findViewById(R.id.red_real_madrid);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays red cards for Barcelona.
     */
    public void displayRedCardBarcelona(int yellow) {
        TextView scoreView = findViewById(R.id.red_barcelona);
        scoreView.setText(String.valueOf(yellow));
    }

    public void goalRealMadrid(View view) {
        scoreRealMadrid = scoreRealMadrid + 1;
        displayForRealMadrid(scoreRealMadrid);
    }

    public void foulsRealMadrid(View view) {
        foulsRealMadrid = foulsRealMadrid + 1;
        displayFoulsRealMadrid(foulsRealMadrid);
    }

    public void yellowCardRealMadrid(View view) {
        yellowCardReal = yellowCardReal + 1;
        displayYellowCardReal(yellowCardReal);
    }

    public void redCardRealMadrid(View view) {
        redCardReal = redCardReal + 1;
        displayRedCardReal(redCardReal);
    }

    public void goalBarcelona(View view) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void foulsBarcelona(View view) {
        foulsBarcelona = foulsBarcelona + 1;
        displayFoulsBarcelona(foulsBarcelona);
    }

    public void yellowCardBarcelona(View view) {
        yellowCardBarca = yellowCardBarca + 1;
        displayYellowCardBarcelona(yellowCardBarca);
    }

    public void redCardBarcelona(View view) {
        redCardBarca = redCardBarca + 1;
        displayRedCardBarcelona(redCardBarca);
    }

    public void resetScore(View view) {
        scoreRealMadrid = 0;
        scoreBarcelona = 0;
        foulsRealMadrid = 0;
        foulsBarcelona = 0;
        yellowCardReal = 0;
        yellowCardBarca = 0;
        redCardReal = 0;
        redCardBarca = 0;
        displayForRealMadrid(scoreRealMadrid);
        displayForBarcelona(scoreBarcelona);
        displayFoulsRealMadrid(foulsRealMadrid);
        displayFoulsBarcelona(foulsBarcelona);
        displayYellowCardReal(yellowCardReal);
        displayYellowCardBarcelona(yellowCardBarca);
        displayRedCardReal(redCardReal);
        displayRedCardBarcelona(redCardBarca);

    }
}
