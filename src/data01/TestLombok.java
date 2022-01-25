package data01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
class 사자 {
    private String name;
    private String color;
}

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        System.out.println(s.getName());
        System.out.println(s.getColor());
    }
}
