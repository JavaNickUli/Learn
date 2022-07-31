package uli.nick.learn.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class IPAddress {

    public static void main(String[] args) throws UnknownHostException {

        System.out.println("System IP address : " + InetAddress.getLocalHost().getHostAddress());

        try {
            URL urlName = new URL("http://myexternalip.com/raw");
            System.out.println("Public IP address : "
                    + new BufferedReader(new InputStreamReader(urlName.openStream())).readLine());
        } catch (IOException e) {
            System.out.println("Cannot execute properly.");
        }
    }
}
