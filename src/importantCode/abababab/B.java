package importantCode.abababab;

class B extends A {
    private static int numB;
    private int numB2;

    static {
        System.out.println("B的静态字段 : " + numB);
        System.out.println("B的静态代码块");
    }

    {
        System.out.println("B的成员变量 : " + numB2);
        System.out.println("B的非静态代码块");
    }

    public B() {
        System.out.println("B的构造器");
    }

    //添加了子类的有参方法，指定super() 的话，默认调用的依然是父类的无参构造
//    public B(int n) {
//        super(n);
//        System.out.println("B的有参构造");
//        this.numB2 = n;
//    }

    public B(int n) {
//        super();
        this();
        System.out.println("B的有参构造");
        this.numB2 = n;
    }

}