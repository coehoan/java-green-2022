package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import data00.ResponseDto.Body.Items.Item;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");
            // 부모타입을 리턴 하는 이유
            // 자식이 http, https 뭐가 들어올지 모르니깐
            // 부모클래스를 바라보게해서 사용자가 다운캐스팅으로 직접 지정
            // conn -> ByteStream
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // default는 1Byte로 한글을 읽었기 때문에 깨져서 보인다.
            // utf-8 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);
            // System.out.println(dto);
        }
        // try문이 적용 안될 때 실행되는 부분
        catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }
    }
}
