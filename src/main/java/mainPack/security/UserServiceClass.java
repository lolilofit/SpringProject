package mainPack.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class UserServiceClass implements UserDetailsService {
    private UserRepository userRepository;

    public UserServiceClass(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserAut user = userRepository.findByUsername(s);
        if(user != null) {
            PasswordEncoder passwordEncoder = new StandardPasswordEncoder("53cr3t");
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return user;
        }
        throw new UsernameNotFoundException(s + "not found!");
    }
}
