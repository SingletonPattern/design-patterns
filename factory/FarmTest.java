/**
 *@className FarmTest
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 19:18
 *@Version
 */
public class FarmTest {
	public static void main(String[] args) {
		Farm farm = null;
		farm = new AFarm();
		farm.getAnimal().show();
		farm.getPlant().show();
		farm = new BFarm();
		farm.getPlant().show();
		farm.getAnimal().show();
	}
}

/**
 * 动物类
 */
interface Animal{
	void show();
}

/**
 * 马类
 */
class Horse implements Animal{
	
	@Override
	public void show() {
		System.out.println("展示马");
	}
}

/**
 * 牛类
 */
class Cattle implements Animal{
	
	@Override
	public void show() {
		System.out.println("展示牛");
		
	}
}

/**
 * 抽象产品：植物
 */
interface Plant{
	void show();
}

/**
 * 水果类
 */
class Fruitage implements Plant{
	
	@Override
	public void show() {
		System.out.println("展示水果");
	}
}

/**
 * 蔬菜类
 */
class Vegetables implements Plant{
	
	@Override
	public void show() {
		System.out.println("展示蔬菜");
	}
}

/**
 * 抽象工厂：农场类
 */
interface Farm{
	Animal getAnimal();
	Plant getPlant();
}

/**
 * A农产实现农场抽象类
 */
class  AFarm implements Farm{
	
	@Override
	public Animal getAnimal() {
		System.out.println("新牛出生了");
		return new Cattle();
	}
	
	@Override
	public Plant getPlant() {
		System.out.println("有新的蔬菜了");
		return new Vegetables();
	}
}

/**
 * B农产实现农场抽象类
 */
class BFarm implements Farm{
	
	@Override
	public Animal getAnimal() {
		System.out.println("新马出生了");
		return new Horse();
	}
	
	@Override
	public Plant getPlant() {
		return new Fruitage();
	}
}

