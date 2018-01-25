package cd.snh.delicious.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import info.hoang8f.widget.FButton;

import cd.snh.delicious.R;

/**
 * Created by Michelo on 1/17/18.
 */

public class ActivityLogin extends AppCompatActivity{


    Button gplus,phone;
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_ok);

        gplus=findViewById(R.id.g_plus);
        phone=findViewById(R.id.phone);

        txtSlogan=findViewById(R.id.slogan);

        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/Billabong.ttf");
        txtSlogan.setTypeface(face);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn=new Intent(ActivityLogin.this , PhoneAuthActivity.class );
                startActivity(signIn);
            }
        });

        gplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent signUp=new Intent(ActivityLogin.this , ActivitySignUp.class );
                startActivity(signUp);*/
            }
        });


    }


}
