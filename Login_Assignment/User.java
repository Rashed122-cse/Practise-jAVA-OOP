package Login_Assignment;

public class User {
    private String name;
    private String id;
    private String password;  //


    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', id='" + id + "', password='" + password + "'}";
    }
}
