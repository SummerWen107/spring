import com.summer.spring.custom.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/18/11:49
 * @Description
 */
public class CustomTest {


	@Test
	public void customElement(){
		ApplicationContext bf = new ClassPathXmlApplicationContext("custom/userBean.xml");
		User user=(User) bf.getBean("testbean");
		System.out.println(user.getUserName()+","+user.getEmail());
	}
}
