package rica_api.mappers;

import rica_api.PublicacionRequest;
import rica_api.PublicacionResponse;
import rica_api.models.Publicacion;

public class PublicacionMapper {

    private PublicacionMapper() {
    }

    public static Publicacion aEntidad(PublicacionRequest request) {
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(request.getTitulo());
        publicacion.setTipo(request.getTipo());
        publicacion.setAnio(request.getAnio());
        publicacion.setInvestigadorCorreo(request.getInvestigadorCorreo());
        publicacion.setDetalles(request.getDetalles());
        return publicacion;
    }

    public static PublicacionResponse aResponse(Publicacion publicacion) {
        return new PublicacionResponse(
            publicacion.getInvestigadorCorreo(),
            publicacion.getTitulo(),
            publicacion.getTipo(),
            publicacion.getAnio(),
            publicacion.getDetalles()
        );
    }
    
}
