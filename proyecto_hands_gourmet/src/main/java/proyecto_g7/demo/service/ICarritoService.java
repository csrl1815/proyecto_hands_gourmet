
package proyecto_g7.demo.service;

import java.util.List;
import proyecto_g7.demo.entity.Carrito;


public interface ICarritoService {
    public List<Carrito> getAllCarrito();
    public Carrito getCarritoById(long id);
}
