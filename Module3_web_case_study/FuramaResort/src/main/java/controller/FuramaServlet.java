package controller;

import model.bean.Customer;
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
        String action = request.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            default:
                break;
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action=" ";
        }
        switch (action){
            case "create":
                formCreate(request,response);
                break;
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
    private void create(HttpServletRequest request, HttpServletResponse response) {
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));
        Customer customer = new Customer(name,birthday,gender,cmnd,phone,email,address,type);
        customerService.save(customer);
        try {
            request.setAttribute("msg","Created!");
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("listTypeCustomer", customerService.showTypeCustomer());
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
