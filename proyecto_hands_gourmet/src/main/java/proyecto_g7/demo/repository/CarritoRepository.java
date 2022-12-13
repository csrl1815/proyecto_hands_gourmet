
package proyecto_g7.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto_g7.demo.entity.Carrito;


@Repository
public interface CarritoRepository extends CrudRepository<Carrito,Long> {
    
}
