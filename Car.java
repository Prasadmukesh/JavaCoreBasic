class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void run()
    {
        System.out.println("My car is Running 120km per Hour....");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    // Optional: Override the default honk method if needed
    @Override
    public void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}
