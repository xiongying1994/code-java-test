package jiangsuTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Everything {
    public static void main(String[] args) {
        String beginDate = "2018-02-01";
        String endDate = "";
        Long billingCycleId = 201902L;

        if (billingCycleId.compareTo((long)201903) <= 0) {
            System.out.println("<<<<<<<");
        } else {
            System.out.println(">>>>>");
        }

        String paymentDate = "2018-03-01 18:39:50";

        String a = paymentDate.substring(0,7).replace("-","");
        System.out.println(a);

        System.out.println(paymentDate.substring(0,7));
        System.out.println(paymentDate.substring(2));

        StringBuilder calledNBR = new StringBuilder();
        String calledNBRInfo = "123456789";
        System.out.println("calledNBR1111: " + calledNBRInfo.length() / 2);
        if (calledNBRInfo.length() > 7) {
            calledNBR.append(calledNBRInfo, 0, 3).append("****").append(calledNBRInfo, 7, calledNBRInfo.length());
        } else if (calledNBRInfo.length() > 4) {
            calledNBR.append(calledNBRInfo, 0, calledNBRInfo.length() / 2).append("**").append(calledNBRInfo, calledNBRInfo.length() / 2 + 2, calledNBRInfo.length());
        } else {
            calledNBR.append(calledNBRInfo, 0, calledNBRInfo.length() / 2).append("*").append(calledNBRInfo, calledNBRInfo.length() / 2 + 1, calledNBRInfo.length());
        }
        System.out.println("calledNBR: " + calledNBR);

        System.out.println("calledNBR222222 : " + calledNBRInfo.substring(1,1));

        Map requestMap = new HashMap();
        requestMap.put("tableName","11111");
        requestMap.put("cycle","222222");
        requestMap.put("acctID","333333");
        requestMap.put("servID","444444");

        List<Map> mapList1 = new ArrayList<>();
        mapList1.add(requestMap);
        mapList1.add(requestMap);
        mapList1.add(requestMap);

        Map requestMap2 = new HashMap();
        requestMap2.put("requestMap",mapList1);
        List<Map> mapList2 = new ArrayList<>();
        mapList2.add(requestMap2);
        mapList2.add(requestMap2);

        System.out.println(mapList2);
    }
}
