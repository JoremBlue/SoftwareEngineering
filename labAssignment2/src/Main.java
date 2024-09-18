public class Main {
    public static void main(String[] args) {
        // gawa devices
        Light light = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();
        Heater heater = new Heater();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        Command playMusic = new PlayMusicCommand(musicPlayer);
        Command stopMusic = new StopMusicCommand(musicPlayer);
        Command increaseVolume = new IncreaseVolumeCommand(musicPlayer);
        Command decreaseVolume = new DecreaseVolumeCommand(musicPlayer);
        Command increaseTemperature = new IncreaseTemperatureCommand(heater);
        Command decreaseTemperature = new DecreaseTemperatureCommand(heater);

        SmartHomeHub hub = new SmartHomeHub();

        // dito ilaw
        hub.setCommand(turnOnLight);
        hub.pressButton();

        hub.setCommand(turnOffLight);
        hub.pressButton();

        // dito for music
        hub.setCommand(playMusic);
        hub.pressButton();

        hub.setCommand(stopMusic);
        hub.pressButton();

        hub.setCommand(increaseVolume);
        hub.pressButton();

        hub.setCommand(decreaseVolume);
        hub.pressButton();

        //for heater hihi
        hub.setCommand(increaseTemperature);
        hub.pressButton();

        hub.setCommand(decreaseTemperature);
        hub.pressButton();
    }
}
