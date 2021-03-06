package device;

import device.types.ConnectionType;
import device.types.ControllerType;
import device.types.Display;
import device.types.WeightMeasurementMethod;

public class ATMEGA32 extends MicroControllerFactory{

    public ATMEGA32(WeightMeasurementMethod weightDevice, ConnectionType connectionType) {
        buildController();
        addWeightMeasurementDevice(weightDevice);
        addConnectionDevice(connectionType);
        addDisplay();
        addIdMethod();
        addStorage();
        addDeviceController();
    }

    @Override
    public void buildController() {
        this.controllerType = ControllerType.ATMEGA32;
    }

    @Override
    public void addDisplay() {
        this.display = Display.LCD;
    }
}
