package elsofeladat;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Validator<User>> validators = new ArrayList<Validator<User>>() {
            {
                add(new UserNameContainSpace());
                add(new UserNameLengthValidatorImp());
            }
        };
        UserService userService = new UserServiceImp();

        UserController userControllerWithOutValidators = new UserController(userService);
        UserController userController = new UserController(userService, validators);

        userController.createUser("R�vid");
        userController.createUser("Van Space");
        userController.createUser("Ezmegfelel");
        userController.createUser(null);
        System.out.println("Eddig vannak szab�lyok");
        userControllerWithOutValidators.createUser("R�vid");
        userControllerWithOutValidators.createUser("Van Space");
        userControllerWithOutValidators.createUser("Ezmegfelel");
        userControllerWithOutValidators.createUser(null);

    }
}