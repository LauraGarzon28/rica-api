package rica_api.investigadores.aplicacion;

import rica_api.investigadores.dominio.Investigador;
import rica_api.investigadores.dominio.CorreoInstitucional;
import rica_api.investigadores.dominio.CorreoDuplicadoException;
import rica_api.investigadores.dominio.InvestigadorRegistrado;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class InvestigadorFactory {

    private final RepositorioInvestigadores repositorioInvestigadores;
    private final ApplicationEventPublisher eventPublisher;

    @org.springframework.beans.factory.annotation.Autowired
    public InvestigadorFactory(RepositorioInvestigadores repositorioInvestigadores,
                               ApplicationEventPublisher eventPublisher) {
        this.repositorioInvestigadores = repositorioInvestigadores;
        this.eventPublisher = eventPublisher;
    }

    public InvestigadorFactory(RepositorioInvestigadores repositorioInvestigadores) {
        this(repositorioInvestigadores, event -> {});
    }

    public Investigador crear(String nombreCompleto, String correoInstitucional, String grupoInvestigacion) {
        CorreoInstitucional correo = new CorreoInstitucional(correoInstitucional);

        if (repositorioInvestigadores.existeCorreo(correo.valor())) {
            throw new CorreoDuplicadoException(
                    "Ya existe un investigador registrado con el correo " + correo.valor());
        }

        Investigador investigador = new Investigador(null, nombreCompleto, correo, grupoInvestigacion);
        eventPublisher.publishEvent(new InvestigadorRegistrado(correo.valor(), Instant.now()));

        return investigador;
    }
}
