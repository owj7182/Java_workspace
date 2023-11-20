package sh.java.network.tcp.chat.groupchat.client;

public class GroupClientMain {
	
	// 192.168.20.100 7777 오우진
	public static void main(String[] args) {
        try {
            if(args.length != 3){
                System.err.println("Usage : java GroupClentMain 서버주소 서버포트 이름");
                return;
            }
            String serverIp = args[0];
            int serverPort = Integer.parseInt(args[1]);
            String name = args[2];
            GroupClient gc = new GroupClient(serverIp, serverPort, name);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("프로그램을 종료합니다.");
        }
        
    }
}
