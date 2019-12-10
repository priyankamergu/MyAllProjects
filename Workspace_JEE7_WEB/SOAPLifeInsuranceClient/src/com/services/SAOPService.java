/**
 * SAOPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.services;

public interface SAOPService extends java.rmi.Remote {
    public double calculate(int term, int rate, double sumAssured) throws java.rmi.RemoteException;
    public java.lang.String calculatePremium(int age, int term_of_Insurance, java.lang.String smokingHabit, java.lang.String accidentBenifit, double sumAssured) throws java.rmi.RemoteException;
}
