package cd.snh.delicious.model;

/**
 * Created by SAM on 18/01/2018.
 */

public class Restaurant {
    private int id;
    private String name,
            initials,
            adress,
            phone_number;
    private int picture_restaurent;

    public Restaurant(){
        //
    }

    public Restaurant(String name, String adress, String phone_number, int image_restaurent) {
        this.name = name;
        this.adress = adress;
        this.phone_number = phone_number;
        this.picture_restaurent = image_restaurent;
    }

    //

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

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getImage_restaurent() {
        return picture_restaurent;
    }

    public void setImage_restaurent(int image_restaurent) {
        this.picture_restaurent = image_restaurent;
    }
}
