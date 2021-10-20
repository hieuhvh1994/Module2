package authentication;

public class AccountFactory {
    public static Account getAccount(AccountLevel accountLevel, String username, String password, String fullName, int id) {
        switch (accountLevel) {
            case STAFF:
                return new Staff(username, password, "STAFF", fullName, id);
            case LEADER:
                return new Leader(username, password, "LEADER", fullName, id);
            default:
                throw new IllegalArgumentException("This role is not allowed!!");

        }
    }
}
