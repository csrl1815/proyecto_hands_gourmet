
package proyecto_g7.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import proyecto_g7.demo.entity.Carrito;
import proyecto_g7.demo.service.ICarritoService;

@Controller
public class CarritoController {
    @Autowired
    private ICarritoService carritoService;
    
    @GetMapping("/carrito")
    public String index(Model model){
        List<Carrito> listaCarrito = carritoService.getAllCarrito();
        model.addAttribute("titulo","Carrito");
        model.addAttribute("carrito",listaCarrito);
        return "carrito";
    }
}


