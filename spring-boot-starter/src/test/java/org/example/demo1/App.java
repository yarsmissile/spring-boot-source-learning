package org.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App.class);
        ConfigurableApplicationContext applicationContext
                = springApplication.run(args);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }

    @Bean
    public Person zhangsan() {
        return new Person("张三");
    }
}
