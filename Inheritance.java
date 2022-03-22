class Animal {
    public void identity(){
        System.out.println("I am an animal");
    }
}
class Dog extends Animal{
    public void identity(){
        System.out.println("I am a dog");
    }
}
class Cat extends Animal{
    public void identity(){
        System.out.println("I am a cat");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj1.identity();
        obj2.identity();
    }
}
