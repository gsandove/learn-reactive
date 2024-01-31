package main;

import threads.RHilo;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main");
		RHilo hilo = new RHilo(1);
		RHilo hilo2 = new RHilo(2);
		hilo.run();
		hilo2.run();
	}
}
