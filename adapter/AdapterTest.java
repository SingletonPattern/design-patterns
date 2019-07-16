/**
 *@className AdapterTest
 *@description 类适配器模式
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 15:40
 *@Version
 */
public class AdapterTest {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.request();
	}
}

/**
 * 目标接口
 */
interface Target{
	void request();
}

/**
 * 适配者接口
 */
class Adaptee {
	public void specificRequest(){
		System.out.println("适配者中的业务代码被调用！");
	}
}

/**
 * 适配器类
 */
class Adapter extends Adaptee implements Target{
	@Override
	public void request() {
		System.out.println("调用适配器类");
		specificRequest();
	}
}

