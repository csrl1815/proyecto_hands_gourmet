
package proyecto_g7.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto_g7.demo.entity.Clientes;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes,Long>{

    Clientes findByEmail(String email);
    
}
