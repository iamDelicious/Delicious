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
import cd.snh.delicious.model.FoodMenu;

/**
 * Created by SAM on 19/01/2018.
 */

public class FoodMenuAdapter extends RecyclerView.Adapter<FoodMenuAdapter.FoodMenuViewHolder>{

    private Context mContxt;
    private List<FoodMenu> foddMenuList;

    public FoodMenuAdapter(Context mContxt, List<FoodMenu> foddMenuList) {
        this.mContxt = mContxt;
        this.foddMenuList = foddMenuList;
    }

    @Override
    public FoodMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mContxt);
        View view=inflater.inflate(R.layout.list_menu_layout,null);

        return new FoodMenuViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(FoodMenuViewHolder holder, int position) {
            FoodMenu menu=foddMenuList.get(position);
        holder.txtMenuFood.setText(menu.getName());
        holder.txtDetails.setText(menu.getDetails());
        holder.txtTradition.setText(menu.getTradition());

        holder.picture.setImageDrawable(mContxt.getResources().getDrawable(menu.getPicture()));

    }

    @Override
    public int getItemCount() {
        return foddMenuList.size();
    }

    class FoodMenuViewHolder extends RecyclerView.ViewHolder{

        ImageView picture;
        TextView txtMenuFood,
                txtDetails,
                txtTradition;
        public FoodMenuViewHolder(View itemView) {
            super(itemView);
            picture=itemView.findViewById(R.id.imageview);
            txtMenuFood=itemView.findViewById(R.id.txtNameMenuFood);
            txtDetails=itemView.findViewById(R.id.txtDetailsMenu);
            txtTradition=itemView.findViewById(R.id.txtTradition);

            //super(itemView);
        }
    }
}
