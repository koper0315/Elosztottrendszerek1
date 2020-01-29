package elsofeladat;

import java.util.ArrayList;
import java.util.Collection;

public class UserController {
    private UserService userService;
    private Collection<Validator<User>> validators;


    public UserController(UserService userService, Collection<Validator<User>> validators){
        this.userService = userService;
        this.validators = validators;
    }

    public UserController(UserService userService){
        this(userService, new ArrayList<>());
    }

    private boolean validUser(User user){
        return validators.stream().allMatch(v -> v.isValid(user));
    }

    public void createUser(String userName){
        User newUser = new User(userName);
        if (validUser(newUser)){
            userService.save(newUser);
        }
    }
}
