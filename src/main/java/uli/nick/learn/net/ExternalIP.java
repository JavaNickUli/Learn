package uli.nick.learn.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExternalIP {

    public static void main(String[] args) {

        try {
            URL ipAddress = new URL("http://myexternalip.com/raw");
            System.out.println(new BufferedReader(new InputStreamReader(ipAddress.openStream())).readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
