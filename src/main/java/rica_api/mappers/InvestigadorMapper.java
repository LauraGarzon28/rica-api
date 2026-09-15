package rica_api.mappers;

import rica_api.InvestigadorRequest;
import rica_api.InvestigadorResponse;
import rica_api.models.Investigador;

public class InvestigadorMapper {
    
    private InvestigadorMapper() {
    }

    public static Investigador aEntidad(InvestigadorRequest request) {
        Investigador investigador = new Investigador();
        investigador.setNombreCompleto(request.getNombreCompleto());
        investigador.setCorreoInstitucional(request.getCorreoInstitucional());
        investigador.setGrupoInvestigacion(request.getGrupoInvestigacion());
        return investigador;
    }

    public static InvestigadorResponse aResponse(Investigador investigador) {
        return new InvestigadorResponse(
            investigador.getId(),
            investigador.getNombreCompleto(),
            investigador.getCorreoInstitucional()
        );
    }
}
