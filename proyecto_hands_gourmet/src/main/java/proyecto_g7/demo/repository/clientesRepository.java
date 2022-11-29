
package proyecto_g7.demo.repository;
import proyecto_g7.demo.entity.clientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author camisalazar
 */

@Repository
public interface clientesRepository extends CrudRepository<clientes,Long>{
    
}
