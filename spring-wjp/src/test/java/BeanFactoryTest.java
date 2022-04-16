import com.summer.spring.bean.MyTestBean;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/15/13:16
 * @Description
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() throws IOException {
		//Resource resource=new ClassPathResource("beanFactoryTest.xml");
		//BeanFactory factory=new DefaultListableBeanFactory();
		//BeanDefinitionReader bdr=new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		//bdr.loadBeanDefinitions(resource);
		ClassPathResource classPathResource = new ClassPathResource("beanFactoryTest.xml");
		InputStream inputStream = classPathResource.getInputStream();
		ByteArrayResource byteArrayResource = new ByteArrayResource(getByteByIS(inputStream));
		BeanFactory factory = new XmlBeanFactory(byteArrayResource);
		MyTestBean myTestBean = (MyTestBean)factory.getBean("myTestBean");
		//System.out.println(myTestBean.getTestStr());
		//assertEquals("testStr",myTestBean.getTestStr());
	}

	private byte[] getByteByIS(InputStream is) throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int nRead;
		byte[] data = new byte[1024];

		while ((nRead = is.read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}

		return buffer.toByteArray();
	}

}
