package kampos.pl.cookme.CookMe.adapter.in.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class HomePageController {

    @GetMapping("/home")
    public String homePage(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Collection<? extends GrantedAuthority> roles = authentication.getAuthorities();
        return "Witamy na stronie startowej spółki KamPos!!! \n Zalogowany jako: " + username + " | Role: " + roles;
    }
}
