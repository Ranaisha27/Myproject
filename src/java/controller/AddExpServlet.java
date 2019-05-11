
package controller;

import Model.Account;
import Model.AccountsDAO;
import Model.Expanse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddExpServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int credit , debit , accNo;
            String date , desc;
            debit = Integer.parseInt(request.getParameter("debit"));
            credit = Integer.parseInt(request.getParameter("credit"));
            accNo = Integer.parseInt(request.getParameter("accNo"));
            date = request.getParameter("date");
            desc = request.getParameter("desc");
            
            Expanse ex = new Expanse();
            Account acc = new Account();
            
            ex.setAccno(accNo);
            ex.setCredit(credit);
            ex.setDate(date);
            ex.setDebit(debit);
            ex.setDescription(desc);
            
            AccountsDAO ad = new AccountsDAO();
            ad.AddExp(ex , accNo);
            response.sendRedirect("DashBoard.html");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
