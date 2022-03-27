package homework8;

//Java program to overload constructors
public class P25ConstructorOverloading {
    int id;
    String name;
    int age;

    //creating two arg constructor
    P25ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    P25ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        P25ConstructorOverloading s1 = new P25ConstructorOverloading(111, "Karan");
        P25ConstructorOverloading s2 = new P25ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
