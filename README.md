# **Introduction to Java Programming**


## **1. Basics of Java Programming**

- **Java** is a **high-level, object-oriented, platform-independent programming language** developed by **James Gosling** at Sun Microsystems (1995).
- Java programs are **“Write Once, Run Anywhere” (WORA)** due to the JVM (Java Virtual Machine).
- Used in: web apps, mobile apps (Android), enterprise software, desktop apps, and more.

---

## **2. JDK, JRE, and IDE**

### **JDK (Java Development Kit)**

- A software package for **developing Java applications**.
- Contains:
  - Compiler (`javac`)
  - JRE
  - Development tools (debugger, documentation generator, etc.)

### **JRE (Java Runtime Environment)**

- Provides the environment to **run Java programs**.
- Contains:
  - JVM
  - Core libraries (like `java.util`, `java.io`)
- **No compiler** → Only executes, cannot develop.

### **JVM (Java Virtual Machine)**

- Abstract machine that executes Java bytecode.
- Ensures platform independence.

### **IDE (Integrated Development Environment)**

- Software to **write, debug, and run Java programs easily**.
- Examples: **Eclipse, IntelliJ IDEA, NetBeans, VS Code**.

---

## **3. Features of Java**

- **Simple**: Syntax similar to C/C++.
- **Object-Oriented**: Supports classes, objects, inheritance, polymorphism.
- **Platform Independent**: Code compiles into bytecode which JVM executes on any OS.
- **Secure**: No explicit pointers, automatic memory management.
- **Robust**: Strong exception handling + garbage collection.
- **Multithreaded**: Supports running multiple tasks simultaneously.
- **High Performance**: Uses Just-In-Time (JIT) compiler.
- **Distributed**: Supports networking (e.g., RMI, sockets).

---

## **4. Compiling and Executing a Simple Java Program**

### Example:

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Steps:

1. Save as `HelloWorld.java`.
2. Compile: `javac HelloWorld.java` → creates `HelloWorld.class` (bytecode).
3. Run: `java HelloWorld`.

---

## **5. Programming Style**

- **Indentation & spacing** for readability.
- **Meaningful names** for variables, classes, methods.
- **Use of comments** for explanation.
- **Consistent naming conventions**:
  - Class names → PascalCase (`StudentInfo`)
  - Variable/method names → camelCase (`studentAge`)
  - Constants → ALL_CAPS (`MAX_VALUE`)

---

## **6. Variables**

- A **variable** is a named memory location to store data.
- Declaration format:
  ```java
  dataType variableName = value;
  ```
- Example:
  ```java
  int age = 20;
  ```

---

## **7. Data Types in Java**

### **Primitive Data Types (8 total)**

1. **Numeric**
   - Integer types: `byte (1B)`, `short (2B)`, `int (4B)`, `long (8B)`
   - Floating types: `float (4B)`, `double (8B)`
2. **Boolean**
   - `boolean flag = true;`
   - Only `true` or `false`.
3. **Character**
   - `char grade = 'A';`
   - 2 bytes (Unicode).

### **Non-Primitive Data Types**

- **String**: Sequence of characters.
  ```java
  String name = "Priyasha";
  ```

---

## **8. Operations on Data Types**

- **Arithmetic**: `+`, `/`, `%`, `-`, `*`
- **Relational**: `>`, `<`, `==`, `!=`, `>=`, `<=`
- **Logical**: `&&`, `||`, `!`
- **Assignment**: `=`, `+=`, `=`, `=`, `/=`
- **Increment/Decrement**: `++`, `--`
- **String operations**: concatenation (`+`), methods (`length()`, `toUpperCase()`, etc.)

---

## **9. Comments in Java**

- **Single-line**:
  ```java
  // This is a single-line comment
  ```
- **Multi-line**:
  ```java
  /* This is
     a multi-line comment */

  ```
- **Documentation comment (for Javadoc)**:
  ```java
  /**
   * This method adds two numbers
   */

  ```

---

## **10. Constants**

- Value that **does not change during program execution**.
- Declared with `final` keyword.

```java
final double PI = 3.14159;
```

---

## **11. Keywords**

- **Reserved words** with predefined meaning in Java.
- Cannot be used as identifiers.
- Examples: `class`, `public`, `static`, `void`, `int`, `final`, `if`, `else`, `return`, `switch`, `try`, `catch` etc.

---

## **12. Identifiers**

- **Names given to variables, methods, classes, etc.**
- Rules:
  - Cannot be a keyword.
  - Must start with a letter, `$`, or `_`.
  - Cannot contain spaces or special characters (except `_` and `$`).
  - Case-sensitive.
- Examples: `studentName`, `_count`, `$salary`.

---

## **🔑 Key Points / Quick Revision**

- JDK = Dev kit, JRE = Run env, JVM = Executor.
- Features → Simple, OOP, Secure, Portable, Robust, Multithreaded.
- Data types → 8 primitives + String.
- Constants → `final`.
- Identifiers → names for variables/classes, follow rules.
- Comments → `//`, `/* */`, `/** */`.
- Compilation → `javac filename.java`, Execution → `java filename`.

---

## **13. Numeric Type Conversion in Java**

In Java, **type conversion** is the process of converting one data type into another.

### **a) Widening Conversion (Type Casting / Implicit Conversion)**

- **Smaller type → Bigger type** (automatic by compiler).
- **Safe** (no data loss).
- Order: `byte → short → int → long → float → double`
- Example:
  ```java
  int num = 10;
  double d = num; // int automatically converted to double

  ```

### **b) Narrowing Conversion (Explicit Conversion)**

- **Bigger type → Smaller type**.
- Done **manually using type casting**.
- May cause **data loss or overflow**.
- Example:
  ```java
  double d = 9.78;
  int num = (int) d; // Explicit conversion, fractional part lost

  ```

### **c) Type Promotion in Expressions**

- In expressions, smaller types are **promoted to int** before calculation.
- Example:
  ```java
  byte a = 5, b = 6;
  byte c = (byte) (a + b); // a+b promoted to int, needs explicit cast back to byte

  ```

---

## **14. Arrays in Java**

- An **array** is a collection of **homogeneous elements** stored in **contiguous memory locations**.
- Fixed size (cannot be resized).

### **Declaration and Initialization**

```java
int[] arr = new int[5]; // declaration + memory allocation
int[] numbers = {10, 20, 30, 40}; // initialization

```

### **Accessing Elements**

```java
System.out.println(numbers[2]); // prints 30

```

### **Properties**

- Index starts at **0**.
- Stored in **heap memory**.
- Can be **1D, 2D, or Multidimensional**.

### **2D Array Example**

```java
int[][] matrix = { {1, 2}, {3, 4}, {5, 6} };
System.out.println(matrix[1][1]); // Output: 4

```

---

## **15. Advantages of Java**

1. **Platform Independent**: Bytecode runs anywhere JVM is installed.
2. **Object-Oriented**: Supports reusability, inheritance, encapsulation, polymorphism.
3. **Simple & Secure**: No pointers, automatic garbage collection.
4. **Robust**: Strong error handling and memory management.
5. **Multithreaded**: Multiple tasks can run in parallel.
6. **Portable**: Java code can run on different devices without modification.
7. **Distributed**: Supports networking and remote method invocation.
8. **High Performance**: JIT compiler makes execution faster.

---

## **16. Applications of Java**

Java is everywhere! Some common applications include:

1. **Desktop GUI Applications**
   - Swing, JavaFX (used in desktop apps like IDEs).
2. **Web Applications**
   - Server-side apps (JSP, Servlets, Spring, Hibernate).
3. **Mobile Applications**
   - Android apps are built using Java/Kotlin.
4. **Enterprise Applications**
   - Banking, billing, ERP systems. (e.g., large-scale backend services).
5. **Scientific Applications**
   - MATLAB uses Java for backend.
6. **Game Development**
   - Minecraft is written in Java.
7. **Cloud & Big Data**
   - Hadoop, Spark (data processing frameworks) are Java-based.

---

## **🔑 Quick Revision (Add-on Points)**

- **Numeric Type Conversion** → Widening (safe), Narrowing (explicit, data loss possible).
- **Arrays** → Fixed size, 0-based indexing, homogeneous data.
- **Advantages** → Portable, Robust, Secure, OOP, Multithreaded.
- **Applications** → Web, Mobile, Enterprise, Scientific, Gaming, Cloud.

---

# **Java: Methods, Objects, Classes, Conditions & Loops**


## **1. Basics of Objects and Classes in Java**

### **Class**

- A **class** is a **blueprint** (template) for creating objects.
- It defines **attributes (fields/variables)** and **behaviors (methods)**.
- Example:
  ```java
  class Car {
      String brand;      // attribute
      int speed;         // attribute

      void drive() {     // behavior
          System.out.println(brand + " is driving at " + speed + " km/h");
      }
  }

  ```

### **Object**

- An **object** is an **instance of a class**.
- Each object has its own **state (variables)** and **behavior (methods)**.
- Example:
  ```java
  public class Main {
      public static void main(String[] args) {
          Car myCar = new Car();   // object creation
          myCar.brand = "Tesla";
          myCar.speed = 120;
          myCar.drive();   // Output: Tesla is driving at 120 km/h
      }
  }

  ```

👉 **Analogy**:

- Class = Blueprint of a house.
- Object = Actual house built from the blueprint.

---

## **2. Methods and Objects**

### **Method**

- A **block of code** that performs a specific task.
- Helps in **code reusability** and **modularity**.

### **Syntax**

```java
returnType methodName(parameters) {
    // method body
    return value;
}
```

### **Types of Methods**

1. **Predefined Methods** (from libraries)
   - Example: `Math.sqrt(25)` returns 5.
2. **User-defined Methods**
   - Example:
     ```java
     int add(int a, int b) {
         return a + b;
     }
     ```

### **Calling a Method using Objects**

```java
public class Main {
    int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Square: " + obj.square(5));
    }
}

```

---

## **3. Method Overloading**

- **Defining multiple methods with the same name but different parameter lists** (number/type of parameters).
- Increases **readability and reusability**.

### **Example**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));       // int version
        System.out.println(calc.add(5.5, 4.5));     // double version
        System.out.println(calc.add(1, 2, 3));      // three params
    }
}

```

---

## **4. Conditions in Java**

### **a) if Statement**

```java
if (condition) {
    // code block
}
```

### **b) if-else Statement**

```java
if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible");
}

```

### **c) if-else-if Ladder**

```java
if (marks >= 90) System.out.println("Grade A");
else if (marks >= 75) System.out.println("Grade B");
else if (marks >= 50) System.out.println("Grade C");
else System.out.println("Fail");

```

### **d) switch Statement**

- Used when multiple choices are possible.

```java
int day = 3;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}

```

---

## **5. Loops in Java**

### **a) for Loop**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello " + i);
}

```

### **b) while Loop**

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

```

### **c) do-while Loop**

- Executes **at least once**, even if condition is false.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### **d) for-each Loop (Enhanced for Loop)**

- Used to iterate over arrays/collections.

```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}

```

---

## **🔑 Key Revision Points**

- **Class = Blueprint, Object = Instance.**
- **Methods** → block of reusable code, can be overloaded.
- **Overloading** → same method name, different parameters.
- **Conditions** → if, if-else, if-else-if, switch.
- **Loops** → for, while, do-while, for-each.

---

# **Java: Constructors, Keywords, Conditions, and Loops**


## **1. Constructors in Java**

- A **constructor** is a special method used to **initialize objects**.
- **Same name as the class**, **no return type** (not even `void`).
- Called **automatically** when an object is created.

### **Example**

```java
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Priyasha", 20);
        s1.display();
    }
}

```

---

## **2. Sending Arguments to Constructors**

- Arguments are passed while creating objects.

```java
Car c1 = new Car("Tesla", 120);

```

Here `"Tesla"` and `120` are **arguments** sent to the constructor.

---

## **3. Constructor Overloading**

- Multiple constructors with **different parameter lists**.
- Used to create objects in **different ways**.

### **Example**

```java
class Rectangle {
    int length, breadth;

    // Constructor 1
    Rectangle() {
        length = 0; breadth = 0;
    }

    // Constructor 2
    Rectangle(int l, int b) {
        length = l; breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();     // default constructor
        Rectangle r2 = new Rectangle(10, 5); // parameterized constructor
        r1.area();
        r2.area();
    }
}

```

---

## **4. The `this` Keyword**

- Refers to the **current object**.
- Uses:
  1. Differentiate between **instance variables** and **parameters**.
  2. Call another constructor within the same class.

### **Example**

```java
class Student {
    String name;
    Student(String name) {
        this.name = name;  // "this" refers to the object’s variable
    }
}

```

---

## **5. Static Variables**

- Belong to the **class**, not to any object.
- Shared among all objects.
- Declared using the `static` keyword.

### **Example**

```java
class Counter {
    static int count = 0;  // static variable

    Counter() {
        count++;
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter(); // 1
        new Counter(); // 2
        new Counter(); // 3
    }
}

```

---

## **6. Working with Constants**

- Use `final` keyword to declare constants.

```java
final double PI = 3.14159;

```

- Value **cannot be changed** once assigned.

---

## **7. Conditional Statements**

### **a) if Statement**

```java
if (x > 10) {
    System.out.println("x is greater than 10");
}

```

### **b) if-else Statement**

```java
if (age >= 18)
    System.out.println("Eligible");
else
    System.out.println("Not Eligible");

```

### **c) Nested if-else**

```java
if (marks >= 90) {
    System.out.println("Grade A");
} else {
    if (marks >= 75) {
        System.out.println("Grade B");
    } else {
        System.out.println("Grade C");
    }
}

```

---

## **8. Logical Operators**

### **AND (`&&`)**

```java
if (age > 18 && hasID) {
    System.out.println("Entry allowed");
}

```

### **OR (`||`)**

```java
if (marks > 90 || sportsQuota) {
    System.out.println("Admission granted");
}

```

### **NOT (`!`)**

```java
if (!isClosed) {
    System.out.println("Shop is open");
}

```

### **Conditional AND / OR**

- **`&&`** → checks **both conditions**, stops if first is false.
- **`||`** → checks **at least one condition**, stops if first is true.

---

## **9. Understanding Precedence**

- **Order of evaluation** when multiple operators appear.
- **Highest → Lowest precedence** (common ones):
  1. `()` (Parentheses)
  2. `++`, `--` (Increment/Decrement)
  3. `*`, `/`, `%`
  4. `+`,`-`
  5. `<`, `>`, `<=`, `>=`
  6. `==`, `!=`
  7. `&&`
  8. `||`
  9. `=` (Assignment)

👉 Use **parentheses** to avoid confusion.

---

## **🔑 Quick Revision**

- **Constructors** → Special methods, no return type, auto-called.
- **Constructor Overloading** → Multiple constructors, different parameters.
- **`this` keyword** → Refers to current object.
- **Static variables** → Shared across all objects.
- **Constants** → Declared using `final`.
- **Conditionals** → if, if-else, nested if, switch.
- **Logical Operators** → AND (`&&`), OR (`||`), NOT (`!`).
- **Precedence** → `()` > `* / %` > `+ -` > comparison > logical > assignment.
- **Loops** → while, for, do-while.
