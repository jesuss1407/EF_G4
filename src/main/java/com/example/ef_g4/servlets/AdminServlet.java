package com.example.ef_g4.servlets;

import com.example.ef_g4.Beans.Empleado;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Empleado usuario = (Empleado) request.getSession().getAttribute("usuarioLogueado");

        String action = request.getParameter("admin") == null? "registros" : request.getParameter("admin");
        //System.out.println(usuarioLogueado.getRol());
        //if (Objects.equals(usuarioLogueado.getRol(), "admin")){
            switch(action) {
                case "registros":
                    //ArrayList<BSedeYSala> listaSedes = AdminDao.obtenerSedes();
                    //request.setAttribute("listaSedes",listaSedes);
                    RequestDispatcher rd1 = request.getRequestDispatcher("/admin.jsp");
                    rd1.forward(request, response);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
