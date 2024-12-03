class Human{
    String name;
    int age;
    int salary;
    boolean married;
    

    Human(int age,String name,int salary,boolean  married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
    }

}

public class Lect2{
    public static void main(String[] args) {
        Human h1 = new Human(10, "Mudassir", 5000, false);
        
    }
}