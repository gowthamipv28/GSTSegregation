package GST;
import java.util.ArrayList;
import java.util.List;
public class Shopowner {

    private List<SwagLabs>allProduct;

    public Shopowner() {
        allProduct = new ArrayList<SwagLabs>();
    }
    public void addProduct(SwagLabs product) {
        allProduct.add(product);

    }

    public List<SwagLabs> getAllProduct() {
        return allProduct;
    }

    public List<SwagLabs> getGSTProduct() {
        List<SwagLabs> gstProductWithGST = new ArrayList<SwagLabs>();
        for (SwagLabs gstProduct1 : getAllProduct()) {
            if (gstProduct1.isGSTapplicable()) {
                gstProductWithGST.add(gstProduct1);
            }
        }

        return gstProductWithGST;
    }

    public double getTotalPrice(SwagLabs product) {

        if (product.isGSTapplicable()) {
            return product.price + product.getGstcharge();
        } else {
            return product.price;
        }

    }
}
