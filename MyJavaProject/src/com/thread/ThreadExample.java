package com.thread;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread t = new NewThread();
        NextThread r =new NextThread();
        t.start();
        r.start();
	}

}
class NewThread extends Thread {
    public void run() {
        int i = 1;
        while (i<11) {
            System.out.println("5 * "+i+" = "+ 5*i++);
            System.out.println("The Thread name is " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class NextThread extends Thread {
    public void run() {
        int j = 1;
        while (j<11) {
            System.out.println("2 * "+j+" = " +2*j++);
            System.out.println("The Thread name is " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}