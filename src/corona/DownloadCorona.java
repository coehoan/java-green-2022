package corona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import corona.CoronaDto.Body.Items.Item;

public class DownloadCorona {
    // url 다운받기
    public static List<Item> getCoronaList(String startCreateDt, String endCreateDt) {
        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startCreateDt + "&endCreateDt=" + endCreateDt + "&_type=json");
            // Http 연결 conn
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // BuffredReader로 내려받기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            // responseJson로 내려받기
            String responseJson = br.readLine();

            Gson gson = new Gson();
            // 내려받은 responseJson을 Json으로 변경
            CoronaDto dto = gson.fromJson(responseJson, CoronaDto.class);
            // result에 item 담기
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            return result;

        } catch (Exception e) {
            System.out.println("잘못된 정보");
            e.printStackTrace();
        }
        return null;
    }
}
