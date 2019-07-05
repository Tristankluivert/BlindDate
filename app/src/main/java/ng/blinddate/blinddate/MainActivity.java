package ng.blinddate.blinddate;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);



    BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
     bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.action_recents:
                    Toast.makeText(MainActivity.this, "Hearts", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_favorites:
                    Toast.makeText(MainActivity.this, "Messages", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_nearby:
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        }
    });
   }
}