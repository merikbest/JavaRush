package Collections.level39.task3906;

public class ElectricPowerSwitch {
    private SecuritySystem securitySystem;

    public ElectricPowerSwitch(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    public void press() {
        System.out.println("Power switch flipped.");
        if (securitySystem.isOn()) {
            securitySystem.turnOff();
        } else {
            securitySystem.turnOn();
        }
    }
}
