package CommandPattern;

public class Demo {

	public static void main(String[] args) {
		Light livingRoomLight = new LivingRoomLight();
		Light bedRoomLight = new BedRoomLight();
		
		Command oncommandLivingRoom = new OnCommand(livingRoomLight);
		Command offcommandLivingRoom = new OffCommand(livingRoomLight);
		
		Command onCommandBedroom = new OnCommand(bedRoomLight);
		Command offCommandBedroom = new OffCommand(bedRoomLight);
		
		RemoteController remoteController1 = new RemoteController(oncommandLivingRoom, offcommandLivingRoom);
		RemoteController.getInstance();
		remoteController1.onButtonPressed();
		remoteController1.offButtonPressed();
		
		RemoteController remoteController2 = new RemoteController(onCommandBedroom, offCommandBedroom);
		remoteController2.onButtonPressed();
		remoteController2.offButtonPressed();
		
	}

}
