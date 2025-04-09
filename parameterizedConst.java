package java1;
class first{
    int age;
    String name;

    first(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class parameterizedConst {
    public static void main(String[] args) {
        first obj=new first("Rahul",25);
        obj.display();
    }
}
