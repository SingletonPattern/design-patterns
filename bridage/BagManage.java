/**
 *@className BagManage
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 17:09
 *@Version
 */
public class BagManage {
	public static void main(String[] args) {
		Bag bag = new Wallet();
		String s = bag.setColor(new Red());
		String name = bag.getName();
		System.out.println(name+"包的颜色为"+s);
	}
}

abstract class Bag{
 	private Color color ;
// 	public Bag(Color color){
// 		this.color = color;
//	}
	public abstract String setColor(Color color);
	
	public abstract String getName() ;
}

class HandBag extends Bag{
	
	@Override
	public String setColor(Color color) {
		return color.getColor();
	}
	
	@Override
	public String getName() {
		return "HandBag";
	}
}

class Wallet extends Bag{
	
	@Override
	public String setColor(Color color) {
		return color.getColor();
	}
	
	@Override
	public String getName() {
		return "wallet";
	}
}


interface Color{
 	String getColor();
}

class Yellow implements Color{
	@Override
	public String getColor() {
		return "黄色";
	}
}
class Red implements Color{
	@Override
	public String getColor() {
		return "红色";
	}
}