// Interface definition
interface Vehicle {
    // Abstract method (no body)
    void start();
    void run();
    void stop();

    // Default method with a body
    default void honk() {
        System.out.println("Vehicle is honking...");
    }

    // Static method with a body
    static void vehicleInfo() {
        System.out.println("This is a vehicle.");
    }
}
