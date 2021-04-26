package interfaces;

public class SonyTV implements AppRemote{

	@Override
	public void on() {
		System.out.println("TV is Switched On");
		
	}

	@Override
	public void off() {
		System.out.println("TV is Switched off");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("Channel set to "+channel);
		
	}

}
