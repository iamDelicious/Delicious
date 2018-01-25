package cd.snh.delicious;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Michelo on 1/17/18.
 */

public class DeliciousApplication extends Application {

    public static SharedPreferences prefs;

    @Override
    public void onCreate() {
        super.onCreate();
        // Write a message to the database
        FirebaseApp.initializeApp(this);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Delicious");

        prefs=getSharedPreferences("cd.snh.delicious",MODE_PRIVATE);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //MultiDex.install(this);
    }
}
