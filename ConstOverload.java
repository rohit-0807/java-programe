package java1;

class A {
    String name;
    int age;

    A() {
        name = "unknown";
        age = 0;
    }

    A(String s,int a) {
        name = s;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class ConstOverload {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
        A a2 = new A("John", 25);
        a2.show();
    }
}
