public class RemoteControlRunner {
    public static void main(String[] args) {
        // Initialize remote control object
        RemoteControl remote = new RemoteControl();

        // Enable voice control
        remote.setVoiceControl(true);

        // Enable gesture control
        remote.setGestureControl(true);

        // Enable touchscreen
        remote.setTouchscreen(true);

        // Set connectivity type to IR
        remote.setConnectivityType("IR");

        // Customize buttons
        Map<String, String> buttonActions = new HashMap<>();
        buttonActions.put("volume up", "adjust volume +");
        buttonActions.put("volume down", "adjust volume -");
        buttonActions.put("media player", "launch media player app");
        remote.setCustomButtonActions(buttonActions);

        // Control other devices
        List<String> controlledDevices = Arrays.asList("soundbar", "gaming console", "Blu-ray player");
        remote.setControlledDevices(controlled
