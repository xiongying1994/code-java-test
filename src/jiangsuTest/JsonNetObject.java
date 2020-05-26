package jiangsuTest;

import com.alibaba.fastjson.JSONObject;

/**
 * JSON 赋值的方法方式
 */
public class JsonNetObject {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("routeFlag",0);
        jsonObject.put("routeValue","");

        JSONObject J2 = new JSONObject();

        J2.put("queryFlag", 1);
        J2.put("queryType", 1);
        J2.put("queryValue", 1);
        J2.put("stateValue", 1);
        J2.put("staffID", 969904634);

        JSONObject j3 = new JSONObject();
        j3.put("refundsValBalance",J2);


        System.out.println(j3.toJSONString());

//        JSONObject j4 = j3.get("refundsValBalance");

    }
}
