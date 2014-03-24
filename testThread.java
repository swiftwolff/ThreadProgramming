
public class testThread extends Thread{
	String Mess;
	int sleepNum, ptrTimes;
	public testThread(){
		Mess = "cyh";
		sleepNum = 1000;
		ptrTimes = 3;
	}
	public testThread(String s,int a,int t){
		Mess = s;
		ptrTimes = t;
		sleepNum = a<0?0:a;
	}
	public void run(){
		for(int x = 1;x<=ptrTimes;x++){
			System.out.println(Mess);
			try{
				Thread.sleep(sleepNum);
			}catch(Exception ecp){
				
			}
		}
	}
	
}
