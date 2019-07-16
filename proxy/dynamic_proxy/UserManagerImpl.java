package dynamic_proxy;

/**
 *@className UserManagerImpl
 *@description 接口实现类
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 14:42
 *@Version
 */
public class UserManagerImpl implements UserManager {
	@Override
	public void addUser(String id, String password) {
		System.out.println("调用了UserManagerImpl.addUser()方法！");
		System.out.println(id+password);
	}
	
	@Override
	public void delUser(String id) {
		System.out.println("调用了UserManagerImpl.delUser()方法！");
	}
}
