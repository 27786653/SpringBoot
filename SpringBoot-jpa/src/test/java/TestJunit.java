

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yuhi.Application;
import com.yuhi.carface.service.sysuser.SysUserService;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringApplicationConfiguration(classes = Application.class) // SpringBoot工程Application入口类
@WebAppConfiguration // Web项目，Junit需要模拟环境
public class TestJunit {
	
	@Resource
	private SysUserService service;
	
	@Test
	public void testService(){
		System.out.println(service.findByUsercode("admin"));
		System.out.println();
	}
}
