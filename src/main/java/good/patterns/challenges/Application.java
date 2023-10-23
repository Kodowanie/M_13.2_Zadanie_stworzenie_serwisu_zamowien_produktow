package good.patterns.challenges;

import good.patterns.challenges.abstractClasses.AbstractIsRequestedProductAvailable;
import good.patterns.challenges.abstractClasses.IListOfProductsInDatabase;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        User user = new User("userABC", "abc@mail.com");
        User user1 = new User("userXYZ", "xyz@mail.com");

        IListOfProductsInDatabase products = new ListOfProductsInDatabase();
        List<String> listOfProducts = products.listOfProducts();

        AbstractIsRequestedProductAvailable orderProducts =
                new IsRequestedProductAvailable("Monitor");
        AbstractIsRequestedProductAvailable orderProducts1 =
                new IsRequestedProductAvailable("Dog");

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(user1, orderProducts1, listOfProducts);
    }
}
