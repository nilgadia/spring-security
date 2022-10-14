package org.shahid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    /**
     * From Spring Security 5.7, the WebSecurityConfigurerAdapter is deprecated to encourage users
     * to move towards a component-based security configuration. It is recommended to create a bean
     * of type SecurityFilterChain for security related configurations.
     *
     * @param http
     * @return SecurityFilterChain
     * @throws Exception
     */
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        /*
          Custom configurations as per our requirement
         */
        http.authorizeHttpRequests((auth) -> auth
                .antMatchers("/accounts/**", "/balance/**", "/loans/**", "/cards/**").authenticated()
                .antMatchers("/notices/**", "/contact/**", "/welcome").permitAll()
        ).httpBasic(Customizer.withDefaults());
        return http.build();
    }

    /**
     * Approach 1 where we use withDefaultPasswordEncoder() method
     * while creating the user details
     * @return InMemoryUserDetailsManager
     */
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }

    /**
     * Approach 2 where we don't define password encoder
     * while creating the user details. Instead, a separate
     * PasswordEncoder bean will be created.
     *
     * @return InMemoryUserDetailsManager
     */
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//        UserDetails admin = User.withUsername("admin").password("12345").authorities("admin").build();
//        UserDetails user = User.withUsername("user").password("12345").authorities("read").build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}