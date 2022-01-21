package jsonex01;

import java.util.HashMap;

import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */
public class MySMS {
    public static void main(String[] args) {
        String api_key = "NCS8OFX6GAFQ5YPA";
        String api_secret = "KOO6FLCC4TZXWO750FD3FRLHLLQETI9S";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", "01077996426");
        params.put("from", "01041235561"); // 등록된 번호
        params.put("type", "SMS");
        params.put("text", "안녕하세요 만갱씨");
        params.put("app_version", "test app 1.2"); // application name and version

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
    }
}