package importantCode.junzong;

import importantCode.junzong.entity.Home;
import org.apache.commons.beanutils.PropertyUtils;

public class TestDemoNull {

    public static void main(String[] args) {
        Home home = new Home();
        TestDemoNull testDemoNull = new TestDemoNull();
        testDemoNull.test(home);
        if (home.getFather() == null){
            System.out.println("123123123");
        }
    }

    private void test(Home home){
        TestDemoNull testDemoNull = new TestDemoNull();
        try {
            Home result = testDemoNull.homeTest();
            if (result != null){
//            home = result;
                PropertyUtils.copyProperties(home, result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Home homeTest(){
        return null;
    }
}
