package btap5;

public class User {
    private String ussername;
    private String email;
    private String password;

    public User(String ussername, String email, String password) {
        this.ussername = ussername;
        this.email = email;
        this.password = password;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String username, String password) {
        if (this.ussername.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public void register() {
        System.out.println("User registered: " + ussername);
    }

    public void logout() {
        System.out.println("User logged out: " + ussername);
    }
}
