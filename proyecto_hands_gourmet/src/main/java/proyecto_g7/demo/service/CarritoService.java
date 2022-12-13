
package proyecto_g7.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_g7.demo.entity.Carrito;
import proyecto_g7.demo.repository.CarritoRepository;

@Service
public class CarritoService implements ICarritoService{
    
    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> getAllCarrito() {
        return (List<Carrito>) carritoRepository.findAll();
    }

    @Override
    public Carrito getCarritoById(long id) {
       return carritoRepository.findById(id).orElse(null);
    }
}
