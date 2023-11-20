package sh.java.network.tcp.chat.groupchat.server;

public class GroupServerMain {
	 public static void main(String[] args) {
	        try {
	            new GroupServer(7777);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
