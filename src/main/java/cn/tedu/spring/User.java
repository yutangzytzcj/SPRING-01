package cn.tedu.spring;

public class User {

	public String name;
	public String from;
	public int age;

	public User(String name, String from, int age) {
		super();
		this.name = name;
		this.from = from;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", from=" + from + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		super();
		System.out.println("创建User对象……");
	}
	
	public void init() {
		System.out.println("初始化方法被调用……");
	}
	
	public void destroy() {
		System.out.println("销毁方法被调用……");
	}
	
}
