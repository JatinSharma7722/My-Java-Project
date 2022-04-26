package com.thread;

public class threadrunnableexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneThread obj = new OneThread();
        TwoThread obj1 =new TwoThread();
        Thread ob = new Thread(obj);
        Thread ob1 = new Thread(obj1);
        ob.start();
        ob1.start();
	}

}
class OneThread implements Runnable {
    public void run() {
        int i = 1;
        while (i<11) {
            System.out.println("5 * "+i+" = "+ 5*i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class TwoThread implements Runnable {
    public void run() {
        int j = 1;
        while (j<11) {
            System.out.println("2 * "+j+" = " +2*j++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}