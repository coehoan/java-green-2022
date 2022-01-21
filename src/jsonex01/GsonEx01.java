package jsonex01;

import com.google.gson.Gson;

//Dto - Data Transfer Object 데이터 통신을위한 오브젝트
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "UserDto [password=" + password + ", username=" + username + "]";
    }
}

public class GsonEx01 {
    public static void main(String[] args) {
        // JavaObject -> json 으로 변경 (데이터 전송을 위해)
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson(); // toJson(), fromJson()
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // Json -> JavaObject로 변경 (데이터 다운로드)
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(userDto.toString());
    }
}
