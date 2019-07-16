/**
 * @className Singleton5
 * @description 枚举类模式
 * @Auther 85291173@qq.com
 * @Date 2019/7/9 19:31
 * @Version
 */
public enum Singleton5 {
	
	/**
	 *
	 */
	INSTANCE;
	
	/**
	 * 在需要继承的场景不适用。
	 * @return
	 */
	public Singleton5 getInstance(){
		return INSTANCE;
	}
	
	public void sayHello(){
		System.out.println("hello world");
	}
	
	
	public static void main(String[] args) {
		Singleton5.INSTANCE.sayHello();
	}
}
