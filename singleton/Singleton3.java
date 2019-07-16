/**
 *@className Singleton3
 *@description 饿汉式
 *@Auther 85291173@qq.com
 *@Date 2019/7/9 19:26
 *@Version
 */
public class Singleton3 {
	private Singleton3(){}
	
	public static final Singleton3 instance = new Singleton3();
	
	/**
	 * 无法掌握INSTANCE初始化时机，如果依赖其他数据，很难保证其他数据在INSTANCE初始化前准备好。
	 * @return
	 */
	public static Singleton3 getInstance(){
		return instance;
	}
}
