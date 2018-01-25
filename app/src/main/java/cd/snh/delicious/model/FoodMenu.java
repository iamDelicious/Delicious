package cd.snh.delicious.model;

/**
 * Created by SAM on 18/01/2018.
 */

public class FoodMenu {
    private int id;
    private String name,
            details,
            tradition;
    private int picture;
    private Restaurant restaurant;

    public FoodMenu(String name, String details, String tradition, int picture) {
        this.name = name;
        this.details = details;
        this.tradition = tradition;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTradition() {
        return tradition;
    }

    public void setTradition(String tradition) {
        this.tradition = tradition;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
