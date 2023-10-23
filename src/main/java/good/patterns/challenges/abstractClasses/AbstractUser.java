package good.patterns.challenges.abstractClasses;

public abstract class AbstractUser {
    private String userName;
    private String mail;
    public AbstractUser(String userName,  String mail) {
        this.userName = userName;
        this.mail = mail;
    }
    public String getUserName() {
        return userName;
    }
    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return
                "userName ='" + userName + '\'' +
                ", mail = '" + mail;
    }
}
