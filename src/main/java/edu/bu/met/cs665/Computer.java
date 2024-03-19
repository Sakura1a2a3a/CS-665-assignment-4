/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: Computer.java
 * Description: simulate a computer with only usb interface
 */

package edu.bu.met.cs665;

/**
 * This is the Computer class.
 */

public class Computer {

  private UsbInterface usbReader;

  /**
   * This loads an usb.
   */
  public void setUsbReader(UsbInterface usbReader) {
    this.usbReader = usbReader;
  }

  /**
   * This return customers' information.
   */
  public String readCustomerName(int id) {
    return usbReader.readCustomerNameUsb(id);
  }

}
