/**
 *@className ParlourManager
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 10:09
 *@Version
 */
public class ParlourManager {
	
	private String wall;
	private String TV;
	private String sofa;
	
	public void setWall(String wall) {
		this.wall = wall;
	}
	
	public void setTV(String TV) {
		this.TV = TV;
	}
	
	public void setSofa(String sofa) {
		this.sofa = sofa;
	}
	
	protected ParlourManager(Builder builder){
		this.wall = builder.wall;
		this.TV = builder.TV;
		this.sofa = builder.sofa;
	}
	
	@Override
	public String toString() {
		return "ParlourManager{" +
				"wall='" + wall + '\'' +
				", TV='" + TV + '\'' +
				", sofa='" + sofa + '\'' +
				'}';
	}
	
	static class Builder{
		private String wall;
		private String TV;
		private String sofa;
		
		public Builder setWall(String wall) {
			this.wall = wall;
			return this;
		}
		
		public Builder setTV(String TV) {
			this.TV = TV;
			return this;
		}
		
		public Builder setSofa(String sofa) {
			this.sofa = sofa;
			return this;
		}
		
		public ParlourManager build(){
			return new ParlourManager(this);
		}
	}
	
	public static void main(String[] args) {
		ParlourManager parlourManager = new ParlourManager.Builder()
				.setSofa("沙发")
				.setTV("电视")
				.setWall("墙面")
				.build();
		System.out.println(parlourManager.toString());
	}
}
