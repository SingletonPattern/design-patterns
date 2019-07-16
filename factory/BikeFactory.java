/**
 *@className BikeFactory
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 17:43
 *@Version
 */
 public class BikeFactory implements ICarFactory {
	@Override
	public Car getCar() {
		return new Bike();
	}
}
