/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2023-04-18 17:23:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/login.jsp", Long.valueOf(1681638493806L));
    _jspx_dependants.put("/register.jsp", Long.valueOf(1681838605618L));
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Social Network</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid bg-primary header_div\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-4\">\r\n");
      out.write("                        <a href=\"index.jsp\" class=\"navbar-brand text-light\">Social Network</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-2\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-6\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"login\" method=\"post\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Email\" class=\"textfield_design\" name=\"email1\" />\r\n");
      out.write("            <input type=\"password\" placeholder=\"Enter password\" class=\"textfield_design\" name=\"pass1\" />\r\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"btn btn-warning\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-fluid bg-light body_div\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-6\" style=\"text-align: center; padding-top: 40px; padding-bottom: 40px\">\r\n");
      out.write("                    <img src=\"images/social_network.png\" alt=\"\" class=\"img-fluid\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-6\" style=\"text-align: center; padding-top: 40px; padding-bottom: 40px\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script>\r\n");
      out.write("            function regValidation()\r\n");
      out.write("            {\r\n");
      out.write("                var user_name = document.regform.name1.value;\r\n");
      out.write("                var user_email = document.regform.email1.value;\r\n");
      out.write("                var user_pass = document.regform.pass1.value;\r\n");
      out.write("                var user_gender = document.regform.gender1.value;\r\n");
      out.write("                var user_city = document.regform.city1.value;\r\n");
      out.write("                \r\n");
      out.write("                var name_pattern = /^[a-zA-Z ]{3,30}$/;\r\n");
      out.write("                var email_pattern = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\r\n");
      out.write("                var pass_pattern = /^[a-zA-Z0-9@]{5,30}$/;\r\n");
      out.write("                \r\n");
      out.write("                if(!user_name.match(name_pattern))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Not a valid name\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!user_email.match(email_pattern))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Not a valid email\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!user_pass.match(pass_pattern))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Not a valid password\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(user_gender===\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Select any one gender\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(user_city===\"Select City\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Select any one city\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else\r\n");
      out.write("                {\r\n");
      out.write("                    document.regform.action=\"Register\";\r\n");
      out.write("                    document.regform.submit();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <h3> Register Here </h3> <br/>\r\n");
      out.write("        <form method=\"post\" name=\"regform\" onsubmit=\"return regValidation()\">\r\n");
      out.write("            <input type=\"text\" name=\"name1\" placeholder=\"Enter Name\" class=\"reg_textfield_design\" /> <br/> <br/>\r\n");
      out.write("            <input type=\"email\" name=\"email1\" placeholder=\"Enter Email\" class=\"reg_textfield_design\" /> <br/> <br/>\r\n");
      out.write("            <input type=\"password\" name=\"pass1\" placeholder=\"Enter Password\" class=\"reg_textfield_design\" /> <br/> <br/>\r\n");
      out.write("            <input type=\"radio\" name=\"gender1\" value=\"Male\" /> Male &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"radio\" name=\"gender1\" value=\"Female\" /> Female <br/> <br/>\r\n");
      out.write("            <select name=\"city1\" class=\"reg_textfield_design\">\r\n");
      out.write("                <option> Select City </option>\r\n");
      out.write("                <option> Chandigarh </option>\r\n");
      out.write("                <option> Delhi </option>\r\n");
      out.write("                <option> Pune </option>\r\n");
      out.write("                <option> Mumbai </option>\r\n");
      out.write("                <option> Banglore </option>\r\n");
      out.write("            </select> <br/> <br/>\r\n");
      out.write("            <input type=\"submit\" value=\"Register\" class=\"btn btn-primary\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bg-dark\" style=\"padding: 40px\">\r\n");
      out.write("            footer\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
