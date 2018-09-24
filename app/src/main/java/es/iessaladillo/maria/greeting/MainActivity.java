package es.iessaladillo.maria.greeting;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtLastName;
    private Button btnGreet;
    private Button btnReset;
    private CheckBox checkboxPolite;
    private TextView text;
    private String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        btnGreet = findViewById(R.id.btnGreet);
        btnReset = findViewById(R.id.btnReset);
        checkboxPolite = findViewById(R.id.checkboxPolite);
        text = findViewById(R.id.textView);

        btnReset.setOnClickListener(this);
        btnGreet.setOnClickListener(this);
    }

    private void toReset() {
        txtName.setText("");
        txtLastName.setText("");
        checkboxPolite.setChecked(false);
        text.setText("");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGreet:
                if(checkboxPolite.isChecked()){
                    text.setText(getString(R.string.main_StringPolite) + " " + txtName.getText() + " " + txtLastName.getText());
                }else{
                    text.setText(getString(R.string.main_stringNoPolite) + " " + txtName.getText() + " " + txtLastName.getText());                }
                break;
            case R.id.btnReset:
                toReset();
                break;
        }

    }


}
