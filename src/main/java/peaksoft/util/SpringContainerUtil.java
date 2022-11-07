package peaksoft.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import peaksoft.model.Person;
import peaksoft.model.Person2;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("classpath:application.properties")
public class SpringContainerUtil {

    @Bean
    public Person getPerson() {
        return new Person();
    }
    @Bean
    public Person2 getPerson2() {
        return new Person2();
    }
}
