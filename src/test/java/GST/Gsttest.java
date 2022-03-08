package GST;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class Gsttest {
    Shopowner Products;

    @Test
    public void verifyAllProducts(){

        Products = new Shopowner();
        SwagLabs Television =new Television("LG","LG Good Life",2012,20000);
        SwagLabs Bluetooth = new Bluetooth("JBL","JBL 360",2011,4000);
        SwagLabs Toy = new Toy("Car","Racing car",2017,460);


        Products.addProduct(Television);
        Products.addProduct(Bluetooth);
        Products.addProduct(Toy);

        List<SwagLabs> Product = Products.getAllProduct();
        for (SwagLabs product1 : Product){
            Assert.assertTrue(product1 instanceof Television||product1 instanceof Bluetooth|| product1 instanceof Toy);
        }

    }
@Test
public void verifyNumberOfProductsApplicableForGST()
{
    Products = new Shopowner();
    SwagLabs Television =new Television("LG","LG Good Life",2012,20000);
    SwagLabs Bluetooth = new Bluetooth("JBL","JBL 360",2011,4000);
    SwagLabs Toy = new Toy("Car","Racing car",2017,460);

    Products.addProduct(Television);
    Products.addProduct(Bluetooth);
    Products.addProduct(Toy);

    Assert.assertEquals(SwagLabs.getGSTProduct().size(), 1);
}
    @Test
    public void getProductsWithGst() {

        Products = new Shopowner();
        SwagLabs Television =new Television("LG","LG Good Life",2012,20000);
        SwagLabs Bluetooth = new Bluetooth("JBL","JBL 360",2011,4000);
        SwagLabs Toy = new Toy("Car","Racing car",2017,460);


        Products.addProduct(Television);
        Products.addProduct(Bluetooth);
        Products.addProduct(Toy);

        List<SwagLabs> Product = Products.getGSTProduct();
        for (SwagLabs product1 : Product) {
            Assert.assertTrue(product1 instanceof Television || product1 instanceof Bluetooth);
        }
    }
    @Test
    public void VerifyTotalPriceIncludingGstIsGreater()
    {

        Products =  new Shopowner();
        SwagLabs Television =new Television("LG","LG Good Life",2012,20000);
        SwagLabs Bluetooth = new Bluetooth("JBL","JBL 360",2011,4000);
        SwagLabs Toy = new Toy("Car","Racing car",2017,460);

        Products.addProduct(Television);
        Products.addProduct(Bluetooth);
        Products.addProduct(Toy);


        Assert.assertEquals(Products.getTotalPrice(Television),23600);
        Assert.assertEquals(Products.getTotalPrice(Bluetooth), 4720);
        Assert.assertEquals(Products.getTotalPrice(Toy),460);
    }
}
