public class Parent {
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

