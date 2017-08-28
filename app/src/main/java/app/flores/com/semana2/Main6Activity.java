package app.flores.com.semana2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    private CheckBox checkBox9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);

        // Setting check to specific checkbox
        checkBox.setChecked(true);
        checkBox2.setChecked(false);
        checkBox3.setChecked(true);
        checkBox4.setChecked(true);
        checkBox5.setChecked(false);
        checkBox6.setChecked(false);
        checkBox7.setChecked(true);
        checkBox8.setChecked(true);
        checkBox9.setChecked(false);

        if(checkBox.isChecked())
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox2.isChecked())
            Toast.makeText(this, "Second checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox3.isChecked())
            Toast.makeText(this, "Third checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox4.isChecked())
            Toast.makeText(this, "Fourth checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox5.isChecked())
            Toast.makeText(this, "Fifth checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox6.isChecked())
            Toast.makeText(this, "Sixth checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox7.isChecked())
            Toast.makeText(this, "Seventh checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox8.isChecked())
            Toast.makeText(this, "Eightht checkbox is checked!", Toast.LENGTH_LONG).show();
        if(checkBox9.isChecked())
            Toast.makeText(this, "Nineth checkbox is checked!", Toast.LENGTH_LONG).show();
    }

    public void androidCheckBoxClicked(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                CheckBox checkBox2 = (CheckBox) view;
                if(checkBox2.isChecked())
                    Toast.makeText(this, checkBox2.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox3:
                CheckBox checkBox3 = (CheckBox) view;
                if(checkBox3.isChecked())
                    Toast.makeText(this, checkBox3.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox4:
                CheckBox checkBox4 = (CheckBox) view;
                if(checkBox4.isChecked())
                    Toast.makeText(this, checkBox4.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox5:
                CheckBox checkBox5 = (CheckBox) view;
                if(checkBox5.isChecked())
                    Toast.makeText(this, checkBox5.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox6:
                CheckBox checkBox6 = (CheckBox) view;
                if(checkBox6.isChecked())
                    Toast.makeText(this, checkBox6.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox7:
                CheckBox checkBox7 = (CheckBox) view;
                if(checkBox7.isChecked())
                    Toast.makeText(this, checkBox7.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox8:
                CheckBox checkBox8 = (CheckBox) view;
                if(checkBox8.isChecked())
                    Toast.makeText(this, checkBox8.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox9:
                CheckBox checkBox9 = (CheckBox) view;
                if(checkBox9.isChecked())
                    Toast.makeText(this, checkBox9.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
