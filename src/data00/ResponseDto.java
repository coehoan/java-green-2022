package data00;

import java.util.List;

public class ResponseDto {
    private Response response; // 변수명을 동일하게
}

class Response {
    private Header header; // 변수명을 동일하게
    private Body body; // 변수명을 동일하게
}

class Header {
    private String resultCode;
    private String resultMsg;
}

class Body {
    private Items items;
    private int numOfRows;
    private int pageNo;
    private int totalCount;
}

class Items {
    private List<Item> item;
}

class Item {
    private String airlineNm;
    private String arrAirportNm;
    private String arrPlandTime;
    private String depAirportNm;
    private String depPlandTime;
    private int economyCharge;
    private int prestigeCharge;
    private String vihicleId;
}