/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.roles;
import DAO.userRoles;
import DAO.users;
import MODEL.Roles;
import interfacesDAO.Iusers;
import MODEL.Users;
import MODEL.usersRoles;
import interfacesDAO.IUsersRoles;
import interfacesDAO.Iroles;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author castañosinning
 */
public class Controller extends HttpServlet {
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

        String accion = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1);
        if (accion.equals("auto.do")) {
            auten(request, response);
        }
        if (accion.equals("registar.do")) {
            registarUsers(request, response);
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

    public void auten(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String Pass = request.getParameter("password");
        String nom = request.getParameter("usuario");
        //     PrintWriter out = response.getWriter();
        Users U = new Users(nom, Pass);
        Iusers DAOU = new users();
        if(DAOU.validarInicioSeccion(U) == true){
            response.sendRedirect("codigo.jsp");
        }else{
            response.sendRedirect("index.html");
        }
    }
    public void registarUsers(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String passUser = request.getParameter("pass");
        String nombreUSer = request.getParameter("nombre");
        String rolUser = request.getParameter("rol");
        //PrintWriter out = response.getWriter();
         Users U = new Users(nombreUSer, passUser);
         Roles R = new Roles(rolUser);
         usersRoles UR = new usersRoles(nombreUSer);
         Iusers DAOU = new users();
         Iroles DAOR = new roles();
         IUsersRoles DAOUR = new userRoles();
         if(DAOU.registrar(U)==true && DAOR.registrar(R)==true && DAOUR.registrar(UR)==true)
         {
             System.out.println("true");
         }else{
             System.err.println("flase");
         }
             
        
    }
}
