package java1;
abstract class SunStar{
    abstract void printinfo();
}
class Employee extends SunStar{
    String name;
    int age;
    double salary;

    Employee(String n,int a,double s){
        name=n;
        age=a;
        salary=s;

    }

    @Override
    void printinfo() {
        System.out.println("Name is :"+name+"\n Age :"+age+"\n Salary :"+salary);
    }
}
public class AbstractCls {
    public static void main(String[] args) {
        Employee emp=new Employee("Rohit",25,50000.0);
        emp.printinfo();
    }
}
