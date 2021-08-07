package design_patterns.dao_pattern;

public class User {
    // Data
    private String name;
    private String email;

    // Constructors
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methods


    //@Override
    //public String toString() {
    //    return "User{" +
    //            "name='" + name + '\'' +
    //            ", email='" + email + '\'' +
    //            '}';
    //}
}
