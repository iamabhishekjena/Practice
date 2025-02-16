package SOLID.DependencyInversion.Before;

public class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb){
        this.lightBulb = lightBulb;
    }


    public void operate(String operation){
        if(operation.equalsIgnoreCase("on"))lightBulb.turnOn();
        if(operation.equalsIgnoreCase("off"))lightBulb.turnOff();
    }


    public static void main(String main[]){
        LightBulb lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate("on");
        lightSwitch.operate("off");
    }
}
