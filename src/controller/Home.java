package controller;

import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;

/**
 * Created by jihun on 2017. 1. 14..
 */
@WebServlet(name = "Home", urlPatterns = "/home")
public class Home extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        String page;

        if(action.equals("login"))
            page = "/view/loginform.jsp";
        else if(action.equals("register"))
            page = "/view/register.jsp";
        else
            page = "/view/error.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);

    }
}
