/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/18/2024
 * File Name: HttpsReader.java
 * Description: discrete Https class
 */

package edu.bu.met.cs665;

import java.util.Map;

/**
 * This is HttpsReader class.
 */

public class HttpsReader implements HttpsInterface {

  private Map<Integer, String> database;

  /**
   * This is constructor.
   */
  public HttpsReader(Map<Integer, String> database) {
    this.database = database;
  }

  /**
   * This implements read information method.
   */
  @Override
  public String readCustomerNameHttps(int id) {
    System.out.println("read from Https interface!");
    return database.get(id);
  }
}
