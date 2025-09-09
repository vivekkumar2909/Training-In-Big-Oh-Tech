class Singleton {
    // Step 1: Create a private static instance (initially null)
    private static Singleton instance;

    // Step 2: Make constructor private so no one can instantiate directly
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public method to return the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create if not exists
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}