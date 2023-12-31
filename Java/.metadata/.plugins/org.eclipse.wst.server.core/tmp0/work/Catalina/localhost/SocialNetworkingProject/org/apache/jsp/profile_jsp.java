/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2023-04-18 17:02:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>My Profile</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" ></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header div starts -->\r\n");
      out.write("        <div class=\"container-fluid bg-primary header_div\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-4\">\r\n");
      out.write("                        <a href=\"home.jsp\" class=\"navbar-brand text-light\">Social Network</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-5\">\r\n");
      out.write("                        <img src=\"images/male.png\" alt=\"\" class=\"img-fluid\" style=\"max-width: 50px\" />\r\n");
      out.write("                        <span class=\"text-light\"> ");
      out.print( session.getAttribute("session_name") );
      out.write(" </span>\r\n");
      out.write("                        &nbsp;&nbsp;\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info dropdown-toggle btn-sm\" data-bs-toggle=\"dropdown\"> More </button>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li> <a href=\"home.jsp\" class=\"dropdown-item\"> Home </a> </li>\r\n");
      out.write("                            <li> <a href=\"profile.jsp\" class=\"dropdown-item bg-secondary text-light\"> My Profile </a> </li>\r\n");
      out.write("                            <li> <a href=\"editProfile.jsp\" class=\"dropdown-item\"> Edit My profile </a> </li>\r\n");
      out.write("                            <li> <a href=\"logout\" class=\"dropdown-item\"> Logout </a> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- header div close -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\" style=\"padding: 40px\">\r\n");
      out.write("                    <!-- Sidebar div starts -->\r\n");
      out.write("                    <div class=\"col-3 shadow-sm p-3 mb-5 bg-body rounded\">\r\n");
      out.write("                        <nav id=\"sidebarMenu\" class=\"collapse d-lg-block sidebar collapse bg-white\">\r\n");
      out.write("                            <div class=\"position-sticky\">\r\n");
      out.write("                                <div class=\"list-group list-group-flush mx-3 mt-4\">\r\n");
      out.write("                                    <a href=\"home.jsp\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-newspaper\"></i> <span>News Feed</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-wechat\"></i> <span>Messanger</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-people\"></i> <span>Friend List</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-stopwatch\"></i> <span>Watch</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-shop\"></i> <span>Marketplace</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-calendar-event\"></i> <span>Events</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-file-earmark-break\"></i> <span>Page</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\r\n");
      out.write("                                        <i class=\"bi bi-collection\"></i> <span>Group</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Sidebar div ends -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-9\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-3\">\r\n");
      out.write("                                <img src=\"images/virat-kohli.jpg\" alt=\"\" style=\"max-width: 80%; border-radius: 10px; box-shadow: 0px 0px 5px #dddcdc; padding: 5px;\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-9\">\r\n");
      out.write("                                <a href=\"edit-my-profile.jsp\"><i class=\"bi bi-pencil-fill\" style=\"float: right\"></i></a>\r\n");
      out.write("                                <h4 class=\"text-primary\"> ");
      out.print( session.getAttribute("session_name") );
      out.write(" </h4> <br/>\r\n");
      out.write("                                <b> Email :</b> ");
      out.print( session.getAttribute("session_email") );
      out.write(" <br/>\r\n");
      out.write("                                <b> Gender :</b> ");
      out.print( session.getAttribute("session_gender") );
      out.write(" <br/>\r\n");
      out.write("                                <b> City :</b> ");
      out.print( session.getAttribute("session_city") );
      out.write(" <br/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12 p-3\">\r\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\r\n");
      out.write("                                    <h5> <i class=\"bi bi-postcard\"></i> Post Status </h5> <br/>\r\n");
      out.write("\r\n");
      out.write("                                    <textarea class=\"status_textarea_design\" placeholder=\"What are your thoughts\"></textarea> <br/> <br/>\r\n");
      out.write("                                    <input type=\"file\" class=\"form-control\" style=\"width: 50%\" />\r\n");
      out.write("                                    <input type=\"submit\" value=\"Post\" class=\"btn btn-primary post_btn\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\r\n");
      out.write("                                    <img src=\"images/profile_pic.png\" alt=\"\" style=\"max-width: 50px\" /> Deepak Panwar  <span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\r\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\r\n");
      out.write("                                        This is my new house, thank you <br/> <br/>\r\n");
      out.write("                                        <img src=\"images/house.jpg\" alt=\"\" style=\"max-width: 80%\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\r\n");
      out.write("                                    <img src=\"images/profile_pic.png\" alt=\"\" style=\"max-width: 50px\" /> Deepak Panwar  <span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\r\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\r\n");
      out.write("                                        Everyone needs a little push sometimes. Whether you're starting out on a new career path or need a burst of motivation, these inspiring words will remind you that success is possible. Plus, check out more powerful quotes that will get you in a positive mindset.  <br/> <br/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"shadow p-4 mb-5 bg-body rounded\">\r\n");
      out.write("                                    <img src=\"images/profile_pic.png\" alt=\"\" style=\"max-width: 50px\" /> Deepak Panwar  <span class=\"small text-secondary\" style=\"float: right\"> 1st January, 2023 [10:20pm] </span>\r\n");
      out.write("                                    <div class=\"row shadow-sm p-3 mb-5 bg-body rounded\">\r\n");
      out.write("                                        This is my new house, thank you <br/> <br/>\r\n");
      out.write("                                        <img src=\"images/house.jpg\" alt=\"\" style=\"max-width: 80%\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"\" style=\"float: right\"><i class=\"bi bi-trash3-fill\"></i></a> <br/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
