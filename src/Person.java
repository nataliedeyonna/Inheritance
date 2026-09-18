public class Person {
    // height, age, color, name, weight: instance variable
    double height;

    int age;

    String color;

    String name;

    double weight;


    // Constructors can have private, protected, public access modifiers
    public Person(){
        // default constructor can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;

    }
    // Protected members are accessible with the same package- java files under same directory/folder
    protected Person(double height,int age){
        this.height = height;
        this.age = age;

    }

    //Overloaded constructor
    private Person(double height,int age, String color, String name, double weight){
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    //setters and getters
    //methods
    public Person Call_Private(){
        Person p3 = new Person(72, 70, "Black", "Barack Obama", 170);
        return p3;
    }
}