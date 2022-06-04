package com.question1;

public interface X {

	abstract void FunA();
	
	default void FunB() {
		System.out.println("Hey I am funB in interface X");
	}
	static void FunC() {
		System.out.println("Hey I am Static funC in interface X");
	}
}
interface Y{
	abstract void FunD() ;
	
	default void FunE() {
		System.out.println("Hey I am funE in Interface Y");
	}
	static void FunF() {
		System.out.println("Hey I am Static funF in interface Y");
	}
}
interface Z extends X,Y{
	abstract void FunZ();
}
class Zimpl implements Z{

	@Override
	public void FunA() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am funA in Zimpl");
	}
	
	@Override
	public void FunD() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am funD in Zimpl");
	}
	
	@Override
	public void FunZ() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am funZ in Zimpl");
	}
		
}
class Demo{
	public static void main(String[] args) {
		Z z=new Zimpl();
		z.FunA();
		z.FunB();
		z.FunD();
		z.FunE();
		z.FunZ();
		X.FunC();
		Y.FunF();
	}
}