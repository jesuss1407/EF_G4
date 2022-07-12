package com.example.ef_g4.servlets;



import com.example.ef_g4.Beans.Empleado;
import com.example.ef_g4.Beans.Rol;
import com.example.ef_g4.Daos.UsuariosDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@WebServlet(name = "LoginServlet", value = "/loguin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String action = request.getParameter("action") != null ? request.getParameter("action") : "login";
        HttpSession session = request.getSession();
        switch (action){
            case "login":
                RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
                view.forward(request, response);
                break;
            case "logout":
                session.invalidate();
                response.sendRedirect(request.getContextPath());
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        UsuariosDao usuariosDao = new UsuariosDao();


        String dni= request.getParameter("dni");
        String contraseña = request.getParameter("password");


        Empleado usuario = usuariosDao.validarPass(contraseña,dni);
        Empleado usuario2=usuariosDao.añadirEmpleado(usuario);

        if(usuario2 !=null ){
            session.setAttribute("usuario",usuario2);

            session.setMaxInactiveInterval(5*60);
            session.setAttribute("dni",usuario2.getDni());

           ArrayList <Rol> arrayListRol=usuario.getRoles();
            int rol = arrayListRol.get(1).getIdRol();
            System.out.println(rol);

            //System.out.println(usuario.getRol());
            switch (rol){
                case 1->{
                    response.sendRedirect(request.getContextPath()+"/AdminServlet");
                }
                case 2->{
                    response.sendRedirect(request.getContextPath()+"/OperadorServlet");
                }
                case 3->{
                    response.sendRedirect(request.getContextPath()+"/inicio?action=registrado");
                }
            }

        }else{
            session.setAttribute("indicador","error");
            response.sendRedirect(request.getContextPath()+"/loguin");
        }


    }
}
