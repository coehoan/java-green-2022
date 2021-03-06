package Data00Test;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AirportDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;
    }

    @AllArgsConstructor
    @Data
    class Header {
        private String resultCode;
        private String resultMsg;
    }

    @AllArgsConstructor
    @Data
    class Body {
        private Items items;

        @AllArgsConstructor
        @Data
        class Items {
            private List<AirportItem> item;

            @AllArgsConstructor
            @Data
            class AirportItem {
                private String airportId;
                private String airportNm;
            }
        }
    }
}
