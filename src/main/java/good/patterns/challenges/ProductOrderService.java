package good.patterns.challenges;

import good.patterns.challenges.abstractClasses.AbstractIsRequestedProductAvailable;

import java.util.List;

public class ProductOrderService {

    public ConfirmTheOrderOfProductDto process(User user, AbstractIsRequestedProductAvailable request,
                                               List<String> list){
        boolean productAvailable = request.orderProducts(list);
        if (productAvailable){
            System.out.println("Chosen product " + request + " is available in database and it can be order...");
            System.out.println("User order informations : " + user);
            return new ConfirmTheOrderOfProductDto(user, request.orderProducts(list));
        } else {
            System.out.println("Chosen product " + request + " not found...");
            System.out.println("Please select a new product...");
            return new ConfirmTheOrderOfProductDto(user, request.orderProducts(list));
        }




    }

}
