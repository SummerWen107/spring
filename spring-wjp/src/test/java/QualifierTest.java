import com.summer.spring.qualifier.TestQualifierBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/17/22:36
 * @Description
 */
public class QualifierTest {

	@Test
	public void qualifierTest1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("qualifier/testQualifierBean.xml");
		TestQualifierBean testQualifierBean = (TestQualifierBean)ac.getBean("testQualifierBean");
		System.out.println(testQualifierBean.getName());
	}
}
