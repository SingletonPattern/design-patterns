import java.util.ArrayList;
import java.util.List;

/**
 *@className Thing
 *@description 浅拷贝
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 16:25
 *@Version
 *
 *（1）JVM做了一个偷懒的拷贝动作,Object类提供的方法clone只是拷贝本对象,其对象内部的数组、
 * 引用对象等都不拷贝,还是指向原生对象 的内部元素地址,这种拷贝就叫做浅拷贝
 *（2）非常不安全
 */
 public class Thing implements Cloneable {
 	private List<String> list = new ArrayList<>();
	
	public List<String> getList() {
		return list;
	}
	
	@Override
	protected Thing clone() throws CloneNotSupportedException {
		Thing thing = null;
		thing = (Thing) super.clone();
		return thing;
	}
	
	public void setList(String abd) {
		this.list.add(abd);
	}
}
