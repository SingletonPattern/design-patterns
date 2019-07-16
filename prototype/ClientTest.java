import java.util.List;

/**
 *@className ClientTest
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 16:33
 *@Version
 */
 public class ClientTest {
	public static void main(String[] args) throws CloneNotSupportedException {
//		test1();
		test2();
//		test3();
	}
 	
 	public static void test1() throws CloneNotSupportedException {
 		Mail mail = new Mail("zhangsan","内容","标题","邮箱");
		System.out.println(mail.toString());
		Mail mail2 = mail.clone();
		System.out.println(mail2.toString());
	}
	
	public static void test2() throws CloneNotSupportedException {
		Thing thing = new Thing();
		thing.setList("zhangsan");
		Thing thing1 = thing.clone();
		thing1.setList("lisi");
		List<String> list = thing.getList();
		List<String> list1 = thing1.getList();
		for (int i = 0; i < list.size() ; i++) {
			System.out.println("list="+list.get(i));
		}
		for (int i = 0; i < list1.size() ; i++) {
			System.out.println("list1="+list1.get(i));
		}
	}
	
	/**
	 * 深拷贝 是将原来引用类型的数据复制出来重新分配内存空间
	 * 而浅拷贝时是直接将引用数据类型的指针，所有当对拷贝出来的数据进行修改时，原来的值也会发生变化
	 * @throws CloneNotSupportedException
	 */
	public static void test3() throws CloneNotSupportedException {
		Thing2 thing = new Thing2();
		thing.setList("zhangsan");
		Thing2 thing1 = thing.clone();
		thing1.setList("lisi");
		List<String> list = thing.getList();
		List<String> list1 = thing1.getList();
		for (int i = 0; i < list.size() ; i++) {
			System.out.println("list="+list.get(i));
		}
		for (int i = 0; i < list1.size() ; i++) {
			System.out.println("list1="+list1.get(i));
		}
	}
}

