package com.javen.MavenDemo.controller;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
 
import org.apache.poi.ss.usermodel.Sheet;
import com.javen.MavenDemo.bean.BooleanEnum;
import com.javen.MavenDemo.bean.ExcelProperty;
 
/**
 * Excel ����������
 * @since  2019-04-23 16:07
 */
public class ExcelParseHelper {
	
	/**
	 * �� Excel ����Ϊ JavaBean ����
	 * @since  2019-04-23 16:07
	 * @param file
	 * @param clazz
	 * @param beContainTitle �Ƿ������ͷ
	 * @param rowIndex �ӵڼ��п�ʼ��������һ��Ϊ 0����������
	 * @return
	 */
	public static <T> List<T> parse(File file, Class<T> clazz, boolean beContainTitle, int rowIndex) {
		List<List<String>> result = parse(file, beContainTitle, rowIndex);
		return result.stream()
				.map(x -> setField(clazz, x))
				.collect(Collectors.toList());
	}
	
	/**
	 * Ϊ�����ÿһ�����Ը�ֵ
	 * @since  2019-04-23 16:10
	 * @param <T>
	 * @param clazz
	 * @param rowDatas ��ǰ�е�����
	 * @return
	 */
	private static <T> T setField(Class<T> clazz, List<String> rowDatas) {
		try {
			T obj = clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				ExcelProperty excelProperty = field.getAnnotation(ExcelProperty.class);
				int index = excelProperty.index();
				String format = excelProperty.format();
				Object value = getFieldValue(field, rowDatas.get(index), format);
				field.setAccessible(true);
				field.set(obj, value);
			}
			return obj;
		} catch (InstantiationException | IllegalAccessException e) {
			throw new IllegalArgumentException(e);
		}
	}
 
	/**
	 * �� Excel ����Ϊ List ����
	 * @since  2019-04-23 16:11
	 * @param file
	 * @param beContainTitle �Ƿ������ͷ
	 * @param rowIndex �ӵڼ��п�ʼ��������һ��Ϊ 0����������
	 * @return
	 */
	public static List<List<String>> parse(File file, boolean beContainTitle, int rowIndex) {
		Sheet sheet = ImportUtils.parseFile(file);
		int rowCount = sheet.getPhysicalNumberOfRows(); // ������
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells(); // ������
		int i = beContainTitle ? rowIndex + 1 : rowIndex; // �Ƿ������ͷ
 
		List<List<String>> result = new ArrayList<List<String>>();
		for (; i < rowCount; i++) {
			List<String> cellResult = new ArrayList<>();
			for (int j = 0; j < cellCount; j++) {
				cellResult.add(ImportUtils.getCellValue(sheet, i, j));
			}
			result.add(cellResult);
		}
		return result;
	}
 
	/**
	 * ���� Java ��������Ե����ͣ��� Excel �е�ֵ����Ϊ���Ӧ������
	 * @since  2019-04-23 16:12
	 * @param field ���������
	 * @param value Excel �е�ֵ
	 * @param pattern ��� Java ��������Ե�����Ϊ Date��ʹ�� pattern ģʽ��  Excel �е�ֵת��Ϊ Date ����
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private static Object getFieldValue(Field field, String value, String pattern) {
		Class typeClass = field.getType();
		Object val = null;
		if (typeClass == Integer.class) {
			val = Integer.valueOf(value);
		} else if(typeClass == Long.class) {
			val = Long.valueOf(value);
		} else if(typeClass == Float.class) {
			val = Float.valueOf(value);
		} else if(typeClass == Double.class) {
			val = Double.valueOf(value);
		} else if(typeClass == Date.class) {
			val = ImportUtils.getDate(value, pattern);
		} else if(typeClass == Short.class) {
			val = Short.valueOf(value);
		} else if(typeClass == Character.class) {
			val = Character.valueOf(value.charAt(0));
		} else if(typeClass == Boolean.class) {
			val = Arrays.asList(BooleanEnum.values()).stream()
					.filter(x -> x.getName().equals(value.toUpperCase()))
					.findFirst()
					.orElseThrow(IllegalArgumentException::new)
					.getValue();
		} else {
			val = value;
		}
		return val;
	}
}
