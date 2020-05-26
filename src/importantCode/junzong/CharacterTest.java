package importantCode.junzong;

import importantCode.junzong.entity.CommonEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 一堆基础类型与封装类型
 * 1、基础类型在对象初始化后，都是有默认值的，都是0；封装类型在对象初始化后，都是null；String在对象初始化后也是null
 */
public class CharacterTest {
    public static void main(String[] args) {
        CommonEntity commonEntity = new CommonEntity();
        System.out.println(commonEntity.getOnePlus());


        int[] price = new int[]{1,2,12,2};
        price[0] = 4;
        for (int a : price) {
            System.out.println(a);
        }
        HashMap map = new HashMap();
        List list = new ArrayList();


        String[] a = new String[1];
        System.out.println(a.getClass() + "     初始化默认类型：" + a[0]);
        int[] b = new int[1];
        System.out.println(b.getClass() + "     初始化默认类型：" + b[0]);
        boolean[] c = new boolean[1];
        System.out.println(c.getClass() + "     初始化默认类型：" + c[0]);
        char[] d = new char[1];
        System.out.println(d.getClass() + "     初始化默认类型：" + d[0]);
        CommonEntity[] e = new CommonEntity[1];
        System.out.println(e.getClass() + "     初始化默认类型：" + e[0]);


        String st = "\u6c49";
        System.out.println(st);
        System.out.println(st.length());
        System.out.println(st.codePointCount(0,st.length()));
    }

    public static void printMsg(boolean debug, String ... msgs){
        if (debug){
            // 打印消息的长度
            System.out.println("DEBUG: 待打印消息的个数为" + msgs.length);
        }
        for (String s : msgs){
            System.out.println(s);
        }
        if (debug){
            // 打印消息的长度
            System.out.println("DEBUG: 打印消息结束");
        }
    }
}
