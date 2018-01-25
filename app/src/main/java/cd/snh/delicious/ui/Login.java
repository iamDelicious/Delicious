package cd.snh.delicious.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;
import cd.snh.delicious.MainActivity;
import cd.snh.delicious.R;
import cd.snh.delicious.model.User;


public class Login extends AppCompatActivity {

    EditText edtPhone,edtPassword;
    Button btnSignIn;
    TextView txtNoAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        edtPhone=(MaterialEditText)findViewById(R.id.edtPhone);
        edtPassword=(MaterialEditText)findViewById(R.id.edtPassword);

        txtNoAccount=findViewById(R.id.txtNoaccount);

        btnSignIn=findViewById(R.id.btnSeConn);

        //Firebase Initialization
        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference jsonUser=database.getReference("User");

        //In case the customer do not have any account
        txtNoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUp=new Intent(Login.this , ActivitySignUp.class );
                startActivity(signUp);
            }
        });


        btnSignIn.setOnClickListener(new View.OnClickListener() {

           //final ProgressDialog dialog=new ProgressDialog(Login.this);

            public void onClick(View view) {

               // Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();

                jsonUser.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        //check if user not exist in database
                        if(dataSnapshot.child(edtPhone.getText().toString()).exists()){
                            User user=dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                            if(user.getPassword().equals(edtPassword.getText().toString())){
                                Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();

                                Intent signIn=new Intent(Login.this , MainActivity.class );
                                startActivity(signIn);
                            } else
                            {
                                Toast.makeText(Login.this, "Failed", Toast.LENGTH_SHORT).show();
                                //edtPhone.requestFocus();
                            }
                        }
                        else
                        {
                            Toast.makeText(Login.this, "User Not Exist", Toast.LENGTH_SHORT).show();
                        }

                        //Get User
                        User user=dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                        if(user.getPassword().equals(edtPassword.getText().toString())){
                            Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();
                        } else
                        {
                            Toast.makeText(Login.this, "Failed", Toast.LENGTH_SHORT).show();
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
