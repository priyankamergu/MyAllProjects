/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-09 12:33:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HRAssessment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/Software/Workspace_JEE7_WEB/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineInterviewProcessProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/D:/Software/Workspace_JEE7_WEB/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineInterviewProcessProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1575527887213L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>HR Assessment Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"TechnicalOneController?action=insertHrRound\"\r\n");
      out.write("\t\tmethod=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<font color=\"darkblue\">HR Assessment</font>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<!-- border=\"2\" -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Enter HR Id\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label><input type=\"text\" name=\"hrId\" /></label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical Two by Employee Id\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label><input type=\"text\" name=\"employeeIdTwo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalTwo.employeeId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b> Technical Two by Employee Name\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"employeeNameTwo\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalTwoEmployeeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical Two Review\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalTwo.review}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical Two Remarks\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalTwo.remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical One by Employee Id\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"employeeIdRoundOne\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalOne.employeeId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b> Technical One by Employee Name\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"employeeNameOne\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalOneEmployeeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical One Review\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalOne.review}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Technical One Remarks\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalOne.remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Candidate Id\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"candidateId\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Candidate Name\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"candidateName\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Aptitude Marks\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label><input type=\"text\" name=\"candidateMarks\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateMarks}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>HR Review\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"review\" value=\"Excellent\">Excellent</input></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"review\" value=\"Good\">Good</input></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"review\" value=\"Average\">Average</input></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"review\" value=\"Poor\">Poor</input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>HR Remarks</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"4\"><input type=\"text\" name=\"remarks\" size=\"35\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- rows=\"3\" cols=\"20\" --></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>Status</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"status\" value=\"pass\">Pass</input></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"status\" value=\"fail\">Fail</input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<!-- sending technical one id -->\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"technicalTwoId\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${technicalTwo.techincalTwoId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> <br> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" name=\"submit\" value=\"Submit\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
