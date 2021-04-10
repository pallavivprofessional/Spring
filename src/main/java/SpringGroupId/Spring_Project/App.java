package SpringGroupId.Spring_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    	Person p = (Person)context.getBean("personBean");
        System.out.println( p.getName());
        System.out.println( p.getCar().getModel());
        System.out.println( p.getCar().getCarName());
    }
}
