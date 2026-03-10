public class person {
    // create a class person constructor that accept paramenter name ans age after that it prints
    String name;
    int age;
    public person(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}