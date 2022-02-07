package corona;

import java.util.List;
import java.util.Scanner;

import corona.CoronaDto.Body.Items.Item;

// String startCreateDt, String endCreateDt

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국내 코로나19감염현황 조회 서비스");
        System.out.println("시작 일자를 입력해주세요 ex)20220101");
        String startCreateDt = sc.nextLine();
        // startCreateDt의 길이를 8자로 제한
        if (startCreateDt.length() != 8) {
            System.out.println("잘못된 날짜를 입력하셨습니다.");
            return;
        }

        System.out.println("종료 일자를 입력해주세요 ex)20220131");
        // endCreateDt의 길이를 8자로 제한
        String endCreateDt = sc.nextLine();
        if (endCreateDt.length() != 8) {
            System.out.println("잘못된 날짜를 입력하셨습니다.");
            return;
        }
        // 입력받은 두 값을 coronaList으로 전송
        List<Item> coronaList = DownloadCorona.getCoronaList(startCreateDt, endCreateDt);
        for (int i = 0; i < coronaList.size(); i++) {
            System.out.println("국내 코로나19감염현황");
            System.out.println("조회일자 : " + startCreateDt + " ~ " + endCreateDt);
            System.out.println("기준일 : " + coronaList.get(i).getStateDt());
            System.out.println("기준시간 : " + coronaList.get(i).getStateTime());
            System.out.println("누적 의심신고 검사자수 : " + coronaList.get(i).getAccExamCnt());
            System.out.println("확진자 수 : " + coronaList.get(i).getDecideCnt());
            System.out.println("사망자 수 : " + coronaList.get(i).getDeathCnt());
            System.out.println("===========================================");
            System.out.println("게시글 번호 : " + coronaList.get(i).getSeq());
            System.out.println("등록일 : " + coronaList.get(i).getCreateDt());
            System.out.println("등록일 : " + coronaList.get(i).getUpdateDt());
            System.out.println("===========================================");
        }
    }
}
