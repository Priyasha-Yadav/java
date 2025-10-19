
 class Parent {
    public void display() {
        System.out.println("Public method in Parent class");
    }

    void show() {
        System.out.println("Default method in Parent class");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        p.show();
    }
}


public class Child extends Parent {
    Child() {

        System.out.println("Child class");
    };
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
        c.show();
    }
}
