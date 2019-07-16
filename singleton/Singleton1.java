/**
 *@className Singleton1
 *@description 懒汉式
 *@Auther 85291173@qq.com
 *@Date 2019/7/9 19:07
 *@Version
 */
public class Singleton1 {
	
	private Singleton1(){
	}
	
	public static Singleton1 instance;
	
	/**
	 * 缺点 多线程下能够创建多个实例
	 * @return
	 */
	public static Singleton1 getInstance(){
		if (null == instance){
			return new Singleton1();
		}
		return instance;
	}
	
	/**
	 * 给方法加锁，对程序执行效率造成负面影响
	 * @return
	 */
	public static  synchronized  Singleton1 getInstance1(){
		if(null == instance){
			return new Singleton1();
		}
		return instance;
	}
	
	/**
	 * 由于编译器的优化，指令重排，还是可能出问题
	 * @return
	 */
	public static Singleton1 getInstance2(){
		if(null == instance){
			synchronized (Singleton1.class){
				if (null == instance) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
	
}
