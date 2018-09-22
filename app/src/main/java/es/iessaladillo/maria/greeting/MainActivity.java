package es.iessaladillo.maria.greeting;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtLastName;
    private Button btnGreet;
    private Button btnReset;


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

        btnReset.setOnClickListener(this);
    }

    private void toReset() {
        txtName.setText("");
        txtLastName.setText("");
    }


    @Override
    public void onClick(View v) {
        toReset();
    }
}
