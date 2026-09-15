package rica_api.publicaciones;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;

@Document(collection = "publicaciones")
public class Publicacion {
    
    @Id 
    private String id;

    private String investigadorCorreo;
    private String titulo;
    private String tipo;
    private String anio;
    private Map<String, String> detalles;

    public Publicacion() {
    }

    public Publicacion(String id, String investigadorCorreo, String titulo, String tipo, String anio,
            Map<String, String> detalles) {
        this.id = id;
        this.investigadorCorreo = investigadorCorreo;
        this.titulo = titulo;
        this.tipo = tipo;
        this.anio = anio;
        this.detalles = detalles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvestigadorCorreo() {
        return investigadorCorreo;
    }

    public void setInvestigadorCorreo(String investigadorCorreo) {
        this.investigadorCorreo = investigadorCorreo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Map<String, String> getDetalles() {
        return detalles;
    }

    public void setDetalles(Map<String, String> detalles) {
        this.detalles = detalles;
    }
    
}
