package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public int goalScoreTeam1 = 0;
    public int goalScoreTeam2 = 0;
    public int foulScoreTeam1 = 0;
    public int foulScoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetAllScores(View v)
    {
        goalScoreTeam1 = 0;
        goalScoreTeam2 = 0;
        foulScoreTeam1 = 0;
        foulScoreTeam2 = 0;

        displayGoalScoreTeam1(goalScoreTeam1);
        displayGoalScoreTeam2(goalScoreTeam2);
        displayFoulScoreTeam1(foulScoreTeam1);
        displayFoulScoreTeam2(foulScoreTeam2);
    }

    public void increaseGoalTeam1(View v)
    {
        goalScoreTeam1 += 1;
        displayGoalScoreTeam1(goalScoreTeam1);
    }

    public void decreaseGoalTeam1(View v)
    {
        goalScoreTeam1 -= 1;
        displayGoalScoreTeam1(goalScoreTeam1);
    }

    public void increaseGoalTeam2(View v)
    {
        goalScoreTeam2 += 1;
        displayGoalScoreTeam2(goalScoreTeam2);
    }

    public void decreaseGoalTeam2(View v)
    {
        goalScoreTeam2 -= 1;
        displayGoalScoreTeam2(goalScoreTeam2);
    }


    public void increaseFoulTeam1(View v)
    {
        foulScoreTeam1 += 1;
        displayFoulScoreTeam1(foulScoreTeam1);
    }

    public void decreaseFoulTeam1(View v)
    {
        foulScoreTeam1 -= 1;
        displayFoulScoreTeam1(foulScoreTeam1);
    }

    public void increaseFoulTeam2(View v)
    {
        foulScoreTeam2 += 1;
        displayFoulScoreTeam2(foulScoreTeam2);
    }

    public void decreaseFoulTeam2(View v)
    {
        foulScoreTeam2 -= 1;
        displayFoulScoreTeam2(foulScoreTeam2);
    }


    public void displayGoalScoreTeam1(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.score_team1_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalScoreTeam2(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.score_team2_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulScoreTeam1(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.foul_team1_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulScoreTeam2(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.foul_team2_view);
        scoreView.setText(String.valueOf(score));
    }

}
