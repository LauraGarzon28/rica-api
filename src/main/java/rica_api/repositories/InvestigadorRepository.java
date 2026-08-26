package rica_api.repositories;

import java.util.List;
import java.util.Optional;

import rica_api.Investigador;

public interface InvestigadorRepository {

    List<Investigador> findAll();

    Optional<Investigador> findById(Long id);

    Investigador save(Investigador investigador);

    boolean existsByCorreoInstitucional(String correoInstitucional);

}
