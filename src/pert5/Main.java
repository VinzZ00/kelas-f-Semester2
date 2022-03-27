package pert5;

public class Main {

	int a= 0, b= -1;
	
	public Main() {
		// TODO Auto-generated constructor stub
		
//		for (int i = 1; i < 11; i++) {
//			System.out.println("Ini angka ke " + i);
//			if (i == 5) {
//					try {
//						System.out.println(1/0);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						System.out.println("Disini ada error");
//					}
//			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("ascending thread selesai dijalankan");
//		
//		for (int i = 10; i > 0; i--) {
//			System.out.println("Ini angka Ke " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Descending selesai");
	
		
//		Thread asc = new Ascending();
//		Thread desc = new Thread(new Descending());
//		desc.setDaemon(true);
//		asc.start();
//		try {
//			asc.join(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		desc.start();
//		
//		
		Thread traina = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i < 11; i++) {
//					if (i == 5) {
//						this.stop();
//					}
					System.out.println("Ini ascending ke " + i);
					a = i;
					System.out.println(a);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread trainb = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 10; i > 0; i--) {
					System.out.println("Ini descending Ke " + i);
					b = i;
					System.out.println(b);
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread check = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				do {
					int keretaA = a;
					int keretaB = b;
					System.out.println(a + " " + b);
					if (keretaA == keretaB) {
						System.out.println("Di Detik ke " + a + " kedua kereta bertabrakan");
						System.exit(0);
						break;
					}
				} while (true);
				
			}
		});
		check.setDaemon(true);
		
		traina.start();
//		try {
//			traina.join(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		trainb.start();
		check.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
