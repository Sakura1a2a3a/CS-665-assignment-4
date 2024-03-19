/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: UsbAdaptHttps.java
 * Description: adaptor implements UsbInterface and compose Https
 */

package edu.bu.met.cs665;

/**
 * This is the UsbAdaptHttps class.
 */
public class UsbAdaptHttps implements UsbInterface {

  private HttpsInterface httpsReader;

  /**
   * load Https reader.
   */
  public void setHttpsReader(HttpsInterface httpsReader) {
    this.httpsReader = httpsReader;
  }

  /**
   * return customers' information.
   */
  @Override
  public String readCustomerNameUsb(int id) {
    return httpsReader.readCustomerNameHttps(id);
  }
}
