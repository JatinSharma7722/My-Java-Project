package com.interface_abstract;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        dummy obj = new dummy();
        obj.videocall();
        obj.camera();
        obj.message();
	}

}
interface Phone{
	void videocall();
	void camera();
	void message();
}
abstract class Next implements Phone{
	public void videocall() {
		System.out.println("I can do video calls");
	}
	public void camera() {
		System.out.println("I can click pictures");
	}
	public void message() {
		System.out.println("I can send messages");
	}
}
class dummy extends Next{
	
}
