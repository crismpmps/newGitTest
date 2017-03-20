/**
 * Created by christosbampis on 13/03/2017.
 */
public class Product {

    protected int productId;//1,2,3
    protected String name;
    protected int productType;
    protected double price;
    protected int amount;






    public Product(int productId,String name,int productType, double price, int amount){

        this.productId=productId;
        this.name=name;
        this.productType=productType;
        this.price=price;
        this.amount=amount;
    }



    public int getProductId() {
        return productId;
    }




    public String getName() {
        return name;
    }

    public int getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }






}


