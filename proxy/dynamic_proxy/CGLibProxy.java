package dynamic_proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *@className CGLibProxy
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 14:58
 *@Version
 */
public class CGLibProxy implements MethodInterceptor {
	private Object targetObject;
	public Object createProxyObject(Object object){
		this.targetObject = object;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		Object proxyObj = enhancer.create();
		return proxyObj;
	}
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		Object obg = null;
		// 过滤方法
		if ("addUser".equals(method.getName())) {
			// 检查权限
			checkPopedom();
		}
		obg = method.invoke(targetObject, objects);
		
		return obg;
	}
	private void checkPopedom() {
		System.out.println("检查权限：checkPopedom()!");
	}
}
