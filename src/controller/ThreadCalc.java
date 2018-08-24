package controller;

public class ThreadCalc extends Thread {

	private int a;
	private int b;
	private int op;
	
	public ThreadCalc(int a, int b, int op) {
		
		this.a = a;
		this.b = b;
		this.op = op;
		
	}
	
	@Override
	public void run() {
		
		System.out.println(a);
		
		
	}
	
	/* Threads 
	 * ela tem que herdar as carcteristicas de thread; 
	 * o main da thred so roda no metodo run eo run não recebe parametro; 
	 * se quiser passar um parametro pra ela so se for pelo construtor da classe.
	*/
	// source - overhild implements metods.
}
