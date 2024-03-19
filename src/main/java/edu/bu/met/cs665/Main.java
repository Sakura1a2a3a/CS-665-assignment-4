/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: Main.java
 * Description: client class
 */

package edu.bu.met.cs665;


import java.util.HashMap;
import java.util.Map;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {

    Map<Integer, String> dataBase = new HashMap<>();
    dataBase.put(1, "Mike Brown");
    dataBase.put(2, "Jane Doe");

    UsbInterface usb = new UsbReader(dataBase);

    Computer computer = new Computer();

    computer.setUsbReader(usb);
    System.out.println(computer.readCustomerName(1));


    HttpsInterface https = new HttpsReader(dataBase);
    UsbAdaptHttps adaptor = new UsbAdaptHttps();
    adaptor.setHttpsReader(https);
    computer.setUsbReader(adaptor);
    System.out.println(computer.readCustomerName(1));


  }


}
