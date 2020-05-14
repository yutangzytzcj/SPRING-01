package cn.tedu.spring;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {

	@Test
	public void getDate() {
		// 1. ����Spring�����ļ������Spring����
		System.out.println("׼�����Spring��������");
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println("�Ѿ����Spring������");
		
		// 2. ��Spring�����л�ȡ����
		System.out.println("׼����Spring�����л�ȡ���󡭡�");
		Date date = (Date) ac.getBean("date");
		Calendar cal = (Calendar) ac.getBean("calendar");
	//	Phone phone = (Phone) ac.getBean("phone");
		User user1 = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		User user3 = (User) ac.getBean("user");
		System.out.println("�Ѿ���Spring�����л�ȡ����");
		
		// 3. ��������ȡ�Ķ���
		System.out.println("׼����������ȡ�Ķ��󡭡�");
		System.out.println(date);
		System.out.println(cal);
	//	System.out.println(phone);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user1.name);
		System.out.println(user1.from);
		System.out.println("�Ѿ���������ȡ�Ķ���");
		
		// 4. �ر�Spring�������ͷ���Դ
		System.out.println("׼���ͷ���Դ����");
		ac.close();
		System.out.println("�Ѿ��ͷ���Դ��");
	}
	
}







