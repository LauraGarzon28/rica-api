package rica_api;

import org.springframework.stereotype.Component;

import rica_api.services.SaludoInstitucionalService;

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
