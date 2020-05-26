import importantCode.junzong.entity.Home;
import importantCode.junzong.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongying
 */
public class Test {

    public static void main(String[] args) {


        Student s = new Student();

        Home h = new Home();
        h.setMother("a");
        h.setSister("b");

        Home h2 = new Home();
        h2.setMother("c");
        h2.setSister("d");

        s.setHome(h);

        List<Home> hs = new ArrayList<>();
        hs.add(h);
        hs.add(h2);

        s.setHomeList(hs);

        System.out.println(s.getHomeList());
    }
}
