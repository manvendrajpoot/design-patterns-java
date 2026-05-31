package main.java.org.manvendra.StructuralDP.FacadePattern.SmartHomeAppExample;

public class SecurityAlarm {
    public void armStayMode() {
        System.out.println("[Alarm] Armed in STAY mode (Perimeter sensors active).");
    }
    public void armAwayMode() {
        System.out.println("[Alarm] Armed in AWAY mode (Motion and perimeter active).");
    }
    public void disarm() {
        System.out.println("[Alarm] Security system disarmed.");
    }
}
