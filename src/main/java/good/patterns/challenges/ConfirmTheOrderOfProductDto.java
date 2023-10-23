package good.patterns.challenges;

public class ConfirmTheOrderOfProductDto {


    private User user;
    private boolean isRequestedProductAvailable;

    public ConfirmTheOrderOfProductDto(User user, boolean isRequestedProductAvailable) {
        this.user = user;
        this.isRequestedProductAvailable = isRequestedProductAvailable;
    }

    @Override
    public String toString() {
        return "ConfirmTheOrderOfProductDto{" +
                "user=" + user +
                ", isRequestedProductAvailable=" + isRequestedProductAvailable +
                '}';
    }
}
