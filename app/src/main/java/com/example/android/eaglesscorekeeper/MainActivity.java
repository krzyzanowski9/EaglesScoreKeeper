package com.example.android.eaglesscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamEagles = 0;
    float shotsTakenTeamEagles = 0;
    float shotsOnGoalTeamEagles = 0;
    float shotEfficiencyTeamEagles = 0;
    int scoreTeamOpposing = 0;
    int shotsTakenTeamOpposing = 0;
    int shotsOnGoalTeamOpposing = 0;
    int shotEfficiencyTeamOpposing = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamEagles(0);
        displayForTeamEaglesShotsTaken(0);
        displayForTeamEaglesShotsOnGoal(0);
        displayForTeamEaglesShotEfficiency(0);
        displayForTeamOpposing(0);
        displayForTeamOpposingShotsTaken(0);
        displayForTeamOpposingShotsOnGoal(0);
        displayForTeamOpposingShotEfficiency(0);
    }


    /**
     * Displays the given score for Team Eagles.
     */
    public void displayForTeamEagles(int score) {
        TextView scoreView = findViewById(R.id.team_eagles_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Opposing Team.
     */
    public void displayForTeamOpposing(int score) {
        TextView scoreView = findViewById(R.id.team_opposing_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team Eagles.
     */
    public void displayForTeamEaglesShotsTaken(float eaglesShotsTaken) {
        TextView scoreView = findViewById(R.id.team_eagles_shots_taken);
        scoreView.setText(String.valueOf(eaglesShotsTaken));
    }

    /**
     * Displays the given shots for Opposing Team.
     */
    public void displayForTeamOpposingShotsTaken(int opposingShotsTaken) {
        TextView scoreView = findViewById(R.id.team_opposing_shots_taken);
        scoreView.setText(String.valueOf(opposingShotsTaken));
    }

    /**
     * Displays the given shots on goal for Team Eagles.
     */
    public void displayForTeamEaglesShotsOnGoal(float eaglesShotsOnGoal) {
        TextView scoreView = findViewById(R.id.team_eagles_shots_on_goal);
        scoreView.setText(String.valueOf(eaglesShotsOnGoal));
    }

    /**
     * Displays the given shots on goal for Opposing Team.
     */
    public void displayForTeamOpposingShotsOnGoal(int opposingShotsOnGoal) {
        TextView scoreView = findViewById(R.id.team_opposing_shots_on_goal);
        scoreView.setText(String.valueOf(opposingShotsOnGoal));
    }

    /**
     * Displays the shot efficiency for Team Eagles.
     */
    public void displayForTeamEaglesShotEfficiency(float eaglesShotEfficiency) {
        TextView scoreView = findViewById(R.id.team_eagles_shot_efficiency);
        scoreView.setText(String.valueOf(eaglesShotEfficiency));

    }

    /**
     * Displays the shot efficiency for Opposing Team.
     */
    public void displayForTeamOpposingShotEfficiency(int opposingShotEfficiency) {
        TextView scoreView = findViewById(R.id.team_opposing_shot_efficiency);
        scoreView.setText(String.valueOf(opposingShotEfficiency));

    }


    /**
     * ************************************************************************** Eagles.
     */

    public void shotTakenEagles(View v) {
        shotsTakenTeamEagles = shotsTakenTeamEagles + 1;
        shotEfficiencyTeamEagles = shotsOnGoalTeamEagles / shotsTakenTeamEagles;
        displayForTeamEaglesShotsOnGoal(shotsOnGoalTeamEagles);
        displayForTeamEaglesShotsTaken(shotsTakenTeamEagles);
        displayForTeamEaglesShotEfficiency(shotEfficiencyTeamEagles);
    }

    public void shotOnGoalEagles(View v) {
        shotsOnGoalTeamEagles = shotsOnGoalTeamEagles + 1;
        shotEfficiencyTeamEagles = shotsOnGoalTeamEagles / (shotsTakenTeamEagles + 1);
        displayForTeamEaglesShotsOnGoal(shotsOnGoalTeamEagles);
        displayForTeamEaglesShotsTaken(shotsTakenTeamEagles);
        displayForTeamEaglesShotEfficiency(shotEfficiencyTeamEagles);
    }

    public void goalEagles(View v) {
        scoreTeamEagles = scoreTeamEagles + 1;
        displayForTeamEagles(scoreTeamEagles);
    }


    /**
     * ************************************************************************** Opposing.
     */

    public void shotTakenOpposing(View v) {
        shotsTakenTeamOpposing = shotsTakenTeamOpposing + 1;
        shotEfficiencyTeamOpposing = shotsOnGoalTeamOpposing / shotsTakenTeamOpposing;
        displayForTeamOpposingShotsOnGoal(shotsOnGoalTeamOpposing);
        displayForTeamOpposingShotsTaken(shotsTakenTeamOpposing);
        displayForTeamOpposingShotEfficiency(shotEfficiencyTeamOpposing);
    }

    public void shotOnGoalOpposing(View v) {
        shotsOnGoalTeamOpposing = shotsOnGoalTeamOpposing + 1;
        shotEfficiencyTeamOpposing = shotsOnGoalTeamOpposing / (shotsTakenTeamOpposing + 1);
        displayForTeamOpposingShotsOnGoal(shotsOnGoalTeamOpposing);
        displayForTeamOpposingShotsTaken(shotsTakenTeamOpposing);
        displayForTeamOpposingShotEfficiency(shotEfficiencyTeamOpposing);
    }

    public void goalOpposing(View v) {
        scoreTeamOpposing = scoreTeamOpposing + 1;
        displayForTeamOpposing(scoreTeamOpposing);
    }


    public void resetScore(View view) {
        scoreTeamEagles = 0;
        shotsTakenTeamEagles = 0;
        shotsOnGoalTeamEagles = 0;
        shotEfficiencyTeamEagles = 0;
        scoreTeamOpposing = 0;
        shotsTakenTeamOpposing = 0;
        shotsOnGoalTeamOpposing = 0;
        shotEfficiencyTeamOpposing = 0;
        displayForTeamEagles(scoreTeamEagles);
        displayForTeamEaglesShotsTaken(shotsTakenTeamEagles);
        displayForTeamEaglesShotsOnGoal(shotsOnGoalTeamEagles);
        displayForTeamEaglesShotEfficiency(shotEfficiencyTeamEagles);
        displayForTeamOpposing(scoreTeamOpposing);
        displayForTeamOpposingShotsTaken(shotsTakenTeamOpposing);
        displayForTeamOpposingShotsOnGoal(shotsOnGoalTeamOpposing);
        displayForTeamOpposingShotEfficiency(shotEfficiencyTeamOpposing);
    }

}
