package importantCode.abababab;


import java.util.HashMap;
import java.util.Map;

public class ClassLoad {
    public static void main(String[] args) {
//        B anotherB = new B(1);// 思考有参构造的输出结果
//        List<B> b = new ArrayList<>();
//        b.add(new B(1));

        Map<Integer,B> b1 = new HashMap();
        b1.put(1,new B(1));
    }

}
