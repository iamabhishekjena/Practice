package SOLID.DependencyInversion.After;

public class Switch {
    private Switchable device;

    public Switch(Switchable device){
        this.device = device;
    }

    public void operate(){
        device.turnOn();
    }


    public static void main(String args[]){
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
    }
}
