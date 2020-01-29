package elsofeladat;

public class UserNameContainSpace implements Validator<User> {
    @Override
    public boolean isValid(User object) {
        return !(object.getUserName().contains(" "));
    }
}
