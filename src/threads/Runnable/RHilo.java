package threads.Runnable;

public class RHilo implements Runnable{
	
	private int id;
	
	public RHilo(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			System.out.println("[R] Ejecutándose hilo de id --> " + id);
		}
	}
}
