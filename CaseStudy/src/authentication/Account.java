package authentication;

public class Account extends AbstractUser {
    private String username;
    private String password;
    private String role;
    private String fullName;
    private int id;

    public Account(String username, String password, String role, String fullName, int id) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.id = id;
    }


    @Override
    String getUsername() {
        return username;
    }

    @Override
    void setUsername(String username) {
        this.username = username;
    }

    @Override
    String getPassword() {
        return password;
    }

    @Override
    void setPassword(String password) {
        this.password = password;
    }

    @Override
    String getRole() {
        return role;
    }

    @Override
    void setRole(String role) {
        this.role = role;
    }

    @Override
    String getFullName() {
        return fullName;
    }

    @Override
    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    int getId() {
        return id;
    }

    @Override
    void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
