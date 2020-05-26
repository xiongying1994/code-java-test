package old.intoandout;

import java.util.ArrayList;
import java.util.List;

public class unxi {
    public static void main(String[] args) {
        Integer ints = new Integer(5);
        Integer integer1 = new Integer(6);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (item.equals("1")) {
//                iterator.remove();
//            }
//        }
        for(String item:list){
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }

}
