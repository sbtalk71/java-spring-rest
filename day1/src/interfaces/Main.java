package interfaces;

public class Main {

	public static void main(String[] args) {
		
		AppRemote rm= new OnidaTV();
		rm.on();
		rm.changeChannel(10);
		rm.changeChannel(12);
		rm.off();
	}

}
