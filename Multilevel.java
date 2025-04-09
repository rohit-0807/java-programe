package java1;


public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}
class A {
    void show1() {
        System.out.println("in class A");
    }

}

class B extends A {
    void show2() {
        System.out.println("in class B");
    }
}

class C extends B {
    void show3() {
        System.out.println("in class C");
    }
}


