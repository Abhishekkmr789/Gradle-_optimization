package gradlesetup.com.gradlesetupdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tvText=findViewById(R.id.tv_text);
        tvText.setText(BuildConfig.API_URL);
    }


}
