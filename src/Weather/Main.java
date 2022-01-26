package Weather;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("김해시 오늘의 날씨");
        System.out.println("날짜를 입력하세요. ex)20220101");
        String baseDate = sc.nextLine();

        // baseData의 길이가 8이 아닐경우 멘트 출력 후 종료
        if (baseDate.length() != 8) {
            System.out.println("날짜 형식이 잘못되었습니다.");
            return;
        }

        // baseTime의 길이가 4가 아닐경우 멘트 출력 후 종료
        System.out.println("기준 시간을 입력해주세요 ex)0000 ~ 2300");
        String baseTime = sc.nextLine();
        if (baseTime.length() != 4) {
            System.out.println("시간 형식이 잘못되었습니다.");
            return;
        }

        // 스캐너로 입력받은 두 값을 weatherMap에 넣어준다.
        Map<String, String> weatherMap = DownloadWeather.weatherList(baseDate, baseTime);
        System.out.println("김해시 오늘의 날씨 (" + baseTime + ")시 기준");
        System.out.println("현재 온도 : " + weatherMap.get("T1H") + "도");
        System.out.println("현재 강수량 : " + weatherMap.get("RN1") + "mm");
        System.out.println("현재 습도 : " + weatherMap.get("REH") + "%");
        System.out.println("현재 풍속 : " + weatherMap.get("WSD") + "m/s");
    }
}
