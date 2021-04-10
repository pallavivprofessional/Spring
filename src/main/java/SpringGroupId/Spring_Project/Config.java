package SpringGroupId.Spring_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("configBean.xml");
		Person p = (Person) c.getBean("personBean");
		Car car = (Car) c.getBean("carBean");
		
		p.setName("Minti");
		car.setCarName("maruti");
		car.setModel("22");
		p.setCar(car);

		System.out.println(p.getName() + " " + p.getCar().getCarName() + " "+ p.getCar().getModel());
	}
}
