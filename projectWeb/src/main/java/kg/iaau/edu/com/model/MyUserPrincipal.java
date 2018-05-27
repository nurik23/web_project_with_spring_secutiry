package kg.iaau.edu.com.model;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyUserPrincipal implements UserDetails {

    private static final long serialVersionUID = 1L;

    private Student student;

    public MyUserPrincipal(Student student) {
        this.student = student;
    }

    @Override
    public String getUsername() {
        return student.getUsername();
    }

    @Override
    public String getPassword() {
        return student.getPassword();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

}