<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSAOPServiceProxyid" scope="session" class="com.services.SAOPServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSAOPServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSAOPServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSAOPServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.services.SAOPService getSAOPService10mtemp = sampleSAOPServiceProxyid.getSAOPService();
if(getSAOPService10mtemp == null){
%>
<%=getSAOPService10mtemp %>
<%
}else{
        if(getSAOPService10mtemp!= null){
        String tempreturnp11 = getSAOPService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String term_1id=  request.getParameter("term16");
        int term_1idTemp  = Integer.parseInt(term_1id);
        String rate_2id=  request.getParameter("rate18");
        int rate_2idTemp  = Integer.parseInt(rate_2id);
        String sumAssured_3id=  request.getParameter("sumAssured20");
        double sumAssured_3idTemp  = Double.parseDouble(sumAssured_3id);
        double calculate13mtemp = sampleSAOPServiceProxyid.calculate(term_1idTemp,rate_2idTemp,sumAssured_3idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calculate13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 22:
        gotMethod = true;
        String age_4id=  request.getParameter("age25");
        int age_4idTemp  = Integer.parseInt(age_4id);
        String term_of_Insurance_5id=  request.getParameter("term_of_Insurance27");
        int term_of_Insurance_5idTemp  = Integer.parseInt(term_of_Insurance_5id);
        String smokingHabit_6id=  request.getParameter("smokingHabit29");
            java.lang.String smokingHabit_6idTemp = null;
        if(!smokingHabit_6id.equals("")){
         smokingHabit_6idTemp  = smokingHabit_6id;
        }
        String accidentBenifit_7id=  request.getParameter("accidentBenifit31");
            java.lang.String accidentBenifit_7idTemp = null;
        if(!accidentBenifit_7id.equals("")){
         accidentBenifit_7idTemp  = accidentBenifit_7id;
        }
        String sumAssured_8id=  request.getParameter("sumAssured33");
        double sumAssured_8idTemp  = Double.parseDouble(sumAssured_8id);
        java.lang.String calculatePremium22mtemp = sampleSAOPServiceProxyid.calculatePremium(age_4idTemp,term_of_Insurance_5idTemp,smokingHabit_6idTemp,accidentBenifit_7idTemp,sumAssured_8idTemp);
if(calculatePremium22mtemp == null){
%>
<%=calculatePremium22mtemp %>
<%
}else{
        String tempResultreturnp23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calculatePremium22mtemp));
        %>
        <%= tempResultreturnp23 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>