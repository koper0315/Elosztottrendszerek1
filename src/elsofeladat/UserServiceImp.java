package elsofeladat;

public class UserServiceImp implements UserService {
    @Override
    public void save(User user) {
        System.out.println("elmentve: "+user.getUserName());
    }
}
