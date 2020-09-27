package edu.wctc.wisconsin_fried_chicken.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

//@Configuration
//@EnableWebSecurity
//public class WFCSecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public static PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSource);
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws  Exception {
//                 httpSecurity.authorizeRequests()
//                .antMatchers("/", "/h2-console/**").permitAll()
//                .antMatchers("/secret-recipe").hasAuthority("major")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin();
//
//    }

//    public void configure(WebSecurity webSecurity) throws Exception {
//        //webSecurity.ignoring().antMatchers("/h2-console/**");
//    }
//}
