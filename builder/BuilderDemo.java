/**
 *@className Product
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 19:55
 *@Version
 */
public class BuilderDemo {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product construct = director.construct();
		construct.show();
	}
}

/**
 * 产品角色
 */
class Product {
	private String productA;
	private String productB;
	private String productC;
	
	public void setProductA(String productA) {
		this.productA = productA;
	}
	
	public void setProductB(String productB) {
		this.productB = productB;
	}
	
	public void setProductC(String productC) {
		this.productC = productC;
	}
	
	public void show(){
		System.out.println("Product{" +
				"productA='" + productA + '\'' +
				", productB='" + productB + '\'' +
				", productC='" + productC + '\'' +
				'}');
	}
	
	@Override
	public String toString() {
		return "Product{" +
				"productA='" + productA + '\'' +
				", productB='" + productB + '\'' +
				", productC='" + productC + '\'' +
				'}';
	}
}

/**
 * 抽象建造者
 */
abstract class Builder{
	protected Product product = new Product();
	public abstract void buildProductA();
	public abstract void buildProductB();
	public abstract void buildProductC();
	
	/**
	 * 返回产品对象
	 * @return
	 */
	public Product getResult(){
		return product;
	}
}

/**
 * 具体建造者
 */
class ConcreteBuilder extends Builder{
	
	@Override
	public void buildProductA() {
		product.setProductA("张三A");
	}
	
	@Override
	public void buildProductB() {
		product.setProductB("李四B");
	}
	
	@Override
	public void buildProductC() {
		product.setProductC("王五C");
	}
}

/**
 * 指挥者
 */
class Director{
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public Product construct(){
		builder.buildProductA();
		builder.buildProductB();
		builder.buildProductC();
		return builder.getResult();
	}
}

