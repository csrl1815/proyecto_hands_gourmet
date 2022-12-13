
package proyecto_g7.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import proyecto_g7.demo.entity.Clientes;


@Service
public class UserService implements UserDetailsService{
    @Autowired
    public IClientesService clientesService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Clientes clientes = this.clientesService.findByNombre(username);
        Userprincipal userPrincipal = new Userprincipal(clientes);
        return userPrincipal;
    }
    
}
