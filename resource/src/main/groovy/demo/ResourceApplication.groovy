package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EnableRedisHttpSession
class ResourceApplication extends WebSecurityConfigurerAdapter {
    @RequestMapping('/')
    def home() {
        [id: UUID.randomUUID().toString(), content: 'Hello World']
    }

    @RequestMapping('/hello')
    def homeTest() {
        [id: UUID.randomUUID().toString(), content: 'Not Hello World']
    }

    static void main(String[] args) {
        SpringApplication.run ResourceApplication, args
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable()
        http.authorizeRequests().anyRequest().authenticated()
    }
}