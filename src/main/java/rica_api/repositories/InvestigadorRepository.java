package rica_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import rica_api.models.Investigador;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {

   boolean existsByCorreoInstitucional(String correoInstitucional);

}
