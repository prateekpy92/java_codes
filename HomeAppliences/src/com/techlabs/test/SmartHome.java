// SmartHome.java
package com.techlabs.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Controllable;
import com.techlabs.model.Light;
import com.techlabs.model.Monitorable;
import com.techlabs.model.SecurityCamera;
import com.techlabs.model.SmartDevice;
import com.techlabs.model.Thermostat;

public class SmartHome {
	 private List<SmartDevice> devices;

	    public SmartHome() {
	        devices = new ArrayList<>();
	    }

	    public void addDevice(SmartDevice device) {
	        devices.add(device);
	    }

	    public void controlDevice(String deviceID, boolean turnOn) {
	        for (SmartDevice device : devices) {
	            if (device.getDeviceID().equals(deviceID) && device instanceof Controllable) {
	                Controllable controllableDevice = (Controllable) device;
	                if (turnOn) {
	                    controllableDevice.turnOn();
	                } else {
	                    controllableDevice.turnOff();
	                }
	                return;
	            }
	        }
	    }

	    public void listAllDevices() {
	        for (SmartDevice device : devices) {
	            System.out.println("Device ID: " + device.getDeviceID() + ", Name: " + device.getName() + ", Status: " + (device.isOn() ? "On" : "Off"));
	            if (device instanceof Monitorable) {
	                System.out.println("Additional Status: " + ((Monitorable) device).getStatus());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        SmartHome smartHome = new SmartHome();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Smart Home Management System");
	            System.out.println("1. Add Device");
	            System.out.println("2. Control Device");
	            System.out.println("3. List All Devices");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter device type (Light    Thermostat   SecurityCamera): ");
	                    String type = scanner.nextLine();
	                    System.out.print("Enter device ID: ");
	                    String deviceID = scanner.nextLine();
	                    System.out.print("Enter device name: ");
	                    String name = scanner.nextLine();

	                    if (type.equalsIgnoreCase("Light")) {
	                        smartHome.addDevice(new Light(deviceID, name));
	                    }
	                    if (type.equalsIgnoreCase("Thermostat")) {
	                        smartHome.addDevice(new Thermostat(deviceID, name));
	                    }
	                    if (type.equalsIgnoreCase("SecurityCamera")) {
	                        smartHome.addDevice(new SecurityCamera(deviceID, name));
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter device ID to control: ");
	                    String controlID = scanner.nextLine();
	                    System.out.print("1:Turn on  2:Turn Off  ");
	                    int choice1=scanner.nextInt();
	                    boolean turnOn = choice1 == 1;
	                    smartHome.controlDevice(controlID, turnOn);
	                    break;

	                case 3:
	                    smartHome.listAllDevices();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	    }
	}