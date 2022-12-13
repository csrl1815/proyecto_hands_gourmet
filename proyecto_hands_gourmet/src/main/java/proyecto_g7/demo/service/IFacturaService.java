
package proyecto_g7.demo.service;

import java.util.List;
import proyecto_g7.demo.entity.Factura;


public interface IFacturaService {
    public List<Factura> getAllFactura();
    public Factura getFacturaById(long id);
}
