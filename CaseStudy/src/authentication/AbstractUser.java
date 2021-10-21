package authentication;

public interface AbstractUser {

    public String getUsername();

    public void setUsername(String username);

    public String getPassword();

    public void setPassword(String password);

    public AccountLevel getRole();

    public void setRole(AccountLevel role);

    public String getFullName();

    public void setFullName(String fullName);

    public int getId();

    public void setId(int id);



}
