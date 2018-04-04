class MulTh implements Runnable {
	public void run() {
		
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

			}
}

class MulTh2 {
	public static void main(String[] args) {
		int n = 18;
		for (int i = 0; i < 8; i++) {
			Thread object = new Thread(new MulTh());
			object.start();
		}
	}
}
