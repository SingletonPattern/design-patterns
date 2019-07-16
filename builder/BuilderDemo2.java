/**
 *@author CS-1020-20
 * @className Builder
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/7/12 9:52
 *@Version
 */
public class BuilderDemo2 {

 	static class Student{
 		String name = null;
 		int number = -1;
 		String sex = null;
 		int age = -1;
 		String school = null;
 		
 		static class StudengBuilder{
			String name = null ;
			int number = -1 ;
			String sex = null ;
			int age = -1 ;
			String school = null ;
		 
			public void setName(String name) {
				this.name = name;
			}
		 
			public StudengBuilder setNumber(int number) {
				this.number = number;
				return this;
			}
		 
			public StudengBuilder setSex(String sex) {
				this.sex = sex;
				return this;
			}
		 
			public StudengBuilder setAge(int age) {
				this.age = age;
				return this;
			}
		 
			public StudengBuilder setSchool(String school) {
				this.school = school;
				return this;
			}
			public Student build(){
				return new Student(this);
			}
		}
		public Student(StudengBuilder builder){
			this.age = builder.age;
			this.name = builder.name;
			this.number = builder.number;
			this.school = builder.school ;
			this.sex = builder.sex ;
		}
	}
	
	public static void main(String[] args) {
		Student.StudengBuilder builder = new Student.StudengBuilder();
//		Student s = new Student.StudengBuilder().school
		
		StringBuilder stringBuilder = new StringBuilder();
	}
}
