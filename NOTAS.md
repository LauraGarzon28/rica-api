# TALLER HEXAGONAL 

1. `InvestigadorRepository` es un puerto secundario o de salida, debido a que es la interfaz encargada de conectar con la base de datos, el nucleo realiza la llamada para hacer una petición, acceder o persistir información en la base de datos. 

2. `InvestigadorController` es un adaptador primario porque permite recibir solicitudes del exterior consumiendo los endpoints que se encuentran en el núcleo. Envuelve la tecnología HTTP / REST y la serialización JSON mediante Spring Web (Spring MVC).

3. Falta una interfaz que actúe como puerto primario explícito (`InvestigadorUseCase`). Actualmente el controlador depende directamente de la clase concreta `InvestigadorService`. Al introducir dicha interfaz, se define un contrato explícito de los casos de uso que el núcleo expone al exterior.

4. `InvestigadorFactory` pertenece al núcleo (capa de aplicación/dominio). Al revisar sus imports, se observa que no depende de tecnologías de infraestructura (ni HTTP, ni bases de datos directas), sino que encapsula la lógica de dominio y creación de la entidad usando abstracciones del núcleo.
