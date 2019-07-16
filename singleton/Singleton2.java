/**
 *@className Singleton2
 *@description 线程安全的延迟初始化 volatile
 *@Auther 85291173@qq.com
 *@Date 2019/7/9 19:19
 *@Version
 */
public class Singleton2 {
	private Singleton2 (){}
	
	public static volatile Singleton2 instance;
	
	/**
	 * volatile禁止指令重排
	 * @return
	 */
	public static Singleton2 getInstance(){
		if (null == instance){
			synchronized (Singleton2.class){
				if (null == instance){
					return new Singleton2();
				}
			}
		}
		return instance;
	}
}
