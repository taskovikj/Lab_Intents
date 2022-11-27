package mk.finki.ukim.mpip;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
    }
    private EditText editText;
    private TextView textOutput;

    public void onClickButtonOkay(View view){
        editText = findViewById(R.id.editTextForExplicit);
        textOutput = findViewById(R.id.textViewForExplicit);
        textOutput.setText(editText.getText());
    }

    public void onClickBackToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}