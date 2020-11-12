package kr.ac.ssu.gameoptionmenutest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색과 버튼 변경");
        baseLayout = findViewById(R.id.baseLayout);
        btn = findViewById(R.id.btn);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_red:
                baseLayout.setBackgroundColor(Color.RED);
                return  true;
            case R.id.item_green:
                baseLayout.setBackgroundColor(Color.GREEN);
                return  true;
            case R.id.item_blue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return  true;
            case R.id.rotate_45:
                btn.setRotation(45);
                return  true;
            case R.id.zoomin_2:
                btn.setScaleX(2);
                btn.setScaleY(2);
                return  true;
        }
        return false;
    }
}








