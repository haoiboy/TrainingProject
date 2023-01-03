package day01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("localhost");
        String hostName = inetAddress.getHostName();
        System.out.println("hostname:"+hostName);
        String hostAddress = inetAddress.getHostAddress();
        System.out.println("hostAddress:"+hostAddress);

    }
}
