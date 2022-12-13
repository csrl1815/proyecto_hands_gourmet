
package proyecto_g7.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import proyecto_g7.demo.entity.Clientes;
import proyecto_g7.demo.repository.ClientesRepository;


public class ClientesService implements IClientesService {

     @Autowired
    private ClientesRepository clientesRepository;
     
    @Override
    public List<Clientes> getAllClientes() {
        return (List<Clientes>) clientesRepository.findAll();
    }

    @Override
    public Clientes findByNombre(String nombre) {
        return clientesRepository.findByNombre(nombre);
    }

    

    
    
}
