package oldSystem;

// Concrete Adaptee
public class OldMessageSystem implements OldMessageSender{
    @Override
    public int send(String[] messageData){
        System.out.println(
                "OldMessageSytem: Sending message: "
                        + messageData[0] + " to " + messageData[1]
        );

        return 1; // Success code
    }
}
