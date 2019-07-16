/**
 *@className Bike
 *@description 具体产品角色，自行车
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 17:39
 *@Version
 */
 public class Bike implements Car {
	
	@Override
	public void gotWork() {
		System.out.println("骑自行车去上班");
	}
}
