package pe.tuna.serviusuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import pe.tuna.commonsusuarios.models.Usuario;

// IMPORTANTE: cuando tenemos un repositorio tipo rest y queremos acceder a metodos creados
// manualmente estos se podran acceder a trave de search/NOMBRE_DEL_METODO_tal_cual
// por ejemplo: usuarios/search/findByUsername?username=miguel
// si queremos sobre escribir el NOMBRE_DEL_METODO tenemos que usar la anotacion @RestResource
// y si deseamos cambiarle el nombre al parametro usamos la anotacion @Param
// entonces quedaria asi: usuarios/search/buscar-username?nombre=miguel
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // query methods ejemplo
    @RestResource(path = "buscar-username")
    public Usuario findByUsername(@Param("username") String username);

    // metodo personalizado mediante anotaciones: @Query
    @Query("select u from Usuario u where u.username = ?1")
    public Usuario obtenerPorUsername(String username);

    // consulta con sql nativo
    @Query(value = "SELECT * FROM usuarios u WHERE u.username = ?1", nativeQuery = true)
    public Usuario usarioPorUsername(String username);
}
