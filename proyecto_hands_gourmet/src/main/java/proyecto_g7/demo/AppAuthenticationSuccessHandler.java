
package proyecto_g7.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;


public class AppAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    @Override
    protected void handle (HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException{
    } 
}
