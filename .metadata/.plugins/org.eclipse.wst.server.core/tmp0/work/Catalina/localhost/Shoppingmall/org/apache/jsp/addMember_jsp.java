/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-12-22 09:46:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1667368432984L));
    _jspx_dependants.put("jar:file:/C:/jspstudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shoppingmall/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/css/bootstrap.min.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function checkForm(){\r\n");
      out.write("		if(!document.newMember.id.value){\r\n");
      out.write("			alert(\"아이디를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}else if(!document.newMember.password.value){\r\n");
      out.write("			alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}else if(document.newMember.password.value != document.newMember.password_confirm.value){\r\n");
      out.write("			alert(\"비밀번호를 동일하게 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}else if(!document.newMember.name.value){\r\n");
      out.write("			alert(\"이름을 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"jumbotron\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h1 class=\"display-3\">회원가입</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<form name=\"newMember\" action=\"processAddMember.jsp\" class=\"form-horizontal\" method=\"post\" onsubmit=\"return checkForm()\">\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">아이디</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"id\" class=\"form-control\" placeholder=\"id\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">비밀번호</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"password\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">비밀번호 확인</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"password\" name=\"password_confirm\" class=\"form-control\" placeholder=\"password_confirm\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">성명</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"name\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">성별</label>\r\n");
      out.write("				<div class=\"col-sm-10\">\r\n");
      out.write("					<input type=\"radio\" name=\"gender\" value=\"남\"/> 남 \r\n");
      out.write("					<input type=\"radio\" name=\"gender\" value=\"여\"/> 여 \r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">생일</label>\r\n");
      out.write("				<div class=\"col-sm-4\">\r\n");
      out.write("					<input type=\"text\" name=\"birthyy\" maxlength=\"4\" placeholder=\"년도(4자)\" size=\"6\"/>\r\n");
      out.write("					<select name=\"birthmm\">\r\n");
      out.write("						<option value=\"\" selected disabled>월</option>\r\n");
      out.write("						<option value=\"01\">1</option>\r\n");
      out.write("						<option value=\"02\">2</option>\r\n");
      out.write("						<option value=\"03\">3</option>\r\n");
      out.write("						<option value=\"04\">4</option>\r\n");
      out.write("						<option value=\"05\">5</option>\r\n");
      out.write("						<option value=\"06\">6</option>\r\n");
      out.write("						<option value=\"07\">7</option>\r\n");
      out.write("						<option value=\"08\">8</option>\r\n");
      out.write("						<option value=\"09\">9</option>\r\n");
      out.write("						<option value=\"10\">10</option>\r\n");
      out.write("						<option value=\"11\">11</option>\r\n");
      out.write("						<option value=\"12\">12</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					<input type=\"text\" name=\"birthdd\" maxlength=\"2\" placeholder=\"일\" size=\"4\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">이메일</label>\r\n");
      out.write("				<div class=\"col-sm-10\">\r\n");
      out.write("					<input type=\"text\" name=\"mail1\" maxlength=\"50\"/>@\r\n");
      out.write("					<select name=\"mail2\">\r\n");
      out.write("						<option>gmail.com</option>\r\n");
      out.write("						<option>naver.com</option>\r\n");
      out.write("						<option>daum.net</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">전화번호</label>\r\n");
      out.write("				<div class=\"col-sm-3\">\r\n");
      out.write("					<input type=\"text\" name=\"phone\" class=\"form-control\" placeholder=\"phone\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<label class=\"col-sm-2\">주소</label>\r\n");
      out.write("				<div class=\"col-sm-5\">\r\n");
      out.write("					<input type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"address\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group row\">\r\n");
      out.write("				<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("					<input type=\"submit\" class=\"btn btn-primary\" value=\"등록\">\r\n");
      out.write("					<input type=\"reset\" class=\"btn btn-primary\" value=\"취소\" onclick=\"return reset()\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>			\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	<hr>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
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
