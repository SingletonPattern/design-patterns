import java.util.ArrayList;
import java.util.List;

/**
 *@className Thing2
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 16:27
 *@Version
 */
 public class Thing2 implements Cloneable {
 	private ArrayList<String> list = new ArrayList<>();
	
	/**
	 * 深层次拷贝
	 * （1）深拷贝还有一种实现方式就是通过自己写二进制流来操作对象,然后实现对象的深拷贝,这个大家有时间自己实现一下
	 * （2）深拷贝和浅拷贝建议不要混合使用,特别是在涉及类的继承时,父类有多个引用的情况就非常复杂,建议的方案是深拷贝和浅拷贝分开实现。
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Thing2 clone() throws CloneNotSupportedException {
		Thing2 thing2 = null;
		thing2 = (Thing2) super.clone();
		thing2.list = (ArrayList<String>) this.list.clone();
		return thing2;
	}
	
	public List<String> getList() {
		return list;
	}
	
	public void setList(String str) {
		this.list.add(str);
	}
}
