package cd.snh.delicious.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import cd.snh.delicious.R;
import cd.snh.delicious.model.User;
import info.hoang8f.widget.FButton;

/**
 * Created by Michelo on 1/21/18.
 */

public class ActivitySignUp extends AppCompatActivity {


    EditText edtPhone,edtPassword, edtName;
    Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtPhone=(MaterialEditText)findViewById(R.id.edtPhone);
        edtPassword=(MaterialEditText)findViewById(R.id.edtPassword);
        edtName=(MaterialEditText)findViewById(R.id.edtName);
        btnConnect=findViewById(R.id.btnConnect);

//Firebase Initialization
        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference jsonUser=database.getReference("User");

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jsonUser.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //check if already exist
                        if(dataSnapshot.child(edtPhone.getText().toString()).exists()){
                            Toast.makeText(ActivitySignUp.this,"User exist",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            User user=new User(edtName.getText().toString(),edtPassword.getText().toString());
                            jsonUser.child(edtPhone.getText().toString()).setValue(user);
                            Toast.makeText(ActivitySignUp.this,"Sign up successfuly",Toast.LENGTH_LONG).show();
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });


    }



}
