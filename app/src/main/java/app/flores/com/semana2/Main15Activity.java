package app.flores.com.semana2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }

    public void action(View view){
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show();
    }

}
