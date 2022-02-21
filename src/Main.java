import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	String path = "newFile1.txt";
	
	Vector<String>content;
	
	public Main() {
		
		
		File f = new File(path);
		
//		/*
//		 * ini adalah pembuktian jika kita ngaa ngulang initiate read dia ngaa 
//		 * bisa ngebaca update dari si file
//		 */
		try {
			if (f.createNewFile()) {
				System.out.println("created Successfully");
			} else System.out.println("not Successful");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		
//		int i0 = 2;
//		Scanner scan = null;
//		try {
//			scan = new Scanner(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		content = new Vector<String>();
//		while (scan.hasNextLine()) {
//			String temp = scan.nextLine();
//			content.add(temp);
//		}
//		
//		/*ini cara mengoutput content yg di dalam file, logikanya kita menyimpan 
//		* setiap baris dalam vector, kemudian show seperti biasa, jika mau dalam bentuk
//		* output 1 string kita bisa memakai concat dan menambahkan escape sequence \n di
//		* setiap vecotr. seperti di bawah ini
//		*
//		*/
//		String gabungan = "";
//		for (String string : content) {
//			String temp = string.concat("\n");
//			gabungan += temp;
//		}
//		System.out.println(gabungan);
//		
//		
//		
//		while(i0 == 2) {
//			i0 = sc.nextInt(); sc.nextLine();
//			for (String string : content) {
//				System.out.println(string);
//			}
//		}
//		
//		/*
//		 * test file reader harus ngulang init biar dia ngupdate teros;
//		 * ini contoh pemakaian method yg saya buat di bawah
//		 * setiap kali dia bakal minta inputan kalo misal si user input 1 maka dia 
//		 * read ulang si file dengan menjalankan method yg saya buat
//		 */
//		int i1 = 1;
//		while (i1 == 1) {
//			i1 = sc.nextInt(); sc.nextLine();
//			try {
//				readfile(f);
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			for (String string : content) {
//				System.out.println(string);
//			} 
//		}
//		
		
		/*
		 * untuk append, maka kita harus mengambil data dari file yang paling baru
		 * jdi reader akan saya loop, dan juga user akan menambahkan sebuah string untuk di append
		 * seperti berikut
		 */
		
		int i2 = 3;
		while (i2 == 3) {
			try {
				readfile(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(content.size());
			String append = sc.nextLine();
			content.add(append);
			String temp = "";
			for (String string : content) {
				System.out.println(string);
				String temp2 = string.concat("\n");
				temp = temp.concat(temp2);
			}
			System.out.println("ini temp" + temp);
			
			try {
				FileWriter fw = new FileWriter(f);
				fw.write(temp);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i2 = sc.nextInt(); sc.nextLine();
			
		}
		
//		if (f.mkdir()) {
//			System.out.println("Directory successfuly created");
//		}
//		
//		String abspath = f.getAbsolutePath();
//		Vector<File> files = new Vector<File>();
//		String[] filespath = f.list();
//		
//		
//		for (String string : filespath) {
////			System.out.println(string);
//			String a = String.format("%s\\%s", abspath, string);
//			System.out.println(a);
//			File f2 = new File(a);
//			files.add(f2);
//		}
//		
//		for (File file: files) {
//			System.out.println(file.exists());
//		}
//		try {
//			if (f.createNewFile()) System.out.println("file Created");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println(f.getName());
		
		
//		if (f.exists()) {
//			System.out.println("Ini exist");
//		} else {
//			System.out.println("Ini ngaa exist");
//		}
		
//		try {
//			if (f.createNewFile()) {
//				System.out.println("file ini tercreate\n\n\n");
//			} else {
//				System.out.println("file ini sudah ada\n\n\n");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Scanner filescan = null;
//		
//		try {
//			filescan = new Scanner(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		try {
////			do {
////				System.out.println(filescan.nextLine());
////			} while (filescan.hasNextLine());
////		} catch (Exception e1) {
////			// TODO Auto-generated catch block
////		}
//		Vector<String> filecont = new Vector<>();
//		while (filescan.hasNextLine()) {
//			filecont.add(filescan.nextLine());
//		}
//		for (String string : filecont) {
//			System.out.println(string);
//		}
//		
//		
//		filescan.close();
//		Scanner filereader = null;
//		try {
//			filereader = new Scanner(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		while (filereader.hasNextLine()) {
//			System.out.println(filereader.nextLine());
//		}
//		filereader.close();
//		
//		String contentlama = "";
//		for (String string : filecont) {
//			contentlama.concat("\n" + string);
//		}
//		System.out.println(contentlama);
//		try {
//			FileWriter fw = new FileWriter(f);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw);
////			
//
//			pw.print("Elvin\n");
//			pw.print("revaldo");
//			pw.flush();
//			pw.close();
//			
//			bw.close();
//			fw.close();
////			String contentbaru = contentlama.concat("\nRevaldo\nDhammacora");
////			System.out.println("ini content baru" + contentbaru);
////			fw.write((contentlama+"\nRafif").toCharArray());
////			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		if (f.delete()) {
//			System.out.println("jadi");
//		} else {
//			System.out.println("Gagal");
//		}
//		
		
		
		
//		System.out.println(f.canWrite());
//		System.out.println(f.canRead());
//		System.out.println(f.length());
//		String a = "Elvin";
//		
//		byte[] b = a.getBytes();
		
		
//		System.out.println(b);
		
		
//		try {
//			FileOutputStream fos = new FileOutputStream(f);
////			fos.write(temp.getBytes());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	public void readfile(File f) throws FileNotFoundException {
		/*
		 * method ini gw pake buat ngulang read
		 */
		Scanner	scn = new Scanner(f);
		content = new Vector<String>();		
		while (scn.hasNextLine()) {
			String temp = scn.nextLine();
			content.add(temp);
		}
	}
	
	public static void main(String[] args) {
		new Main();	
	}
	
}
