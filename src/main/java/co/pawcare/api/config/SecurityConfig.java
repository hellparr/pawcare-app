package co.pawcare.api.config;

import co.pawcare.api.exception.handlers.CustomAccesDeniedHandler;
import co.pawcare.api.exception.handlers.CustomEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    private CustomUserDetailsService customUserDetailsService;
    private CustomAccesDeniedHandler customAccesDeniedHandler;
    private CustomEntryPoint customEntryPoint;

    public SecurityConfig(CustomUserDetailsService customUserDetailsService,
                          CustomAccesDeniedHandler customAccesDeniedHandler,
                          CustomEntryPoint customEntryPoint) {
        this.customUserDetailsService = customUserDetailsService;
        this.customAccesDeniedHandler = customAccesDeniedHandler;
        this.customEntryPoint = customEntryPoint;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/auth/register").permitAll() // rutas publicas.
                        .anyRequest().authenticated()

                )
                .exceptionHandling(exception -> exception
                        .authenticationEntryPoint(customEntryPoint)
                        .accessDeniedHandler(customAccesDeniedHandler)
                )
                .httpBasic(withDefaults());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
