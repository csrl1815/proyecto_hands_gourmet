
package proyecto_g7.demo.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import proyecto_g7.demo.entity.Rol;
import proyecto_g7.demo.entity.Usuario;
import proyecto_g7.demo.repository.UsuarioRepository;



@Service("userDetailsService")
public class UserService implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Buscar un usuario por el USERNAME
        Usuario usuario = usuarioRepository.findByUsername(username);
        
        if(usuario == null){
            throw new UsernameNotFoundException(username);
        }
        
        // Si se encontró el usuario
         var roles = new ArrayList<GrantedAuthority>();
         
         for(Rol rol:usuario.getRoles()){
             roles.add(new SimpleGrantedAuthority(rol.getNombre()));
         }
         
         //retorna el usuario con detalles
         return new User(usuario.getUsername(),usuario.getPassword(),roles);
    }

   
    
}
