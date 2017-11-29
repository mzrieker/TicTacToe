package marcus.threeinarow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class DifficultySelectionScreen extends AppCompatActivity {

    Button btnEasy;
    Button btnNormal;
    Button btnHard;
    Button btnImpossible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_selection_screen);

        btnEasy = (Button)findViewById(R.id.btnEasy);
        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnHard = (Button)findViewById(R.id.btnHard);
        btnImpossible = (Button)findViewById(R.id.btnImpossible);

        btnEasy.setOnClickListener(e -> activityStart(1));
        btnNormal.setOnClickListener(e -> activityStart(2));
        btnHard.setOnClickListener(e-> activityStart(3));
        btnImpossible.setOnClickListener(e->activityStart(4));
    }

    void activityStart(int option){
        Intent i = new Intent(getApplicationContext(),GameScreen.class);
        i.putExtra("option",option);
        startActivity(i);
    }

}
