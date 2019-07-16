/**
 *@className TestFactory
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 17:45
 *@Version
 */
public class TestFactory {
	public static void main(String[] args) {
		ICarFactory factory = null;
		factory = new BikeFactory();
		Car bike = factory.getCar();
		bike.gotWork();
		
		factory = new BusFactory();
		Car bus = factory.getCar();
		bus.gotWork();
	}
}
