package clm.benandjerrysshop;

/**
 * Created by jbt on 7/14/2016.
 */
public class IceCream {
    private String name;
    private float price;
    private int amount;
    private int pic;

    public IceCream(String name, float price, int pic) {
        this.name = name;
        this.price = price;
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
