
package proyecto_g7.demo.repository;

import org.springframework.data.repository.CrudRepository;
import proyecto_g7.demo.entity.Clientes;


public interface ClientesRepository extends CrudRepository<Clientes,Long>{

    Clientes findByEmail(String email);
    
}
