import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javen.MavenDemo.bean.User;
import com.javen.MavenDemo.dao.StudentMapper;
import com.javen.MavenDemo.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class test {
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testcrud(){
		userMapper.insertSelective(new User(null,"123","0","admin1"));
		//stuMapper.insertSelective(new Student("201621121008","123","1","wen","��","16521313"));
        
		//System.out.println(stu.getStuName());
			
	}

}
