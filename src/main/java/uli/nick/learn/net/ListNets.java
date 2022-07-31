package uli.nick.learn.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

import static java.lang.System.out;

public class ListNets {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface net : Collections.list(nets)) {
            displayInterfaceInformation(net);
        }
    }

    static void displayInterfaceInformation(NetworkInterface net) {

        out.printf("Display name: %s\n", net.getDisplayName());
        out.printf("Name: %s\n", net.getName());
        Enumeration<InetAddress> inetAddresses = net.getInetAddresses();

        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            out.printf("InetAddress: %s\n", inetAddress);
        }

        out.println();
    }
}
