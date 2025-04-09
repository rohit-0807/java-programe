package java1;
class A{
    public void add(int a,int b){
        System.out.println("addition :"+(a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("addition :"+(a+b+c));
    }
}
public class methodOver {
    public static void main(String[] args) {
        A obj=new A();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}
