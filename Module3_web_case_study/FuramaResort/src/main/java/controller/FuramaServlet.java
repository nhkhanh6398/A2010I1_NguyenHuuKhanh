package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.service.customer.CustomerService;
import model.service.customer.CustomerServiceImpl;
import model.service.employee.EmployeeService;
import model.service.employee.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FuramaServlet", urlPatterns = "")
public class FuramaServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    private EmployeeService employeeService = new EmployeeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "createEmployee":
                createEmployee(request,response);
                break;
            case "editEmployee":
                editEmployee(request,response);
                break;
            default:
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = " ";
        }
        switch (action) {
            case "create":
                formCreate(request, response);
                break;
            case "employee":
                employee(request,response);
                break;
            case "createEmployee":
                formCreateEmployee(request,response);
                break;
            case "customer":
                customer(request, response);
                break;
            case "service":
                break;
            case "contract":
                break;
            case "editEmployee":
                formEditEmployee(request,response);
                break;
            case "edit":
                formEdit(request,response);
                break;
            case "deleteEmployee":
                deleteEmployee(request,response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showHome(request, response);
                break;
        }

    }



    private void formEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("showByIdEmployee", employeeService.showByIdEmployee(id));
        request.getRequestDispatcher("editEmployee.jsp").forward(request,response);
    }

    private void formCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createEmployee.jsp").forward(request,response);
    }

    private void employee(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("list", employeeService.showList());
            request.getRequestDispatcher("employee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int type = Integer.parseInt(request.getParameter("type"));
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email =request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,type,name,birthDay,gender,cmnd,phone,email,address);
        customerService.update(id,customer);
        try {
            request.setAttribute("msg", "Edited!");
            request.setAttribute("showById",customerService.showById(id));
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        double salary = Double.parseDouble(request.getParameter("salary"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int education = Integer.parseInt(request.getParameter("education"));
        int position = Integer.parseInt(request.getParameter("position"));
        int division = Integer.parseInt(request.getParameter("division"));
        Employee employee = new Employee(name,birthday,cmnd,salary,phone,email,address,position,education,division);
        System.out.println(employeeService.update(id,employee));
        request.setAttribute("msg", "Edited!");
        request.setAttribute("showByIdEmployee", employeeService.showByIdEmployee(id));
        request.getRequestDispatcher("editEmployee.jsp").forward(request,response);
    }
    private void formEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            request.setAttribute("showById", customerService.showById(id));
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void customer(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("list", customerService.showList());
            request.getRequestDispatcher("customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);
        List<Customer> customerList = customerService.showList();
        request.setAttribute("list", customerList);
        try {
            request.getRequestDispatcher("customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(id);
        request.setAttribute("list", employeeService.showList());
        try {
            request.getRequestDispatcher("employee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        int type = Integer.parseInt(request.getParameter("type"));
        String name = request.getParameter("name");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));
        Customer customer = new Customer(type, name, birthday, gender, cmnd, phone, email, address);
        customerService.save(customer);
        try {
            request.setAttribute("msg", "Created!");
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        double salary = Integer.parseInt(request.getParameter("salary"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int education = Integer.parseInt(request.getParameter("education"));
        int division = Integer.parseInt(request.getParameter("division"));
        Employee employee = new Employee(name,birthday,cmnd,salary,phone,email,address,position,education,division);
        employeeService.save(employee);
        request.setAttribute("msg","Created!");
        request.getRequestDispatcher("createEmployee.jsp").forward(request,response);

    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
//            request.setAttribute("listTypeCustomer", customerService.showTypeCustomer());
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("list", customerService.showList());
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
