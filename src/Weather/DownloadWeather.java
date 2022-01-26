package Weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import Weather.WeatherDto.Body.Items.Item;

public class DownloadWeather {
    // Map을 통해 데이터를 받아온다.
    // weatherList에는 스캐너로 입력 한 날짜와 시간을 넣는다.
    // weatherMap에 나머지 값을 넣는다.
    public static Map<String, String> weatherList(String baseDate, String baseTime) {
        Map<String, String> weatherMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D&numOfRows=10&pageNo=1&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=94&ny=77");
            // Http 다운캐스팅
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // utf-8 형식으로 JSON가변문자열을 받는다.
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 받아온 JSON문자열을 responseJson에 넣는다.
            String responseJson = br.readLine();
            Gson gson = new Gson();

            // responseJson에 넣은 JSON 문자열을 자바언어로 변환해준다.
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);

            // 변환해서 받은 Item을 result 리스트에 넣어준다
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            // weatherMap에 나머지값을 넣은 후 리턴
            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
            return weatherMap;
        } catch (Exception e) {
            System.out.println("잘못된 정보");
        }
        return null;
    }
}