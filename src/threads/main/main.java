package threads.main;

import java.time.Duration;
import java.time.LocalTime;

import threads.Runnable.RHilo;
import threads.Thread.THilo;

public class main {
	
	public static void main(String[] args)  {
		System.out.println("=======Main=======");
		callThreadsPriority();
	}
	
	private static void callThreadsPriority() {
		THilo hiloP1 = new THilo();
		THilo hiloP2 = new THilo();
		THilo hiloPNormal = new THilo();
		
		hiloP1.setPriority(Thread.MAX_PRIORITY);
		hiloP2.setPriority(Thread.MIN_PRIORITY);
		hiloPNormal.setPriority(Thread.NORM_PRIORITY);
		hiloP2.start();
		hiloPNormal.start();
		hiloP1.start();
	}
	
	private static void callThreads() {
		THilo hilo = new THilo();
		hilo.start();
	}
	
	private void callRunnable()throws InterruptedException {
		RHilo hilo = new RHilo(1); //instance but not execute
		RHilo hilo2 = new RHilo(2); //Se instacia pero no se ejecuta

		System.out.println("Time : "+LocalTime.now());
		hilo.wait(3000); //Este es un metodo no ejecutable
		System.out.println("Time : "+LocalTime.now());
		hilo.run();
		hilo2.run();
	}
}
