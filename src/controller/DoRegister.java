package controller;

import com.sun.org.apache.regexp.internal.RE;
import model.Customer;
import service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jihun on 2017. 1. 14..
 */
@WebServlet(name = "DoRegister", urlPatterns = "/doRegister")
public class DoRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");

        Customer customer = new Customer(id, password, name, gender, email);
        CustomerService service = CustomerService.getInstance();
        service.registerCustomer(customer);
        request.setAttribute("customer", customer);

        String page;
        page = "/view/registerSuccess.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
