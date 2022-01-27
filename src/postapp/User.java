package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private int id;
    private String title;
    private String content;
    private UserInfo user;
    private String created;
    private String updated;

    @AllArgsConstructor
    @Data
    class UserInfo {
        private int id;
        private String username;
        private String password;
        private String email;
        private String created;
        private String updated;
    }
}