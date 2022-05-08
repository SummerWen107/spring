import com.summer.spring.property.TestPropertyList;
import com.summer.spring.property.TestPropertyObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/17/21:17
 * @Description
 */

public class PropertyTest {

	@Test
	/**
	 * 普通property属性
	 */
	public void testPropertyClass1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("property/testPropertyObject.xml");
		TestPropertyObject testPropertyObject = (TestPropertyObject)ac.getBean("testPropertyClass1");
		System.out.println(testPropertyObject.getTestStr());
	}

	@Test
	/**
	 * list property 属性
	 */
	public void testPropertyClass2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("property/testPropertyList.xml");
		TestPropertyList testPropertyObject = (TestPropertyList)ac.getBean("testPropertyList");
		testPropertyObject.getList().forEach(System.out::println);
	}
}
