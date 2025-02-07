package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year
    // TODO: Set make to "Tesla"
    // TODO: Initialize autopilotEnabled and charging to false
    public Tesla(String model, int year){
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }
    

    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
    // Each method should include appropriate print statements
    @Override
    public void startEngine(){
        System.out.println("Tesla " + model + " started");
        isRunning = true;
    }
    @Override
    public void stopEngine(){
        System.out.println("Tesla " + model + " stopped");
        isRunning = false;
    }
    @Override
    public void accelerate(){
        System.out.println("Tesla " + model + " is accelerating...");
    }

    @Override
    public void brake(){
        System.out.println("Tesla " + model + " is braking...");
    }
    @Override
    public void charge(){
        System.out.println("Tesla " + model + " is now charging");
        charging = true;
    }
    @Override
    public boolean isCharging(){
        return charging;
    }
    @Override
    public void enableAutopilot(){
        System.out.println("Autopilot enabled");
        autopilotEnabled = true;
    }
    @Override
    public void disableAutopilot(){
        System.out.println("Autopilot disabled");
        autopilotEnabled = false;
    }
    @Override
    public boolean isAutopilotEnabled(){
        return autopilotEnabled;
    }

}
