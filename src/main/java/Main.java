import br.com.mariojp.solid.isp.Models.SimplePrinter;
import br.com.mariojp.solid.isp.Services.OfficeService;

public class Main {
	public static void main(String[] args) {
        OfficeService svc = new OfficeService(new SimplePrinter());
		svc.Print("Relatório do Dia");
	}
}
