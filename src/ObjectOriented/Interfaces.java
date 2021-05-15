package ObjectOriented;


class Phone2{
	
	public void call()
	{
		System.out.println("Call function of phone class");
	}
	
	public void sms()
	{
		System.out.println("SMS function of phone class");
	}
	
}

interface ICamera{
	
	public void click();
	public void record();
}

interface IMusicPlayer{
	
	public void play();
	public void pause();
	public void stop();
}


class SmartPhone2 extends Phone2 implements ICamera,IMusicPlayer{
	
	public void click() {
		System.out.println("Click of SmartPhone.");
	}
	public void record() {
		System.out.println("Record of SmartPhone.");
	}
	
	public void play() {
		System.out.println("Play of SmartPhone.");
	}
	public void pause() {
		System.out.println("Pause of SmartPhone.");
	}
	public void stop() {
		System.out.println("Stop of SmartPhone.");
	}
	
	public void VideoCall() {
		System.out.println("VideoCall of SmartPhone.");
	}
}

public class Interfaces {
	
	public static void main(String [] args) {
		
		// In respect of object referencing interfaces are like abstract classes. They can have 
		// their own object but reference object of other classes.
		ICamera icamera=new SmartPhone2();
	
		icamera.click();
		icamera.record();
		
		IMusicPlayer imusplay=new SmartPhone2();
		
		imusplay.pause();
		imusplay.stop();
		imusplay.play();
		
		
		
		
	}
	

}
