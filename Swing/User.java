package Swing;

public class User {
    private String name;
    private String id;
    private String password;  // Add the password field

    // Constructor with password
    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;  // Initialize the password
    }

    // Getters for name, id, email, and password
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public String getPassword() {
        return password;  // Add getter for password
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', id='" + id + "', password='" + password + "'}";
    }
}
