
package proyecto_g7.demo.repository;
import proyecto_g7.demo.entity.informacion_envio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author camisalazar
 */

@Repository
public interface informacion_envioRepository extends CrudRepository<informacion_envio,Long>{
    
}
