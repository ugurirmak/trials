package someudemy;

class Overloading {

    int q = 0;
    int w = q + 3;

    public void fa(short a) {
        System.out.println(a+1);
    }

    public void f(int a) {
        System.out.println(a-1);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        short a = 4;
        String fdsa = "jklj";
        overloading.f(a);
        int x = 1234;
        x = ~x;
        System.out.println(x);
        System.out.println(overloading.w);
        String[] sArray = fdsa.split("j");
        for(String text : sArray) {
            System.out.println("text:" + text);
        }
        Integer y = Integer.MAX_VALUE;
        int yy = y.intValue();
        System.out.println(yy);
        ABC abc =  new ABC();
        System.out.println(abc.x);
        Integer i1 = new Integer(25);
        Integer i2 = i1;

        System.out.println(i1 == i2);

        Extended extended = new Extended();
        extended.foo();

    }

    public static class ABC {
        final static int x;
        static {
            //f();
            x = 7;
        }
        public ABC() {
            //f();
        }

        public static void foo() {
            System.out.println("static f");
        }
    }

    public static class Extended extends ABC {



    }

    public static interface InterfaceA {

    }

    public static interface InterfaceB extends Cloneable, InterfaceA {

    }

}
