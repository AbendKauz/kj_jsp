/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-12-12 05:59:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mvc.model.SelectDTO;
import java.util.*;

public final class select4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1670812340610L));
    _jspx_dependants.put("jar:file:/C:/jspstudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjectSelect/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mvc.model.SelectDTO");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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

	SelectDTO list = (SelectDTO)request.getAttribute("list");

	if(Integer.parseInt(list.getImg1()) < 10){
		list.setImg1("0" + list.getImg1());
	}
	if(Integer.parseInt(list.getImg2()) < 10){
		list.setImg2("0" + list.getImg2());
	}
	if(Integer.parseInt(list.getImg3()) < 10){
		list.setImg3("0" + list.getImg3());
	}
	if(Integer.parseInt(list.getImg4()) < 10){
		list.setImg4("0" + list.getImg4());
	}
	if(Integer.parseInt(list.getImg5()) < 10){
		list.setImg5("0" + list.getImg5());
	}
	if(Integer.parseInt(list.getImg6()) < 10){
		list.setImg6("0" + list.getImg6());
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>4</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	function clickTest(num) { \r\n");
      out.write("		console.log(num.value);\r\n");
      out.write("		frm.no4.value = num.value;\r\n");
      out.write("		frm.submit();\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form name=\"frm\" action=\"/select5.do\" method=\"post\">\r\n");
      out.write("	<input type=\"hidden\" id=\"no1\" name=\"no1\" value=\"");
      out.print( request.getParameter("no1") );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("	<input type=\"hidden\" id=\"no2\" name=\"no2\" value=\"");
      out.print( request.getParameter("no2") );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("	<input type=\"hidden\" id=\"no3\" name=\"no3\" value=\"");
      out.print( request.getParameter("no3") );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("	<input type=\"hidden\" id=\"no4\" name=\"no4\" value=\"\">\r\n");
      out.write("		<table>	\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg1());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg1() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg2());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg2() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg3());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg3() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg4());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg4() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg5());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg5() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("				<td><button type=\"button\" class=\"btn\" onclick=\"clickTest(this)\" value=\"");
      out.print( list.getImg6());
      out.write("\"><img src=\"../resources/images/");
      out.print( list.getImg6() );
      out.write(".jpg\"></button></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
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
