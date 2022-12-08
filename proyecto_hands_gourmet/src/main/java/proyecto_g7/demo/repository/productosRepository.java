
package proyecto_g7.demo.repository;
import proyecto_g7.demo.entity.productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author camisalazar
 */

@Repository
public interface productosRepository extends CrudRepository<productos,Long>{
    
}
