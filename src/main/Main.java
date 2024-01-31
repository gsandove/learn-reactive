package main;

import threads.RHilo;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main");
		RHilo hilo = new RHilo(1);
		hilo.run();
	}
}
