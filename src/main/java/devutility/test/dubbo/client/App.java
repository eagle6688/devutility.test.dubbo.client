package devutility.test.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devutility.test.dubbo.common.interfaces.IUserService;
import com.devutility.test.dubbo.common.models.User;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		context.start();
		IUserService userService = (IUserService) context.getBean("userService");
		User user = userService.getUser("Aldwin");
		System.out.println("Hello world " + user.getName());
	}
}