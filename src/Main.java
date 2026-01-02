import adapter.MessageAdapter;
import adapter.ModernMessageSender;
import oldSystem.OldMessageSender;
import oldSystem.OldMessageSystem;

// Client
public class Main{
    public static void main(String[] args){
        OldMessageSender oldSystem = new OldMessageSystem();
        ModernMessageSender adapter = new MessageAdapter(oldSystem);

        adapter.sendMessage("Hello, World!", "JohnDoe@example.com");
    }
}