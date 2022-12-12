
package proyecto_g7.demo.service;

import java.util.List;
import proyecto_g7.demo.entity.Productos;


public interface IProductosService {
    public List<Productos> getAllProductos();
    public Productos getProductosById(long id);
}
