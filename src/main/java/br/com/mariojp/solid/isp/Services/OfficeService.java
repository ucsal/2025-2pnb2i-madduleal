package br.com.mariojp.solid.isp.Services;

import br.com.mariojp.solid.isp.Interfaces.IMultiFunctionDevice;

public class OfficeService {
    private final IMultiFunctionDevice device;
    public OfficeService(IMultiFunctionDevice device){ this.device = device; }
    public void printReport(String content){
        device.print(content);
        // BUG: chama scan sem necessidade
        device.scan("audit.txt");
    }
}
