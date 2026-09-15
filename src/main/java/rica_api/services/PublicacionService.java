package rica_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import rica_api.exceptions.RecursoNoEncontradoException;
import rica_api.models.Publicacion;
import rica_api.repositories.InvestigadorRepository;
import rica_api.repositories.PublicacionRepository;

@Service
public class PublicacionService {

    private final PublicacionRepository publicacionRepository;
    private final InvestigadorRepository investigadorRepository;

    public PublicacionService(PublicacionRepository publicacionRepository,
            InvestigadorRepository investigadorRepository) {
        this.publicacionRepository = publicacionRepository;
        this.investigadorRepository = investigadorRepository;
    }

    public Publicacion registrar(Publicacion publicacion) {
        if (!investigadorRepository.existsByCorreoInstitucional(publicacion.getInvestigadorCorreo())) {
            throw new RecursoNoEncontradoException(
                    "No existe un investigador con correo institucional " + publicacion.getInvestigadorCorreo());
        }
        return publicacionRepository.save(publicacion);
    }

    public List<Publicacion> listarPorInvestigador(String investigadorCorreo) {
        return publicacionRepository.findByInvestigadorCorreo(investigadorCorreo);
    }

    public Publicacion buscarPorId(String id) {
        return publicacionRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe una publicación con id" + id));
    }

}