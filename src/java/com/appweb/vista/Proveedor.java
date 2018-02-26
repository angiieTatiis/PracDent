/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appweb.vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Proveedor", urlPatterns = {"/Proveedor"})
public class Proveedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloProveedor.css\">"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<form method=\"POST\">");
            out.println("<div id=\"contenidoProveedor\">");
            out.println("<div>");
            out.println("<label for=\"nombre\">Nombre *: </label>");
            out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"nit\">Nit *: </label>");
            out.println("<input type=\"text\" id=\"nit\" name=\"nit\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"direccion\">Direccion *: </label>");
            out.println("<input type=\"text\" id=\"direccion\" name=\"direccion\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"correo\">Correo *: </label>");
            out.println("<input type=\"text\" id=\"correo\" name=\"correo\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"telefono\">Telefono *: </label>");
            out.println("<input type=\"text\" id=\"telefono\" name=\"telefono\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<input class=\"button\" type=\"submit\" id=\"btnGuardar\" value=\"Guardar\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"campos\">Los campos marcados (*) son obligatorios </label>");
            out.println("</div>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
