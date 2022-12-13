
package proyecto_g7.demo.service;

import java.util.List;
import proyecto_g7.demo.entity.Clientes;


public interface IClientesService {
    public List<Clientes> getAllClientes();
    public Clientes findByNombre (String nombre);
}
