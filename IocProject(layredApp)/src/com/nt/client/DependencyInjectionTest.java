package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader = null;
		StudentController controller = null;

		String sno;
		String sname;
		String m1;
		String m2;
		String m3;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter Sno");
		sno = sc.next();

		System.out.println("enter Sname");
		sname= sc.next();

		System.out.println("enter M1");
		m1 = sc.next();

		System.out.println("enter M2");
		m2 = sc.next();

		System.out.println("enter M3");
		m3 = sc.next();


		System.out.println("DependencyInjectionTest.main()");//taking trace to start main method

		//Creating IOcContainer  container of xml bean factory
		factory=new DefaultListableBeanFactory();

		//Create Reader Class object
		reader = new XmlBeanDefinitionReader(factory);

		//load Spring Bean Configuration File(directory structure taking in / file) check xml file is welformed(dtdxsd) or valid h ya nhi
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		//get Container Create Object which is created inside applicationContext file
		controller = (StudentController)factory.getBean("controller");

		System.out.println("controller"+controller);

		/*vo.setSno("102");
		vo.setSname("Sonalika");
		vo.setM1("95");
		vo.setM2("90");
		vo.setM3("30");
		 */
		StudentVO vo = new StudentVO();

		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		String result = controller.process(vo);//calling method me argument pass krte h
		System.out.println(result);


	}

}
