package br.com.mariojp.solid.isp.Services;
import br.com.mariojp.solid.isp.Interfaces.IPrinter;

public class OfficeService {
    private final IPrinter _printerDevice;

    public OfficeService(IPrinter device) {
        this._printerDevice = device;
    }
    public void Print(String content){
        _printerDevice.Print(content);
    }
}
