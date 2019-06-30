package com.javen.MavenDemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.javen.MavenDemo.bean.Student;
import com.javen.MavenDemo.controller.ExcelParseHelper;
import com.javen.MavenDemo.dao.StudentMapper;

@Controller
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class EasyPOITest {

	@Autowired
	StudentMapper stuMapper;

	@ResponseBody
	@RequestMapping(value = "Upload", method = { RequestMethod.POST })
	public void test(HttpServletRequest request) throws IllegalStateException, IOException {
		String path = null;
		// ����ǰ�����ĳ�ʼ���� CommonsMutipartResolver ���ಿ�ֽ�������
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// ���form���Ƿ���enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// ��request��ɶಿ��request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// ��ȡmultiRequest �����е��ļ���
			Iterator iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// һ�α��������ļ�
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					int x=1+(int)(Math.random()*50);
					path = "E:/newproject/MavenDemo/uploadExcel/" + x +file.getOriginalFilename();
					// �ϴ�
					file.transferTo(new File(path));
				}
			}
			
			File file = new File(path);
			List<Student> result = ExcelParseHelper.parse(file, Student.class, true, 0);
			result.forEach(System.out::println);
			Student stu;
			for (int i = 0; i < result.size(); i++) {
				stu = result.get(i);
				stuMapper.insertSelective(stu);
			}
			
		}

	}
}