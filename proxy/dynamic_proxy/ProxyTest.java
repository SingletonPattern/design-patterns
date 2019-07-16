package dynamic_proxy;

/**
 *@className ProxyTest
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 14:49
 *@Version
 */
public class ProxyTest {
	public static void main(String[] args) {
		JdkProxy jdkProxy = new JdkProxy();
		UserManager newProxy = (UserManager) jdkProxy.newProxy(new UserManagerImpl());
		newProxy.addUser("123","LISI");
		
		CGLibProxy cgLibProxy = new CGLibProxy();
		UserManager userManager = (UserManager) cgLibProxy.createProxyObject(new UserManagerImpl());
		userManager.addUser("456","wangwu");
	}
}

