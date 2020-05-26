package usefuldemo.lambda;

import usefuldemo.lambda.entity.billingCycleId;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaTest {

    public static void main(String[] args) {
        List<billingCycleId> oweTableNameList = new ArrayList<billingCycleId>();
        billingCycleId one = new billingCycleId();
        one.setBillingCycleId(111111L);
        billingCycleId two = new billingCycleId();
        two.setBillingCycleId(121L);
        billingCycleId three = new billingCycleId();
        three.setBillingCycleId(23L);
        billingCycleId one1 = new billingCycleId();
        one1.setBillingCycleId(111111L);
        billingCycleId one2 = new billingCycleId();
        one2.setBillingCycleId(111111L);
        billingCycleId one3 = new billingCycleId();
        one3.setBillingCycleId(12312L);

        oweTableNameList.add(one);
        oweTableNameList.add(two);
        oweTableNameList.add(three);
        oweTableNameList.add(one1);
        oweTableNameList.add(one2);
        oweTableNameList.add(one3);


        billingCycleId sumOweFee = new billingCycleId();
        sumOweFee.setlBillingCycleId(111111L);
        System.out.println(oweTableNameList);
        oweTableNameList = oweTableNameList.stream().filter(o -> o.getBillingCycleId().compareTo(sumOweFee.getlBillingCycleId()) == 0).collect(Collectors.toList());
        System.out.println(oweTableNameList);
    }
}
