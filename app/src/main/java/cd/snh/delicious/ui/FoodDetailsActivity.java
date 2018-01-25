package cd.snh.delicious.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import cd.snh.delicious.R;
import cd.snh.delicious.adapter.FoodAdapter;
import cd.snh.delicious.model.Food;

/**
 * Created by SAM on 24/01/2018.
 */

public class FoodDetailsActivity extends AppCompatActivity {
    RecyclerView recycler;
    FoodAdapter adapter;
    List<Food> listMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
    }
}
