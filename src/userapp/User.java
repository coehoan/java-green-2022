package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(생성자)
@Data // Getter, Setter, toString
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
