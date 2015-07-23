package hello;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    // ApplicationContext context = SpringApplication.run(Application.class, args);
    //
    // System.out.println("Let's inspect the beans provided by SpringBoot: ");
    //
    // String[] beanNames = context.getBeanDefinitionNames();
    // Arrays.sort(beanNames);
    // for (String beanName: beanNames) {
    //   System.out.println(beanName);
    // }
  }

}
