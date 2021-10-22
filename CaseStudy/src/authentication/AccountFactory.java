package authentication;


//class AccountFactory for Factory Pattern of Account Types
public class AccountFactory {
    public static Account getAccount(AccountLevel accountLevel, String username, String password, String fullName, int id) {
        switch (accountLevel) {
            case STAFF:
                return new Staff(username, password, AccountLevel.STAFF, fullName, id);
            case LEADER:
                return new Leader(username, password, AccountLevel.LEADER, fullName, id);
            default:
                throw new IllegalArgumentException("This role is not allowed!!");

        }
    }
}
