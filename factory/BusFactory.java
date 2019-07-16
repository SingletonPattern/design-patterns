/**
 *@className BusFactory
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 17:44
 *@Version
 */
 public class BusFactory implements ICarFactory {
	@Override
	public Car getCar() {
		return new Bus();
	}
}
