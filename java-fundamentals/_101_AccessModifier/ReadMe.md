
# Java Access Modifiers

Access modifiers in Java determine the visibility or accessibility of classes, constructors, methods, and variables. There are **four** types of access modifiers in Java:

## 1. `private`
- **Scope:** Class-level only
- **Accessible Within:** Same class only
- **Not Accessible In:**
    - Other classes
    - Subclasses (even in the same package)
    - Other packages

### ✅ Use Case:
Use `private` for variables and methods that should not be accessed outside the class.

```java
class Example {
    private int data = 10;

    private void show() {
        System.out.println("Private Method");
    }
}
```

---

## 2. `default` (No modifier)
- **Scope:** Package-level
- **Accessible Within:**
    - Same class
    - Other classes in the **same package**
- **Not Accessible In:**
    - Other packages
    - Subclasses in other packages

### ✅ Use Case:
Use default access when you want classes or members to be accessible within the same package.

```java
class Example {
    int data = 10; // default access

    void show() {
        System.out.println("Default Method");
    }
}
```

---

## 3. `protected`
- **Scope:** Package + Inherited in Subclasses
- **Accessible Within:**
    - Same class
    - Classes in the **same package**
    - Subclasses in **any package** (via inheritance)
- **Not Accessible In:**
    - Non-subclass classes in other packages

### ✅ Use Case:
Use `protected` when a member should be visible to subclasses or other classes in the same package.

```java
class Example {
    protected int data = 10;

    protected void show() {
        System.out.println("Protected Method");
    }
}
```

---

## 4. `public`
- **Scope:** Global
- **Accessible Within:**
    - Any class, any package

### ✅ Use Case:
Use `public` when you want a class or its members to be accessible from anywhere in the application.

```java
public class Example {
    public int data = 10;

    public void show() {
        System.out.println("Public Method");
    }
}
```

---

## 🔒 Access Modifier Table

| Access Modifier | Same Class | Same Package | Subclass (Different Package) | Other Packages |
|-----------------|------------|--------------|------------------------------|----------------|
| `private`       | ✅         | ❌           | ❌                           | ❌             |
| *default*       | ✅         | ✅           | ❌                           | ❌             |
| `protected`     | ✅         | ✅           | ✅                           | ❌             |
| `public`        | ✅         | ✅           | ✅                           | ✅             |

---

## 🧠 Notes & Tips

- **Top-level classes** can only be `public` or default (package-private).
- You cannot declare top-level classes as `private` or `protected`.
- Members of an interface are `public` by default.
- Avoid using `public` for everything — use **least privilege** principle.
- Use `private` + **getters/setters** (encapsulation) for better control.
- Inheritance respects access levels; overridden methods cannot reduce visibility.
- Use `protected` when designing a class meant to be **extended**.
- **Constructor visibility** defines object creation scope:
    - `private` constructor → Singleton or Factory Pattern
    - `protected` constructor → Object creation restricted to package/subclass

---

## 🎯 Real-World Analogy

| Modifier   | Analogy                             |
|------------|--------------------------------------|
| `private`  | Key to your personal locker          |
| `default`  | Entry restricted to building members |
| `protected`| Entry allowed for family + building  |
| `public`   | Open to the public                   |

---

## ✅ Best Practices

- Always restrict access as much as possible (start with `private`).
- Use `public` only when necessary (e.g., APIs, SDKs).
- Use `protected` for extensibility in OOP design.
- Refactor large classes with too many `public` methods.

---

## 📘 Interview Prep Points

- Difference between `default` and `protected`
- Why use `private` constructor?
- Can we override `private` methods? (❌)
- Can a subclass access `protected` members of a superclass in another package? (✅ via inheritance)
- Can top-level classes be `protected`? (❌)
