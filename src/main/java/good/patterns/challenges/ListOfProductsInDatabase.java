package good.patterns.challenges;

import good.patterns.challenges.abstractClasses.IListOfProductsInDatabase;

import java.util.ArrayList;
import java.util.List;

public class ListOfProductsInDatabase implements IListOfProductsInDatabase {

     @Override
    public List <String> listOfProducts() {
         List <String> listOfProducts =  new ArrayList<>();
         listOfProducts.add("Monitor");
         listOfProducts.add("Keyboard");
         listOfProducts.add("Laptop");
         listOfProducts.add("Computer mouse");
         listOfProducts.add("Desktop computer");
         return listOfProducts;
    }
}
