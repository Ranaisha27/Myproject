package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.Expanse;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Display</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"DashStyle.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"bg-light p-0\">\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-light mt-5 mb-3\" style=\"height: 50px;\">\r\n");
      out.write("            <i class=\"fas fa-coins fa-2x mx-2\"></i>\r\n");
      out.write("            <div class=\"navbar-brand\" style=\"font-size: 25px;\">E-Z Money</div>\r\n");
      out.write("            <div class=\"container ml-5 brand-text\">Expenditure Management System</div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <button class=\"btn btn-outline-danger btn-text\">Logout</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row p-4\">\r\n");
      out.write("            <div class=\"clo-3 bg-dark\" style=\"height:500px; width: 300px;\">\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"container \" style=\"margin-top:100px;\">\r\n");
      out.write("                    <a href=\"DashBoard.html\" class=\"h1 text-light option-text\" style=\"cursor:pointer;\">Dashboard</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\" style=\"margin-top:70px;\">\r\n");
      out.write("                    <a href=\"AddAcc.html\" class=\"h1 text-light option-text\" style=\"cursor:pointer;\">Add account details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container \" style=\"margin-top:100px;\">\r\n");
      out.write("                    <a href=\"Addexp.html\" class=\"h1 text-light option-text\" style=\"cursor:pointer;\">Add Expanse</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            ");
 
                
                                        String desc , date;
                                        int debit , credit ;
                                        long accNo , currBal;
                                        
                                        accNo = (long)request.getAttribute("accno");
                                        System.out.println("JSP:");
                                        System.out.println(accNo);
                                        Configuration cf = null;
                                        SessionFactory sf = null;
                                        Session s = null;
                                        Expanse ex = null;
                                        Expanse ex1 = null;
                                        try{
                                            cf = new Configuration();
                                            cf.configure();
                                            sf = cf.buildSessionFactory();
                                            s = sf.openSession();
                                            Query q = s.createQuery("from Account where AccNo = :accno");
                                            q.setLong("accno", accNo);
                                            Iterator it = q.iterate();
                                            ex = (Expanse)it.next();
                                            currBal = ex.getCurrBal();
                                            
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col img-col ml-4\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col text-center text-white\">\r\n");
      out.write("                        <div class=\"h5\">Account Number : ");
      out.print(accNo);
      out.write("</div>\r\n");
      out.write("                        <div class=\"h5\">Current Balance : ");
      out.print(currBal);
      out.write("</div>\r\n");
      out.write("                        <table class=\"table stripped-table\">\r\n");
      out.write("                            <thead class=\"h4 text-warning\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <th>Description</th>\r\n");
      out.write("                                    <th>Debit</th>\r\n");
      out.write("                                    <th>Credit</th>\r\n");
      out.write("                                    <th>Date</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                \r\n");
      out.write("                            </thead>   \r\n");
      out.write("                                    \r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                \r\n");
      out.write("                                ");

                                    
                                    
                                    while (it.hasNext()){

                                        
                                        desc = ex.getDescription();
                                        date = ex.getDate();
                                        debit = ex.getDebit();
                                        credit = ex.getCredit();
                                
                                
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                            \r\n");
      out.write("                                    \r\n");
      out.write("                                <tr>\r\n");
      out.write("                                                <td>");
      out.print(desc);
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(debit);
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(credit);
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(date);
      out.write("</td>\r\n");
      out.write("                    \r\n");
      out.write("                                </tr>\r\n");
      out.write("                                            \r\n");
      out.write("                                    ");

                                                }
                                        }catch(Exception e){
                                            e.printStackTrace();
                                        }
                                        
                                    
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
