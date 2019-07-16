/**
 *@className BridateTest
 *@description 桥接模式
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 16:48
 *@Version
 */
public class BridateTest {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(implementor);
		abs.Operation();
	}
}

/**
 * 实现化角色
 */
interface Implementor{
	void OperationImpl();
}

/**
 * 具体实现化角色
 */
class ConcreteImplementorA implements Implementor{
	
	@Override
	public void OperationImpl() {
		System.out.println("具体实现化(Concrete Implementor)角色被访问" );
	}
}


/**
 * 抽象化角色
 */
abstract class Abstraction{
	protected Implementor imple;
	protected Abstraction(Implementor imple){
		this.imple = imple;
	}
	public abstract void Operation();
}

/**
 * 扩展抽象化角色
 */
class RefinedAbstraction extends Abstraction{
	protected RefinedAbstraction(Implementor imple) {
		super(imple);
	}
	
	@Override
	public void Operation() {
		System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
		imple.OperationImpl();
	}
}