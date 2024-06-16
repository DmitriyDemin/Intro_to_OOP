package Lecture_3.Ex000;

public class Program {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m1() {
                System.out.println("qwer");

            }

            @Override
            public void m2() {
                System.out.println("][po");

            }
        };
        foo.m1();
        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("fgfgfg454");

            }

            @Override
            public void m2() {
                System.out.println("gdfgfg67658");

            }
        };
        foo1.m2();
    }
}
