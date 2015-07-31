package br.com.hello;

import br.com.hello.models.User;
import br.com.hello.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication

public class Application {

  @Bean
  public InternalResourceViewResolver internalResourceViewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    resolver.setViewClass(JstlView.class);
    return resolver;
  }

  @Autowired
  UserRepository repository;

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    User user = new User("Eduardo", "Braga");
    UserRepository repository = context.getBean(UserRepository.class);
    repository.save(user);
    for (User user_example : repository.findAll()) {
      System.out.println(user_example.getId());
      System.out.println(user_example.getFirstName());
      System.out.println(user_example.getLastName());
    }
  }

}
