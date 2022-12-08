
package proyecto_g7.demo.repository;
import proyecto_g7.demo.entity.factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author camisalazar
 */
@Repository
public interface facturaRepository extends CrudRepository<factura,Long>{
    
}
