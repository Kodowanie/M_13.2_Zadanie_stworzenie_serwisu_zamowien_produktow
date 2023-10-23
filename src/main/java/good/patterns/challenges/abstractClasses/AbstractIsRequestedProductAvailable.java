package good.patterns.challenges.abstractClasses;

import java.util.List;

public abstract class AbstractIsRequestedProductAvailable {
    protected String productUserWantToOrder;

    public AbstractIsRequestedProductAvailable(String productUserWantToOrder) {
        this.productUserWantToOrder = productUserWantToOrder;
    }

    public String getProductUserWantToOrder() {
        return productUserWantToOrder;
    }

    @Override
    public String toString() {
        return
                "'" + productUserWantToOrder + '\'';
    }

    public boolean orderProducts(List<String> listOfProducts) {
        if (listOfProducts.contains(productUserWantToOrder)) {
            return true;
        } else {
            return false;
        }
    }
}
