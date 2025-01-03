/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmazonScalabilitySimulation;


import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    private List<WebServer> servers = new ArrayList<>();

    public LoadBalancer() {
        servers.add(new WebServer());
        servers.add(new WebServer());
        servers.add(new WebServer());
    }

    public void distributeRequest(String request) {
        int serverIndex = request.hashCode() % servers.size();
        servers.get(serverIndex).handleRequest(request);
    }
}

