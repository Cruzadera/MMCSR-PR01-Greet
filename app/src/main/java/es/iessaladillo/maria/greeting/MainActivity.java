package es.iessaladillo.maria.greeting;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtLastName;
    private Button btnGreet;
    private Button btnReset;
    private CheckBox checkboxPolite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        txtName = ActivityCompat.requireViewById(this, R.id.txtName);
        txtLastName = ActivityCompat.requireViewById(this, R.id.txtLastName);
        btnGreet = ActivityCompat.requireViewById(this, R.id.btnGreet);
        btnReset = ActivityCompat.requireViewById(this, R.id.btnReset);
        checkboxPolite = ActivityCompat.requireViewById(this, R.id.checkboxPolite);

        btnReset.setOnClickListener(this);
        btnGreet.setOnClickListener(this);
    }

    private void toReset() {
        txtName.setText("");
        txtLastName.setText("");
        checkboxPolite.setChecked(false);
    }


    @Override
    public void onClick(View v) {
        String name;
        String lastName;
        switch (v.getId()){
            case R.id.btnGreet:
                name = txtName.getText().toString();
                lastName = txtLastName.getText().toString();
                if(checkboxPolite.isChecked()){
                    Toast.makeText(this, getString(R.string.main_StringPolite)+" "+ name+" "+ lastName, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, getString(R.string.main_stringNoPolite)+" "+ name +" "+ lastName, Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnReset:
                toReset();
                break;
        }

    }


}
