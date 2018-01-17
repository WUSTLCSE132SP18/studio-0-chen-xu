
public class Heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time=0;
		while(time<1000) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time+=1;
			System.out.println("Time elapsed: "+time);
		}

	}

}
