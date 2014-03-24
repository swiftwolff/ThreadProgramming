
public class Maintest {
	
	public static void main(String args[]){

		testThread t1 = new testThread("Hello",6000,4);
		t1.start();
		Thread theMain = Thread.currentThread();
		for(int x=1;x<=3;x++){
			System.out.println(theMain.getName() + " ++> " + theMain.toString());
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
		}
	}
	
	
}
