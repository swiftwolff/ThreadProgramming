
public class coffee {
	int contents;
	boolean available = false;
	public synchronized int get(){
		while (available == false){
			try{
				//wait for Producer to put value
				wait();
			}catch (InterruptedException e){
				//get interrupted from put and start the script below
			}
		}
		available = false;
		//notify Producer that value has been retrieved
		notifyAll();
		return contents;
	}
	public synchronized void put(int value){
		while(available==true){
			try{
				wait();  //wait for Consumer to get value
			}catch(InterruptedException e){
				//get interrupted from get and start the script below
			}
		}
		contents = value;
		available = true;
		//notify Consumer that value has been set
		notifyAll();
	}
	
	//sychronized block vs. synchronized methods (above is methods)
}
