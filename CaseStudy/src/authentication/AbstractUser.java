package authentication;

public abstract class AbstractUser {

    abstract String getUsername();

    abstract void setUsername(String username);

    abstract String getPassword();

    abstract void setPassword(String password);

    abstract String getRole();

    abstract void setRole(String role);

    abstract String getFullName();

    abstract void setFullName(String fullName);

    abstract int getId();

    abstract void setId(int id);



}
