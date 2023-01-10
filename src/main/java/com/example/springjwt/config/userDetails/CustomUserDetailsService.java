package com.example.springjwt.config.userDetails;

import com.example.springjwt.entity.Person;
import com.example.springjwt.enums.Role;
import com.example.springjwt.repository.PersonRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.example.springjwt.enums.Role.*;

@Repository
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
//    private final PasswordEncoder passwordEncoder;
    private final PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Person person = getPersons().stream().filter(x -> email.equals(x.getEmail())).findFirst()
//                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        Person person = personRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        return new CustomUserDetails(person);
    }

//    public List<Person> getPersons() {
//        List<Person> list = new ArrayList<>(List.of(
//                Person.builder()
//                        .id(1L)
//                        .firstName("John")
//                        .lastName("Obi")
//                        .email("johnObo@gmail.com")
//                        .password(passwordEncoder.encode("password"))
//                        .role(ADMIN)
//                        .build(),
//
//                Person.builder()git comit
//                        .id(2L)
//                        .firstName("King")
//                        .lastName("Olamide")
//                        .email("kingOla@gmail.com")
//                        .password(passwordEncoder.encode("password"))
//                        .role(USER)
//                        .build()
//        ));
//
//        return list;
//    }
}
