package mk.finki.ukim.mpip;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class IMPLICIT_ACTION extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_action);

    }

    private TextView textOut;

    public void returnIntents(View view){
        Intent localIntent2 = new Intent(Intent.ACTION_PICK_ACTIVITY);
        Intent localIntent3 = new Intent(Intent.ACTION_MAIN, null);
        localIntent3.addCategory(Intent.CATEGORY_LAUNCHER);
        localIntent2.putExtra(Intent.EXTRA_INTENT, localIntent3);
        System.out.println(localIntent2);
        System.out.println(localIntent3);

    }



}