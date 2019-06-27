import java.io.File;
import java.util.List;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javen.MavenDemo.bean.Student;
import com.javen.MavenDemo.controller.ExcelParseHelper;
import com.javen.MavenDemo.dao.StudentMapper;
 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class EasyPOITest {
 
	@Autowired
	StudentMapper stuMapper;

	@Test
	public void test() {     
		String path = "D:\\student.xls";
		File file = new File(path);	
		List<Student> result = ExcelParseHelper.parse(file, Student.class, true, 0);
		result.forEach(System.out::println);
		Student stu;
		for(int i = 0;i < result.size(); i ++){
			stu = result.get(i);
			stuMapper.insertSelective(stu);
	       }
		
	}
}