
package proyecto_g7.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_g7.demo.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
