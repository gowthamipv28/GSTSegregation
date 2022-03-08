package GST;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class SwagLabs {
    String productname;
    String brand;
    int year;
    double price;
    double gstcharge;
    boolean isGSTapplicable;
    private static int gstpercentage = 18;

    SwagLabs(String productname, String brand, int year, double price) {
        this.productname = productname;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public static Collection<Object> getGSTProduct() {
        return Collections.singleton(0);
    }

    public String getProductname() {
        return productname;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public  double getGstcharge() {
        return (price * gstpercentage) / 100;
    }

    public Boolean isGSTapplicable() {
        if (price > 2000) {
            gstcharge = getGstcharge();
            return true;
        } else {
            gstcharge = 0;
            return false;
        }
    }
    public double getTotalPrice() {

        return price + gstcharge;
    }
}
