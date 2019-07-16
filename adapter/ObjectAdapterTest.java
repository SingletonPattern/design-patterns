/**
 *@className ObjectAdapterTest
 *@description 对象适配器模式
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 15:45
 *@Version
 */
public class ObjectAdapterTest {
	public static void main(String[] args) {
		Target objectAdapter = new ObjectAdapter(new Adaptee());
		objectAdapter.request();
	}
}

/**
 * 对象适配器类
 */
class ObjectAdapter implements Target{
	private Adaptee adaptee;
	public ObjectAdapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	@Override
	public void request(){
		adaptee.specificRequest();
	}
}