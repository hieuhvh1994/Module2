package authentication;

import java.io.Serializable;

public class Account implements AbstractUser, Serializable {
    private String username;
    private String password;
    private AccountLevel role;
    private String fullName;
    private int id;

    public Account(String username, String password, AccountLevel role, String fullName, int id) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.id = id;
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public AccountLevel getRole() {
        return role;
    }

    @Override
    public void setRole(AccountLevel role) {
        this.role = role;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
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
