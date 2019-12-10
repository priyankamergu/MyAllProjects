package com.services;

public class SAOPServiceProxy implements com.services.SAOPService {
  private String _endpoint = null;
  private com.services.SAOPService sAOPService = null;
  
  public SAOPServiceProxy() {
    _initSAOPServiceProxy();
  }
  
  public SAOPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSAOPServiceProxy();
  }
  
  private void _initSAOPServiceProxy() {
    try {
      sAOPService = (new com.services.SAOPServiceServiceLocator()).getSAOPService();
      if (sAOPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sAOPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sAOPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sAOPService != null)
      ((javax.xml.rpc.Stub)sAOPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.services.SAOPService getSAOPService() {
    if (sAOPService == null)
      _initSAOPServiceProxy();
    return sAOPService;
  }
  
  public double calculate(int term, int rate, double sumAssured) throws java.rmi.RemoteException{
    if (sAOPService == null)
      _initSAOPServiceProxy();
    return sAOPService.calculate(term, rate, sumAssured);
  }
  
  public java.lang.String calculatePremium(int age, int term_of_Insurance, java.lang.String smokingHabit, java.lang.String accidentBenifit, double sumAssured) throws java.rmi.RemoteException{
    if (sAOPService == null)
      _initSAOPServiceProxy();
    return sAOPService.calculatePremium(age, term_of_Insurance, smokingHabit, accidentBenifit, sumAssured);
  }
  
  
}