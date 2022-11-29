
package proyecto_g7.demo.repository;
import proyecto_g7.demo.entity.Carro_compras;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author camisalazar
 */

@Repository

public interface carro_comprasRepository extends CrudRepository<Carro_compras,Long>{
    
}
