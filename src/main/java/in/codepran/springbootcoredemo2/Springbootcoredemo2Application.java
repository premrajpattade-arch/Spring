package in.codepran.springbootcoredemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootcoredemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootcoredemo2Application.class, args);

		orderservice order = context.getBean(orderservice.class);
		order.placorder();
//		user u = context.getBean(user.class);
//		u.data();
//		user m = context.getBean(user.class);
//		u.go();
	}

}
