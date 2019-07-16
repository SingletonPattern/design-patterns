/**
 *@className Singleton4
 *@description 静态内部类
 *@Auther 85291173@qq.com
 *@Date 2019/7/9 19:28
 *@Version
 */
public class Singleton4 {
	private Singleton4(){}
	
	private static class Singleton4Holder{
		private static final Singleton4 instance = new Singleton4();
	}
	
	/**
	 * 对于内部类SingletonHolder，它是一个饿汉式的单例实现，
	 * 在SingletonHolder初始化的时候会由ClassLoader来保证同步，使INSTANCE是一个真·单例。
	 * 同时，由于SingletonHolder是一个内部类，只在外部类的Singleton的getInstance()中被使用，
	 * 所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
	 * @return
	 */
	public static Singleton4 getInstance(){
		return Singleton4Holder.instance;
	}
}
