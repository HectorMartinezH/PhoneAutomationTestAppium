package factoryDevices;

public class FactoryDevice {

    public enum DeviceType {
        ANDROID,IOS,WINDOWS_PHONE
    }

    public static IDevice make(DeviceType deviceType) {
        IDevice device;
        switch (deviceType) {
            case ANDROID:
                return device = new Android();
            default:
                return device = new Android();
        }
    }
}
