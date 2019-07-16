package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@className JdkProxy
 *@description JDK动态代理
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 14:42
 *@Version
 */
public class JdkProxy implements InvocationHandler{
	private Object targetObject;
	
	public Object newProxy(Object targetObject){
		
		/**
		 * 将目标对象传入代理
		 */
		this.targetObject = targetObject;
		
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//进行逻辑处理的函数
		checkPopedom();
		Object ret = null;
		//调用invoke方法
		ret = method.invoke(targetObject,args);
		return ret;
	}
	private void checkPopedom() {
		System.out.println("检查权限：checkPopedom()!");
	}
}
