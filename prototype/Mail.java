/**
 *@className Mail
 *@description 原型模式：1.实现cloneable接口 2.重写clone方法
 *@Auther 85291173@qq.com
 *@Date 2019/7/11 16:17
 *@Version
 */
 public class Mail implements Cloneable{
 	private String name;
 	private String context;
 	private String title;
 	private String address;
	
	public Mail(String name, String context, String title, String address) {
		super();
		this.name = name;
		this.context = context;
		this.title = title;
		this.address = address;
	}
	
	
	/**
	 * 克隆方法
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Mail clone() throws CloneNotSupportedException {
		Mail mail = null;
		mail = (Mail) super.clone();
		return mail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContext() {
		return context;
	}
	
	public void setContext(String context) {
		this.context = context;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
