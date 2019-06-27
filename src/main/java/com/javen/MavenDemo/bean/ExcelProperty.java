package com.javen.MavenDemo.bean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelProperty {
	public int index(); // ָ�� JavaBean �����Զ�Ӧ excel �ĵڼ���
	public String format() default ""; // �� JavaBean ������Ϊ Date ����ʱ��ָ�� Date �ĸ�ʽ��ģʽ
}
