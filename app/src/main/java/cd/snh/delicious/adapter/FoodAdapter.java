package cd.snh.delicious.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cd.snh.delicious.R;
import cd.snh.delicious.model.Food;

/**
 * Created by SAM on 24/01/2018.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private Context mContxt;
    private List<Food> foodList;

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mContxt);
        View view=inflater.inflate(R.layout.list_details_menu_layout,null);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        Food menu=foodList.get(position);
        holder.txtFood.setText(menu.getFood());
        holder.txtDetails.setText(menu.getDetails());
        holder.txtPrice.setText(menu.getPrice());


        holder.picture.setImageDrawable(mContxt.getResources().getDrawable(menu.getPicture()));

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView picture;
        TextView txtFood,
                txtDetails,
                txtPrice,
                txtCommande;
        public FoodViewHolder(View itemView) {
            super(itemView);
            picture=itemView.findViewById(R.id.imageview);
            txtFood=itemView.findViewById(R.id.txtNameFood);
            txtDetails=itemView.findViewById(R.id.txtDetails);
            txtPrice=itemView.findViewById(R.id.txtPrice);

            //super(itemView);
        }
    }
}
