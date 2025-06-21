import advancedConcepts.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //For understanding "Generic" -
        Calculator<Integer, String> calculator = new Calculator<>();
        calculator.print(4, "test");
        Calculator<String, Integer> calculator1 = new Calculator<>();
        calculator1.print("passing string", 5);

        System.out.println("Hello world!");
        HashMap<Integer, String> map = new HashMap();

        Calculator<String, Double> calculator2 = new Calculator<>();
        calculator2.print("Calculator2 String", 1.1);

        HashMap<Calculator<String, Double>, String> map1 = new HashMap<>();
        map1.put(calculator2, "test");

        //Generics
        //ClassName objName = new ClassName();
        //new ClassName(); -- this is supported for generics -- but not recommended
        //new ClassName<>(); -- this is supported for generics -- and it is recommended way of implementing generics.

        //Integer -- int
        //Boolean -- boolean
        //Double -- double --> Double/Integer/Boolean these are wrapper classes
        //Generic only supports - objects -> Object Class
        //Generics dont support primitive variables, it only supports object as it is built on top of object class
        //We  need to use the wrapper classes for the primitive variables, for example:
        Integer i = 10;
        int x = i;

        int y = 10;
        Integer z = y;
        //This is called Auto-boxing -- automatically converts wrapper class object to primitive and vice-versa


        //Testing upcasting and downcasting -
        //upcasting is implicit and is supported by default by Java || Implicit Casting || Upcasting
        //old remote new tv analogy
        TV tvObj = new SmartTV();
        tvObj.channel();
        tvObj.volume();

        //Downcasting is explicit and requires to put (SmartTV) explicitly in front of the object
        //new remote old tv analogy
        TV tvObj2 = new SmartTV();
        SmartTV tvSmartObj = (SmartTV) tvObj2;
        tvSmartObj.volume();

        Animal animal = new Animal();
        Dog dog = new Dog();
        print(animal);
        print(dog); //when you call print method with dog object - it is an upcasting example: Animal animal = new Dog();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        System.out.println("------------------");
        print(animalList);
       // print(dogList); upcasting inside the generics does not work || List<Animals> is at the same level as List<Dog> because both are nothing but lists
        //

        AnimalPrinter<Animal> animalPrinter = new AnimalPrinter<>();
        animalPrinter.print(animal);
        animalPrinter.print(dog);
    }
    //Dog extends Animal -
    public static void print(Animal animal) {
        animal.print();
    }

    public static void print(List<Animal> animalList) {
        System.out.println("printing from the list");
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).print();
        }
    }

}