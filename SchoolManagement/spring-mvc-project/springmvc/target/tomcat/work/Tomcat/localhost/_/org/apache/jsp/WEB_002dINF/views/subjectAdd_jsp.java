/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-01 06:33:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class subjectAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/navigation.jspf", Long.valueOf(1606804404568L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1605682054025L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1605682054026L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t\r\n");

	if(session.getAttribute("name") == null) {
		
	

      out.write("\r\n");
      out.write("\t\t<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"/index\" class=\"navbar-brand\" >codelifee</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/register\">become a student</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/login\">login</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
 } else if (session.getAttribute("name") != null) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"/index\" class=\"navbar-brand\" >codelifee</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/subjects\">My lessons</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/subjectAdd\">Find tutors</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/logout\">logout</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<section class=\"container\">\r\n");
      out.write("\t\t<form method=\"post\" action=\"/subjectAdd\" class=\"form-inline mt-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"name\" class=\"form-control mx-1 mx-2\" placeholder=\"please type your name\">\r\n");
      out.write("\t\t\t<select name=\"subjectDivide\" class=\"form-control mx-1 mt-2\">\r\n");
      out.write("\t\t\t\t<option value=\"history\">history</option>\r\n");
      out.write("\t\t\t\t<option value=\"Mathmatics\">Mathmatics</option>\r\n");
      out.write("\t\t\t\t<option value=\"English\">English</option>\r\n");
      out.write("\t\t\t\t<option value=\"Chemistry\">Chemistry</option>\r\n");
      out.write("\t\t\t\t<option value=\"ComputerScience\">ComputerScience</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary mx-1 mt-2\">add</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
