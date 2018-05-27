package kg.iaau.edu.com.service;

import kg.iaau.edu.com.dao.StudentDao;
import kg.iaau.edu.com.model.MyUserPrincipal;
import kg.iaau.edu.com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Student student = studentDao.getStudentByUsername(username);
        if (student == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(student);
    }
}