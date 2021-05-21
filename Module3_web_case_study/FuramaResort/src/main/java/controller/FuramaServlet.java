package controller;

import model.service.CustomerService;
import model.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FuramaServlet", urlPatterns = "")
public class FuramaServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action=" ";
        }
        switch (action){
            case "employee":
                break;
            case "customer":
                break;
            case "service":
                break;
            case "contract":
                break;
            default:
                showHome(request,response);
                break;
        }

    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("list",customerService.showList());
            request.getRequestDispatcher("home.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
