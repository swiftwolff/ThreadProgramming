
public class Welcome implements Runnable {

	public void run(){
		while(true){
			System.out.println("Welcome!");

			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
		}
	}
	
	public static void main(String args[]){
		Thread ThreadObj = new Thread(new Welcome(),"AiYaYa");
		System.out.println(ThreadObj.getName());
		ThreadObj.start();
	}
	
}
