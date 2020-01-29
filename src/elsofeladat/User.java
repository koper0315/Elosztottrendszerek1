package elsofeladat;

public class User {
    private final String userName;

    public User(String userName){
        this.userName = userName !=null? userName: "";
    }
    public String getUserName(){
        return userName;
    }

}
