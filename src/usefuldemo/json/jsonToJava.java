package usefuldemo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import usefuldemo.json.JsonBigEntity;
import usefuldemo.json.JsonEntity;

/**
 * JSON
 */
public class jsonToJava {

    public static void main(String[] args) {
        //language=JSON
        String json = "{\n" +
                "  \"CHARGE_CNT_CH\": \"0(元)\",\n" +
                "  \"DURATION_CNT_CH\": \"194小时12分钟5秒\",\n" +
                "  \"IRESULT\": \"0\",\n" +
                "  \"SMSG\": \"查询成功\",\n" +
                "  \"TOTAL_BYTES_CNT\": \"14943.96MB\",\n" +
                "  \"TRANSACTION_ID\": \"9999120190926101754046205554423741\",\n" +
                "  \"data\": [{\n" +
                "    \"BYTES_CNT\": \"86KB\",\n" +
                "    \"CCG_PRODUCT_NAME\": \"其他\",\n" +
                "    \"DURATION\": \"2312\",\n" +
                "    \"DURATION_CH\": \"38分钟32秒\",\n" +
                "    \"PRODUCT_ID\": \"100000379\",\n" +
                "    \"SERVICE_TYPE\": \"4G(LTE)\",\n" +
                "    \"START_TIME\": \"2019-09-0108:14:42\",\n" +
                "    \"TICKET_CHARGE_CH\": \"0.00\",\n" +
                "    \"TICKET_NUMBER\": \"1\",\n" +
                "    \"TICKET_TYPE\": \"江苏南京\"\n" +
                "  }]\n" +
                "}";

        JSONObject reponseObject = JSON.parseObject(json);
        JsonEntity jsonEntity = JSONObject.toJavaObject(reponseObject, JsonEntity.class);

        System.out.println(jsonEntity);

        String jsonString = JSON.toJSONString(jsonEntity);
        System.out.println(jsonString);

        System.out.println("12qw3123123123123");

        JsonBigEntity jsonBigEntity = new JsonBigEntity();
        System.out.println(jsonBigEntity.getNAME());

        String JSONString = JSON.toJSONString(jsonBigEntity);
        System.out.println(JSONString);

    }

}
