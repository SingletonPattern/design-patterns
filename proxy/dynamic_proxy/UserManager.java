package dynamic_proxy;

/**
 *@className UserManager
 *@description 目标接口类
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 14:41
 *@Version
 */
public interface UserManager {
	void addUser(String id, String password);
	void delUser(String id);
}
