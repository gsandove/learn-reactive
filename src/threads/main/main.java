package threads.main;

import java.time.Duration;

import threads.Runnable.RHilo;

public class main {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main");
		RHilo hilo = new RHilo(1); //instance but not execute
		RHilo hilo2 = new RHilo(2); //Se instacia pero no se ejecuta
		Thread thread = new Thread();
		
		hilo.wait(3000); //Este es un metodo no ejecutable
		hilo.run();
		hilo2.run();
	}
}
