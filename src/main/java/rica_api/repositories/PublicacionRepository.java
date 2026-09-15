package rica_api.repositories;

import java.util.List;

import rica_api.models.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicacionRepository extends MongoRepository<Publicacion, String> {
    List<Publicacion> findByInvestigadorCorreo(String investigadorCorreo);

}
