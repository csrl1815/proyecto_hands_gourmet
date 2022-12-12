
package proyecto_g7.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import proyecto_g7.demo.entity.Productos;
import proyecto_g7.demo.service.IProductosService;

@Controller
public class ProductosController {
    @Autowired
    private IProductosService productosService;
    
    @GetMapping("/productos")
    public String index(Model model){
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo","Productos");
        model.addAttribute("productos",listaProductos);
        return "productos";
    }
}


