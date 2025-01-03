/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmazonScalabilitySimulation;


public class Main {
    public static void main(String[] args) {
        LoadBalancer lb = new LoadBalancer();

        lb.distributeRequest("Request 1");
        lb.distributeRequest("Request 2");
        lb.distributeRequest("Request 3");
        lb.distributeRequest("Request 4");
        lb.distributeRequest("Request 5");
    }
}
