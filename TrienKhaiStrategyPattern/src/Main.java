public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new MySQLStorage();
        User user = new User();

        userStorage.store(user);
    }
}
