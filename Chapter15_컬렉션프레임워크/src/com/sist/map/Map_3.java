package com.sist.map;

// -> 클래스 관리자
import java.util.*;

interface I
{
	public void execute();
}

class A implements I
{
	@Override
	public void execute() {
		System.out.println("A execute() call...");
	}
}

class B implements I
{
	@Override
	public void execute() {
		System.out.println("B execute() call...");
	}
}

class C implements I
{
	@Override
	public void execute() {
		System.out.println("C execute() call...");
	}
}

class D implements I
{
	@Override
	public void execute() {
		System.out.println("D execute() call...");
	}
}

class Container
{
	Map<String, Object> map = new HashMap<String, Object>();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	
	// 클래스 찾기
	public Object getBean(String key)
	{
		return map.get(key);
	}
}
public class Map_3 {

	public static void main(String[] args) {
		Container c = new Container();
		A a = (A)c.getBean("a");
		a.execute();
		
		B b = (B)c.getBean("b");
		b.execute();
		
		C cc = (C)c.getBean("c");
		cc.execute();
		
		D d = (D)c.getBean("d");
		d.execute();
	}

}
