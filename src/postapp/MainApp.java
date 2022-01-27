package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            // 통신 오류 확인코드
            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return;
            }
            // 프로그램 실행
            // System.out.println(dto.getData().size()); - 데이터 사이즈 확인
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("TITLE : " + dto.getData().get(i).getTitle());
                System.out.println("CONTENT : " + dto.getData().get(i).getContent());
                System.out.println("생성일 : " + dto.getData().get(i).getCreated());
                System.out.println("최근변경일 : " + dto.getData().get(i).getUpdated());
                System.out.println("========회원정보========");
                System.out.println("회원번호 : " + dto.getData().get(i).getUser().getId());
                System.out.println("ID : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("PW : " + dto.getData().get(i).getUser().getPassword());
                System.out.println("e-mail : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("생성일 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("최근변경일 : " + dto.getData().get(i).getUser().getUpdated());
                System.out.println("====================================");
            }
        } catch (Exception e) {
            e.printStackTrace(); // 오류 추적
        }
    }
}
