package topics.functional_programming.function_class_demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ramesh", "secret", "ramesh@gmail.com"));
        users.add(new User(2, "Tony", "secret", "tony@gmail.com"));
        users.add(new User(3, "David", "secret", "david@gmail.com"));

        //List<UserDTO> usersDTO = new ArrayList<>();
        //for (User user : users) {
        //    usersDTO.add(new UserDTO(user.getId(), user.getUsername(), user.getEmail()));
        //}

        // using stream().map()
        List<UserDTO> usersDTO_2 = users.stream()
                .map((User user) -> new UserDTO(user.getId(), user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());

        usersDTO_2.forEach(System.out::println);
    }

}

class UserDTO {
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
    }
}

class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}