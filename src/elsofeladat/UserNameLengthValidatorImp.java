package elsofeladat;

public class UserNameLengthValidatorImp implements Validator<User> {
private int minLength = 6;



    @Override
    public boolean isValid(User object) {
        return object.getUserName().length() >=minLength;
    }
}
