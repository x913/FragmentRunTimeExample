package xyz.nuso.fragmentruntimeexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager sFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sFragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container) != null) {

            // check if fragment already added
            if(savedInstanceState != null)
                return;

            sFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, new HomeFragment())
                    .commit();
        }
    }
}
