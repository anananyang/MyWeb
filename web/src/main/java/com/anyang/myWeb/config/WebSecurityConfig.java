package com.anyang.myWeb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 登录
        http.formLogin()
                .loginPage("/example/login");
                // 登录成功处理
//                .successHandler()
                // 登录失败处理
//                .failureHandler()
        // 登出
        http.logout();

        // 授权
        http.authorizeRequests()
                    .antMatchers("/example/login").permitAll()
                    .antMatchers("/example/logout").permitAll()
                    .antMatchers("/example", "/example/home").permitAll()
                    .anyRequest().authenticated();

        // 自定义 403 处理
//        http.exceptionHandling().accessDeniedHandler();

        // csrf 暂时关闭
        http.csrf().disable();
    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("anyang")
                .password("123456")
                .roles("REGISTER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
