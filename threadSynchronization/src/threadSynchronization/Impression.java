package threadSynchronization;

public class Impression {
	
	public void imprime(String t) { // add "synchronized"
		for (int i= 0; i<t.length(); i++) {
			System.out.print(t.charAt(i));
		}
	}
}

class TPrint extends Thread {
	static Impression mImp = new Impression();
	String txt;
	public TPrint(String t) {
		txt = t;
	}
	
	public void run() {
		for (int j=0; j<3; j++) {
			mImp.imprime(txt);
		}
	}
	
	static public void main(String args[]) {
		TPrint a = new TPrint("Bonjour ");
		TPrint b = new TPrint("Au revoir ");
		a.start();
		b.start();
	}
}

