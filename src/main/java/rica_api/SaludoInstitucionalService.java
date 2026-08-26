package rica_api;

import org.springframework.stereotype.Service;

@Service
public class SaludoInstitucionalService {
    public String welcomeMessage(){
        return "RICA está en linea - Red de Investigación y Colaboración Académica.";
    }
}
