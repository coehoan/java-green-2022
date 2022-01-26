package Data00Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import Data00Test.FlightDto.Body.Items.FlightItem;

public class DownloadFlight {
    public static List<FlightItem> getFlightList(
            String depPlandTime,
            String depAirportNm,
            String arrAirportNm) {
        Map<String, String> airportMap = DownloadAirport.getAirportList();
        String depAirportId = airportMap.get(depAirportNm);
        String arrAirportId = airportMap.get(arrAirportNm);

        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId="
                            + depAirportId + "&arrAirportId=" + arrAirportId + "&depPlandTime="
                            + depPlandTime + "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            FlightDto dto = gson.fromJson(responseJson, FlightDto.class);
            List<FlightItem> result = dto.getResponse().getBody().getItems().getItem();
            return result;
        } catch (Exception e) {
            System.out.println("항공편 조회 오류");
        }
        return null;
    }

}
