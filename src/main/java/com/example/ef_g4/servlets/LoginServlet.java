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


        String codigo= request.getParameter("codigo");
        String contraseña = request.getParameter("password");
        //System.out.println(codigo+contraseña);

        Empleado usuario = usuariosDao.validarPass(contraseña,codigo);

        if(usuario !=null && !Objects.equals(, "")){
            session.setAttribute("usuario",usuario);
            //System.out.println(session.getAttribute("usuario")+"xdsesion");

            session.setMaxInactiveInterval(5*60);
            session.setAttribute("codigo_pucp",codigo);

            session.setAttribute("usuarioLogueado", usuario);


            ArrayList<Rol> rol=usuario.getRoles();
            //System.out.println(usuario.getRol());
            switch (rol){
                case "admin"->{
                    response.sendRedirect(request.getContextPath()+"/AdminServlet");
                }
                case "operador"->{
                    response.sendRedirect(request.getContextPath()+"/OperadorServlet");
                }
                case "cliente"->{
                    response.sendRedirect(request.getContextPath()+"/inicio?action=registrado");
                }
            }

        }else{
            session.setAttribute("indicador","error");
            response.sendRedirect(request.getContextPath()+"/loguin");
        }


    }
}
