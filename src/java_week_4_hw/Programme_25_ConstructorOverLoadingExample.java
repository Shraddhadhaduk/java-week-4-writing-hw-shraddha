package java_week_4_hw;

//java programme to overload constructor
public class Programme_25_ConstructorOverLoadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme_25_ConstructorOverLoadingExample(int i, String n) {
        id = i;
        name = n;
    }

        //creating three arg constructor
        Programme_25_ConstructorOverLoadingExample(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25_ConstructorOverLoadingExample s1 = new Programme_25_ConstructorOverLoadingExample(111, "Karan");
        Programme_25_ConstructorOverLoadingExample s2 = new Programme_25_ConstructorOverLoadingExample(111, "Aryan", 25);
        s1.display();
        s2.display();
    }

}
