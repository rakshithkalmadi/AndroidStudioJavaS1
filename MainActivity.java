import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    EditText ed1,ed2,ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.fname);
        ed2=findViewById(R.id.lname);
        ed3=findViewById(R.id.email);
    }

    public void submitme(View view) {
        tv1=findViewById(R.id.fnamev);
        tv2=findViewById(R.id.lnamev);
        tv3=findViewById(R.id.mailv);
        tv1.setText("FName: "+ed1.getText().toString());
        tv2.setText("LName: "+ed2.getText().toString());
        tv3.setText("Email: "+ed3.getText().toString());

    }
}
