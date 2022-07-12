package com.example.ef_g4.servlets;

import com.example.ef_g4.Daos.CarteleraDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartelerasServlet", value = "/CartelerasServlet")
public class CartelerasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String action = request.getParameter("a") == null ? "listar" : request.getParameter("a");
        CarteleraDao carteleraDao= new CarteleraDao();
        request.setAttribute("cartelera",carteleraDao.datosCartelera());
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("webapp/cartelera.jsp");
        requestDispatcher.forward(request,response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
