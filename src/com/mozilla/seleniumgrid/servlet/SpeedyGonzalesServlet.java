package com.mozilla.seleniumgrid.servlet;

import org.webbitserver.WebServer;
import org.webbitserver.WebServers;

public class SpeedyGonzalesServlet {

    public static void main(String[] args){
        WebServer server = WebServers.createWebServer(3000)
                .add("/moveMouse", new MouseMoveHandler());
        server.start();
        System.out.println("Server has been started");
    }
}
