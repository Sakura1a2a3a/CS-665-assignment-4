/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: UsbReader.java
 * Description: discrete Usb class
 */

package edu.bu.met.cs665;

import java.util.Map;

/**
 * This is UsbReader class.
 */
public class UsbReader implements UsbInterface {

  private Map<Integer, String> database;

  /**
   * This is constructor.
   */
  public UsbReader(Map<Integer, String> database) {
    this.database = database;
  }

  /**
   * This implements read information method.
   */
  @Override
  public String readCustomerNameUsb(int id) {
    System.out.println("read from Usb interface!");
    return database.get(id);
  }

}
