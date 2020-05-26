package usefuldemo;

import usefuldemo.entity.QueryCumulationData;
import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串分割后使用
 */
public class queryColumationTest {
    public static void main(String[] args) {
//        String quertValue = "|252409098813,3124,2|252409098813,3123,2|252409098813,3111,2|";
//        QueryCumulationData queryCumulationData = new QueryCumulationData();
//        List<QueryCumulationData> valueList = new ArrayList<>();
//        String[] value1 = quertValue.split("\\|");
//        System.out.println(value1);
//        for (String value : value1) {
//            if (!value.isEmpty()) {
//                String[] value2 = value.split(",");
//                if (value2.length != 3) {
//                    return;
//                }
//                queryCumulationData.setListofferId(value2[0] == null ? "-1" : value2[0]);
//                queryCumulationData.setAccuTypeId(value2[1] == null ? "-1" : value2[1]);
//                queryCumulationData.setAccuValue(value2[2] == null ? "-1" : value2[2]);
//                valueList.add(queryCumulationData);
//            }
//        }
//
//        String str = "'";
//        System.out.println(str);
//        System.out.println(StringEscapeUtils.escapeJava("-1"));
//
//        Object abc = 1 ;
//        System.out.println(abc.equals(1));

        Integer a = 127;
        System.out.println(a);

        Integer b = 127;
        System.out.println(a == b);

        int ad;
    }
}
