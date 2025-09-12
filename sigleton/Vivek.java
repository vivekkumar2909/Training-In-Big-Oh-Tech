public class Vivek {
    public static void main(String[] args) {
        // Both calls will return the same instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Singleton v = new Singleton();

        obj1.showMessage();

        // Verify both are same
        System.out.println(obj1 == obj2); // true
        // System.out.println(v == obj2); // true
    }
}