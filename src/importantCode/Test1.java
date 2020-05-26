package importantCode;

/**
 * 父类子类
 * 继承，重载，重写
 * 类的读取顺序的经典题型
 *
 * 加载时
 * 类的静态方法体优先
 * 父类优先
 * 调用方法时，子类存在的方法，使用子类重载的方法。
 */
class A{
    public String show(D obj){
        int i = 1,j = 0;
        //注意：这里它没有break出去，所以会依次向下计算
        switch(i){
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            default:
                j += 2;
            case 0:
                j += 4;
        }
        return ("A and D")+j;
    }
    public String show(C obj){
        return ("A and C");
    }
    public String show(A obj){
        return ("A and A");
    }
}
class B extends A{
    public String show (B obj){
        String a = new String("abc");
        String b = new String("abc");

        String c = "abc";
        String d = "abc";
        return ""+(d==c)+";"+(a==b);
    }

    @Override
    public String show(A obj){
        return ("B and A");
    }
}
class C extends B{

}
class D extends B{

}
public class Test1{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("1 "+a1.show(b));
        System.out.println("6 "+a2.show(d));
        System.out.println("8 "+ b.show(c));
        System.out.println("9 "+ b.show(d));
        System.out.println("10"+ b.show(a1));
        System.out.println("11"+ a1.show(a2));
        System.out.println("12"+ d.show(b));
    }
}


