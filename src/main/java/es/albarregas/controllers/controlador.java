/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.Atributos;
import es.albarregas.models.Divisor;
import es.albarregas.models.Multiplicador;
import es.albarregas.models.Restador;
import es.albarregas.models.Sumador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fjvaz
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

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
            out.println("<title>Servlet controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
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
        request.setAttribute("error", "Se esta intentando acceder directamente");
        request.getRequestDispatcher("JSP/error.jsp").forward(request,response);
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
        String url=null;
        String operacion=request.getParameter("calculo");
        Atributos misAtributos=new Atributos();
        try{
            double operando1=Integer.parseInt(request.getParameter("operando1"));
            double operando2=Integer.parseInt(request.getParameter("operando2"));
            misAtributos.setOperando1(operando1);
            misAtributos.setOperando2(operando2);
            switch(operacion){
                case "suma":
                    Sumador miSuma=new Sumador();
                    misAtributos.setResultado(miSuma.sumar(operando1, operando2));
                    url="JSP/resultado.jsp";
                    break;
                case "resta":
                    Restador miResta=new Restador();
                    misAtributos.setResultado(miResta.restar(operando1, operando2));
                    url="JSP/resultado.jsp";
                    break;
                case "multiplicacion":
                    Multiplicador miMulti=new Multiplicador();
                    misAtributos.setResultado(miMulti.multiplicar(operando1, operando2));
                    url="JSP/resultado.jsp";
                    break;
                case "division":
                    if (operando2==0){
                        url="JSP/error.jsp";
                        request.setAttribute("error", "Se esta intentando dividir por 0");
                    }else{
                        Divisor miDivisor=new Divisor();
                        misAtributos.setResultado(miDivisor.dividir(operando1, operando2));
                        url="JSP/resultado.jsp";
                    }
                    break;
            }
            
        request.setAttribute("resultado", misAtributos.getResultado());
        }catch(NumberFormatException excepcion){
            url="JSP/error.jsp";
            request.setAttribute("error", "Se han introducido valores no válidos, se deben introducir valores numericos");
        }
        
        request.getRequestDispatcher(url).forward(request,response);
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
