package tortutunel;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortugas t1 = new Tortugas("1");
		Tortugas t2 = new Tortugas("2");
		Tortugas t3 = new Tortugas("3");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);
		
		tt1.start();
		tt2.start();
		tt3.start();

	}

}
