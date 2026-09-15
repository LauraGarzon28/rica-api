package rica_api.plataforma;

import org.springframework.stereotype.Component;

@Component
public class ArranqueInformativo {
    private final SaludoInstitucionalService saludoInstitucionalService;

    public ArranqueInformativo(SaludoInstitucionalService saludoInstitucionalService){
        this.saludoInstitucionalService = saludoInstitucionalService;
    }

    public void run(String ... args) {
        System.out.println(saludoInstitucionalService.welcomeMessage());
    }
}
