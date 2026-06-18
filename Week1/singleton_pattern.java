public class Singleton {

    // Single instance of the class
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Singleton Pattern Implemented");
    }

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("Different objects created");
        }
    }
}