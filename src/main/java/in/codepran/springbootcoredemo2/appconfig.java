package in.codepran.springbootcoredemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class appconfig {

@Bean
    user userq() {
    return new user();
}
    user o(){
    return new user();

    }
}
