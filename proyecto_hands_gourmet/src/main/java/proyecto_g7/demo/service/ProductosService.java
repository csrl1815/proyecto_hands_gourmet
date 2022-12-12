
package proyecto_g7.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_g7.demo.entity.Productos;
import proyecto_g7.demo.repository.ProductosRepository;

@Service
public class ProductosService implements IProductosService{
    
    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public List<Productos> getAllProductos() {
        return (List<Productos>) productosRepository.findAll();
    }

    @Override
    public Productos getProductosById(long id) {
        return productosRepository.findById(id).orElse(null);
    }
}
