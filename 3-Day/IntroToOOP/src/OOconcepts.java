abstract class Animal{ // Asbstraction

    private String name; // Encapsulation

    //Constructor
    public Animal(String name){

        this.name = name;
    }
    // Getter method for Encapsulation
    public String getName(){
        return name;
    }

    public abstract void makeSound(); // for Abstraction

}

class Dog extends Animal{ // Inheritance
    // Constructor
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName()+"Says: Something");
    }

}

class Cat extends Animal{

    // Constructor
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName()+" says : Cat Something");
    }

}


