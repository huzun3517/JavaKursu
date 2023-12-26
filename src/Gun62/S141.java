package Gun62;

public class S141 {
}

class Employee{
    String name;
    boolean contract;
    double salary;

    Employee(){
        //this("joe", true, 100); buranın çalışacağı bir consructor yok

        this.name=new String("joe");
        this.contract=new Boolean(true);
        this.salary=new Double(100);
        // line n1
    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Joe";
        e.contract=true;
        e.salary =100;

        //this.name bu şekilde kullanılamaz.

        // line n2

        System.out.println(e);
    }

}
