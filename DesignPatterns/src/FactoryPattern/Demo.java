package FactoryPattern;

interface IColor{
	void fill();
}

class LightRed implements IColor{
	public void fill() {
		System.out.println("Fill in Light Red");
	}
}

class LightGreen implements IColor{
	public void fill() {
		System.out.println("Fill in Light Green");
	}
}

class LightBlue implements IColor{
	public void fill() {
		System.out.println("Fill in Light Blue");
	}
}

class DarkRed implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Red");
	}
}

class DarkGreen implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Green");
	}
}

class DarkBlue implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Blue");
	}
}

abstract class ColorSelection{
	public abstract IColor getColor(String type);
}

class LightColorFactory extends ColorSelection{
	public IColor getColor(String type){
		if (type.equals("red")) {
			return new LightRed();
		}
		else if (type.equals("green")) {
			return new LightGreen();
		}
		else {
			return new LightBlue();
		}
	}
}

class DarkColorFactory extends ColorSelection{
	public IColor getColor(String type){
		if (type.equals("red")) {
			return new DarkRed();
		}
		else if (type.equals("green")) {
			return new DarkGreen();
		}
		else {
			return new DarkBlue();
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorSelection lightcolor = new LightColorFactory();
		lightcolor.getColor("red").fill();
		
		ColorSelection darkcolor = new DarkColorFactory();
		darkcolor.getColor("red").fill();
	}

}
