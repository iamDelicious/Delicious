package cd.snh.delicious.model;

/**
 * Created by SAM on 18/01/2018.
 */

public class Food {
    private int id,
            idFoodMenu;
    private String food,
            details,
            origin,
            price;
    private int picture;
    private FoodMenu menu;

    public Food(String food, String details, String origin,String price, int picture, FoodMenu menu) {
        this.food = food;
        this.details = details;
        this.origin = origin;
        this.price=price;
        this.picture = picture;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFoodMenu() {
        return idFoodMenu;
    }

    public void setIdFoodMenu(int idFoodMenu) {
        this.idFoodMenu = idFoodMenu;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public FoodMenu getMenu() {
        return menu;
    }

    public void setMenu(FoodMenu menu) {
        this.menu = menu;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
