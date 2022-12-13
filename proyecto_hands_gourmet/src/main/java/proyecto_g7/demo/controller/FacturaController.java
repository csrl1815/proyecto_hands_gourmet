
package proyecto_g7.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import proyecto_g7.demo.entity.Factura;
import proyecto_g7.demo.service.IFacturaService;

@Controller
public class FacturaController {
    @Autowired
    private IFacturaService facturaService;
    
    @GetMapping("/factura")
    public String index(Model model){
        List<Factura> listaFactura = facturaService.getAllFactura();
        model.addAttribute("titulo","Factura");
        model.addAttribute("factura",listaFactura);
        return "factura";
    }
}


