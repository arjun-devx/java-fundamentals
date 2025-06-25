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

        System.out.println(" ------------- ");
        //Below objects are for understanding the Anonymous class
        //Since the interface does not allow object creation directly, we need to keep on implementing the interface through a class and then create objects
        //and if the implemented class isy not very reusable then creating multiple class implementations makes code length unnecessarily without any reusability.
        StatusNodeValidator statusNodeValidator = new StatusNodeValidator();
        statusNodeValidator.validate();

        ReviewNodeValidator reviewNodeValidator = new ReviewNodeValidator();
        reviewNodeValidator.validate();
        //now in order to overcome the above points - we can implement using the anonymous class
        Validator statusNodeValidatorAnonymousClass = new Validator() {
            @Override
            public Boolean validate() {
                System.out.println("Status Node Validator printing through the Anonymous Class");
                return true;
            }
        };
        statusNodeValidatorAnonymousClass.validate();
        //InterfaceName objectName = new InterfaceName(); - does not work / not allowed
        // instead
        //InterfaceName objectName - new InterfaceName {
        //      Implement all the methods for the interface;
        // };
        Validator reviewValidatorAnonymousClass = new Validator() {
            @Override
            public Boolean validate() {
                System.out.println("Review Node Validator printing through the Anonymous Class");
                return true;
            }
        };
        reviewValidatorAnonymousClass.validate();

        //Lambda - lambdas -> is shorter code for anonymous class implementation, for Functional Interface
        Validator lambdaExampleObject = () -> {
            System.out.println("lambda equivalent of the Anonymous class above");
            return true;
        };
        lambdaExampleObject.validate();

        //Lambda - i can further make it shorter. no need of curly braces if single line of code. and no need for return
        Validator lambdaShorterObject = () -> true;
        lambdaShorterObject.validate();


        //Runnable functional interface with lambda implementation using single line without creating a separate class to implement the Runnable interface
        Runnable helloWorldPrinter = () -> System.out.println("Hello World from " + Thread.currentThread().getName());
        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();

        Thread thread2 = new Thread( () -> {
            System.out.println("Hello World from " + Thread.currentThread().getName());
        }
        );
        thread2.start();
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

    //Animal Extends LivingBeing
    List<?> allList = new ArrayList<>();
    List<? extends Animal> animalAndChildrenList = new ArrayList<>();
    List<? super Animal> animalAndSuperList = new ArrayList<>();
    List<Animal> animalList = new ArrayList<>();

}