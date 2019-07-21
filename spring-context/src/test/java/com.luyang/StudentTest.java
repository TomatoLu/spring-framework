public class Student{
	@Test
	public void testClassPath(){
		Applicationcomtext c = new ClassPathXmlApplicationContext(configLocation:"com.luyang.stufrnt.xml");
		object student = context.getBean(name:"jacak");
		Sysout.out.prontln("student.gatclass.getName:"+student.getClass.getName());
	}


}