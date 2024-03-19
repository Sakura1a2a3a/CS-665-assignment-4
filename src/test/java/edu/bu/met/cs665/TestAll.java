package edu.bu.met.cs665;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestAll {

  public Map<Integer, String> dataBase;

  public TestAll() {

    dataBase = new HashMap<>();
    dataBase.put(1, "Mike Brown");
    dataBase.put(2, "Jane Doe");
  }

  @Test
  public void testNameUsb1() {

    UsbInterface usb = new UsbReader(dataBase);
    Computer computer = new Computer();
    computer.setUsbReader(usb);
    assertEquals("Mike Brown", computer.readCustomerName(1));

  }

  @Test
  public void testNameUsb2() {

    UsbInterface usb = new UsbReader(dataBase);
    Computer computer = new Computer();
    computer.setUsbReader(usb);
    assertEquals("Jane Doe", computer.readCustomerName(2));

  }

  @Test
  public void testNameAdaptor1() {

    Computer computer = new Computer();
    HttpsInterface https = new HttpsReader(dataBase);
    UsbAdaptHttps adaptor = new UsbAdaptHttps();
    adaptor.setHttpsReader(https);
    computer.setUsbReader(adaptor);
    assertEquals("Mike Brown", computer.readCustomerName(1));

  }

  @Test
  public void testNameAdaptor2() {

    Computer computer = new Computer();
    HttpsInterface https = new HttpsReader(dataBase);
    UsbAdaptHttps adaptor = new UsbAdaptHttps();
    adaptor.setHttpsReader(https);
    computer.setUsbReader(adaptor);
    assertEquals("Jane Doe", computer.readCustomerName(2));

  }






}
