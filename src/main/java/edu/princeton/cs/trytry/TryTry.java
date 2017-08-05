package edu.princeton.cs.trytry;

public class TryTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ads();

	}

	//测试abs中
	public static void ads(){
		//This strange (but true) result is a typical example of the effects of	integer overflow.
		System.out.println(Math.abs(-2147483648));
	}
}
