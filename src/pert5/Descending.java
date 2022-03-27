package pert5;

public class Descending implements Runnable{

	public Descending() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 10; i > 0; i--) {
			System.out.println("Ini descending Ke " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Descending selesai");
	}

}
