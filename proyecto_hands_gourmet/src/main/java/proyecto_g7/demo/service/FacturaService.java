
package proyecto_g7.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_g7.demo.entity.Factura;
import proyecto_g7.demo.repository.FacturaRepository;

@Service
public class FacturaService implements IFacturaService{
    
    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> getAllFactura() {
        return (List<Factura>) facturaRepository.findAll();
    }

    @Override
    public Factura getFacturaById(long id) {
       return facturaRepository.findById(id).orElse(null);
    }
}
