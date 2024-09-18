public class IncreaseTemperatureCommand implements Command {
    private Heater heater;

    public IncreaseTemperatureCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.increaseTemperature();
    }
}
