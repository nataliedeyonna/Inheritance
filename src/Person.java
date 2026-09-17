public class Person {
    // height, age, color, name, weight
    double height;
    int age;
    String color;
    String name;
    double weight;

    public Person() {
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }



    protected Person(double height, int age) {
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    // Overloaded constructor
    private Person(double height, int age, String color, String name, double weight) {
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Person Call_Private(){
        Person p3 =  new Person (72, 70, "Black", "barakk Obama", 170);
        return p3;
    }
}