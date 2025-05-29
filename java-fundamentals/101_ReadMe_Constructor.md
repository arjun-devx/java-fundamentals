
# Java Memory Concepts and Core Terms

## 1. JDK, JVM, JRE

### 🔹 JVM (Java Virtual Machine)
- **What**: A virtual machine that runs Java bytecode.
- **Role**: Executes compiled `.class` files.
- **Platform-Dependent**: JVMs differ for Windows, macOS, Linux, etc., but run the same bytecode.

### 🔹 JRE (Java Runtime Environment)
- **What**: Contains the JVM + standard libraries + supporting files.
- **Use**: Required to run Java applications.
- **Excludes**: Development tools like `javac`.

### 🔹 JDK (Java Development Kit)
- **What**: JRE + tools for development (compiler, debugger, etc.).
- **Includes**: `javac`, `jar`, `javadoc`, etc.
- **Use**: Required to develop Java programs.

---

## 2. Heap Memory vs Stack Memory

### 🔸 Stack Memory
- **Used For**: Method invocations and local variables.
- **LIFO**: Last-In-First-Out structure.
- **Thread-specific**: Each thread has its own stack.
- **Size**: Usually small and fast to access.
- **Lifecycle**: Memory is automatically deallocated once the method exits.

### 🔸 Heap Memory
- **Used For**: All class instances and arrays (objects).
- **Shared**: All threads share heap memory.
- **Managed by GC**: Garbage Collector handles deallocation.
- **Size**: Larger compared to stack.
- **Lifecycle**: Exists until explicitly dereferenced and GC cleans it.

---

## 3. Class, Object, Constructor

### 🔹 Class
- Blueprint/template for creating objects.
- Contains fields (variables) and methods (functions).

```java
class Car {
    String color;
    void drive() {
        System.out.println("Driving...");
    }
}
```

### 🔹 Object
- An instance of a class.
- Occupies memory in the heap.

```java
Car myCar = new Car();
```

---

## 4. Constructor in Java

### 🔸 What is a Constructor?
- A special method that is invoked when an object is created.
- It has the same name as the class and **no return type**.

### 🔸 Why Constructors?
- Initializes the object’s state (fields).
- You can overload them to initialize objects differently.

### 🔸 Types of Constructors

#### ✅ Default Constructor
Automatically provided by Java if no other constructor is defined.

```java
class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
}
```

#### ✅ Parameterized Constructor

```java
class Bike {
    String model;
    Bike(String modelName) {
        model = modelName;
    }
}
```

#### ✅ Copy Constructor (Java doesn't have one by default like C++)
But you can define one:

```java
class Bike {
    String model;
    Bike(Bike other) {
        this.model = other.model;
    }
}
```

---

## 5. Visual Representation

### 🔸 Stack vs Heap Memory

```plaintext
+---------------------+             +-------------------------+
|     Stack Memory    |             |       Heap Memory       |
+---------------------+             +-------------------------+
| main() frame        |             |   Object: Car           |
|  - myCar (ref)------|-----------> |  color = "red"          |
|  - local vars       |             |                         |
+---------------------+             +-------------------------+
| drive() frame       |
+---------------------+
```

- Stack stores **method calls**, **primitives**, and **references to objects**.
- Heap stores **actual objects**.

---

## 6. Summary Table

| Term        | Description                            | Memory Area |
|-------------|----------------------------------------|-------------|
| Class       | Blueprint for object                   | -           |
| Object      | Instance of class                      | Heap        |
| Constructor | Initializes object                     | -           |
| Stack       | Stores method calls and local vars     | Stack       |
| Heap        | Stores all objects                     | Heap        |
| JVM         | Runs Java bytecode                     | -           |
| JRE         | JVM + standard libraries               | -           |
| JDK         | JRE + development tools                | -           |


## 📌 JDK, JRE, and JVM Diagram

![JDK vs JRE vs JVM](https://www.geeksforgeeks.org/wp-content/uploads/jdk-jre-jvm.png)

*Source: [GeeksforGeeks](https://www.geeksforgeeks.org/differences-jdk-jre-jvm/)*

## 📌 Stack vs Heap Memory Allocation

![Stack vs Heap Memory](https://www.geeksforgeeks.org/wp-content/uploads/Stack-and-Heap-Memory-in-Java.png)

*Source: [GeeksforGeeks](https://www.geeksforgeeks.org/java-stack-vs-heap-memory-allocation/)*

