import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javen.MavenDemo.bean.Student;
import com.javen.MavenDemo.dao.StudentMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class test {
	@Autowired
	StudentMapper stuMapper;
	
	@Test
	public void testcrud(){
		Student stu = new Student("201621121008","123","1","wen","ÄÐ","16521313");
		//stuMapper.insertSelective(new Student("201621121008","123","1","wen","ÄÐ","16521313"));
        stuMapper.insertSelective(stu);
		//System.out.println(stu.getStuName());
			
	}

}
