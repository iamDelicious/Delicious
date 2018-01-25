package cd.snh.delicious;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import cd.snh.delicious.adapter.FoodMenuAdapter;
import cd.snh.delicious.model.FoodMenu;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    FoodMenuAdapter adapter;
    List<FoodMenu> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMenu=new ArrayList<>();
        recycler=findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);

        recycler.setLayoutManager(new LinearLayoutManager(this));

        listMenu.add(new FoodMenu("Petit déjeuner", "Dejeuner tout le matin",
                "A la tradition Internationale",
                R.drawable.barbecue_meat_grill_fire)
        );
        listMenu.add(new FoodMenu("Diner", "Nos repas",
                "A la tradition Internationale",
                R.drawable.brochette)
        );
        listMenu.add(new FoodMenu("Dîner Italienne", "Nos repas sont tres délicieux",
                "A la tradition Internationale",
                R.drawable.delicious)
        );
        listMenu.add(new FoodMenu("Diner Francais", "Nos repas",
                "A la tradition Française",
                R.drawable.images_restau1)
        );
        adapter=new FoodMenuAdapter(this,listMenu);
        recycler.setAdapter(adapter);

    }
}
