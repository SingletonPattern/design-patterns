/**
 *@className DecoratotTest
 *@description 装饰模式
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 18:00
 *@Version
 */
 public class DecoratotTest {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		c.operation();
		System.out.println("====================");
		Component p = new ConcreteDecorator(c);
		p.operation();
	}
	
 
}

/**
 * 抽象构件角色
 */
interface Component{
 	void operation();
}

/**
 * 具体构件角色
 */
class ConcreteComponent implements Component{
	public ConcreteComponent() {
		System.out.println("创建具体构件角色");
	}
	@Override
	public void operation() {
		System.out.println("调用具体构件角色的方法operation()");
	}
}

/**
 * 抽象装饰角色
 */
class Decorator implements Component{
	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}
}

/**
 * 具体装饰角色
 */
class ConcreteDecorator extends Decorator{
	
	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		super.operation();
		addedFuntion();
	}
	
	public void addedFuntion(){
		System.out.println("为具体构件角色增加额外的功能addedFunction()");
	}
}