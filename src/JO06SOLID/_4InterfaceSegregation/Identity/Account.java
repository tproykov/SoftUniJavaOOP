package JO06SOLID._4InterfaceSegregation.Identity;

public interface Account {

    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();

    void register(String username, String password);

    void login(String username, String password);

    void changePassword(String oldPass, String newPass);

    Iterable<User> getAllUsersOnline();

    Iterable<User> getAllUsers();

    User getUserByName(String name);
}
