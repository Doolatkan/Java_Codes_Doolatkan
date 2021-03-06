package day44_oopreview.callcenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "Whats App";
		wa.call("Doolatkan");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		wa.getCount();
		wa.setCount(5);
		
		System.out.println("=================================================");
		
		
		VoiceCallable obj = new WhatsApp();
		((WhatsApp)obj).launch();
		
		((MessagingApp)obj).allOSCompatible = false;
		obj.call("Mr Tom");
		
		((WhatsApp)obj).videoCall();
		
	   (( VideoCallable)obj).videoCall();
		
		
		

	}

}

