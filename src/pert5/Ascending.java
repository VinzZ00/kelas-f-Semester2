package pert5;

public class Ascending extends Thread{

	public Ascending() {
		// TODO Auto-generated constructor stub		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
//			if (i == 5) {
//				this.stop();
//			}
			System.out.println("Ini ascending ke " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ascending thread selesai dijalankan");
	}

}
