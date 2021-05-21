package controller;

import model.bean.User;
import model.responsitory.UserResponsitory;
import model.responsitory.UserResponsitoryImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "")
public class UserServlet extends HttpServlet {
private UserResponsitory userService = new UserResponsitoryImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                System.out.println("ok");
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "search":
                showSearch(request,response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                createForm(request,response);
                break;
            case "edit":
                editForm(request,response);
                showList(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "search":
                searchForm(request,response);
                break;
            default:
                showList(request,response);
                break;
        }
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("search.jsp").forward(request,response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        User user = new User(id,name,email,address);
        userService.update(id,user);
        try {
            request.setAttribute("msg","Edited!");
            response.sendRedirect("edit.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.delete(id);
        List<User> userList = userService.finAll();
        request.setAttribute("showList", userList);
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }
    private void showSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        userService.seachByName(name);
        List<User> userList = userService.seachByName(name);
        request.setAttribute("seacrh",userList);
        request.getRequestDispatcher("search.jsp").forward(request,response);
    }
    private void editForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.finById(id);
        try {
            request.setAttribute("findById",user);
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        User user = new User(name,email,address);
        userService.save(user);
        try {
            request.setAttribute("msg","Created!");
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showList",userService.finAll());
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
