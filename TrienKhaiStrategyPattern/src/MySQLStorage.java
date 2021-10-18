public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Saved file in MySQL!!");
    }
}
