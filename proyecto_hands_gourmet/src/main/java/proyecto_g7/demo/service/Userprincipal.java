
package proyecto_g7.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import proyecto_g7.demo.entity.Clientes;


public class Userprincipal implements UserDetails{
    private Clientes clientes;
    
    public Userprincipal(Clientes clientes){
        this.clientes = clientes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        
        this.clientes.getPermissionList().forEach(p -> {GrantedAuthority authority = new SimpleGrantedAuthority(p); 
        authorities.add(authority);
        });
        
        this.clientes.getRoleList().forEach(r-> {
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
        authorities.add(authority);
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.clientes.getContrasena();
    }

    @Override
    public String getUsername() {
        return this.clientes.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.clientes.getActive()==1;
    }
    
}
