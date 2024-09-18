public class DecreaseTemperatureCommand implements Command {
    private Heater heater;

    public DecreaseTemperatureCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.decreaseTemperature();
    }
}
