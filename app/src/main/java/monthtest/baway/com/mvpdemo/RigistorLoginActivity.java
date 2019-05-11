package monthtest.baway.com.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import monthtest.baway.com.mvpdemo.mvp.IUserContract;

public class RigistorLoginActivity extends AppCompatActivity implements IUserContract.IUserView {

    private EditText name;
    private EditText pwd;
    private CheckBox isme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pwd = findViewById(R.id.pwd);
        isme = findViewById(R.id.is_me);


        // Gekk
    }
    public void regist(View view){

    }
    public void login(View view){

    }

    @Override
    public void registSuccess(String result) {
        Toast.makeText(this, "result", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registError() {

    }

    @Override
    public void loginSuccess(String result) {
        Toast.makeText(this, "result", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginError() {

    }
}
