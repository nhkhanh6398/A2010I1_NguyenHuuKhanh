package controller;

import model.bean.*;
import model.service.contract.ContractService;
import model.service.contract.ContractServiceImpl;
import model.service.contract_detail.DetailService;
import model.service.contract_detail.DetailServiceImpl;
import model.service.customer.CustomerService;
import model.service.customer.CustomerServiceImpl;
import model.service.employee.EmployeeService;
import model.service.employee.EmployeeServiceImpl;
import model.service.service.ServiceService;
import model.service.service.ServiceServiceImpl;
import model.service.show_all.ShowAllService;
import model.service.show_all.ShowAllServiceImpl;

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
    private ServiceService serviceService = new ServiceServiceImpl();
    private ContractService contractService = new ContractServiceImpl();
    private DetailService detailService = new DetailServiceImpl();
    private ShowAllService showAllService = new ShowAllServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "createContractDetail":
                createContractDetail(request,response);
                break;
            case "create":
                create(request, response);
                break;
            case "edit":
                edit(request, response);
                break;

            case "createEmployee":
                createEmployee(request, response);
                break;
            case "createService":
                createService(request,response);
                break;
            case "editEmployee":
                editEmployee(request, response);
                break;
            case "searchCustomer":
                searchCustomer(request, response);
                break;
            case "searchEmployee":
                searchEmployee(request, response);
                break;
            case "searchService":
                searchService(request,response);
                break;
            case "editService":
                editService(request,response);
                break;
            case "createContract":
                createContract(request,response);
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
            case "showAll":
                fromshowAll(request,response);
                break;
            case "contractDetail":
                formContracDetail(request,response);
                break;
            case "createContractDetail":
                formCreateContractDetail(request,response);
                break;
            case "createContract":
                formCreateContract(request,response);
                break;
            case "create":
                formCreate(request, response);
                break;
            case "employee":
                employee(request, response);
                break;
            case "searchEmployee":
                FormSearchEmployee(request, response);
                break;
            case "searchCustomer":
                fromSearchCustomer(request, response);
                break;
            case "searchService":
                formSearchService(request,response);
                break;
            case "editService":
                formEditService(request,response);
                break;
            case "createEmployee":
                formCreateEmployee(request, response);
                break;
            case "createService":
                formCreateService(request,response);
                break;
            case "customer":
                customer(request, response);
                break;
            case "deleteService":
                deleteService(request,response);
                break;
            case "service":
                fromService(request, response);
                break;
            case "contract":
                formContract(request,response);
                break;
            case "editEmployee":
                formEditEmployee(request, response);
                break;
            case "edit":
                formEdit(request, response);
                break;
            case "deleteEmployee":
                deleteEmployee(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showHome(request, response);
                break;
        }

    }

    private void fromshowAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", showAllService.showAll());
        request.getRequestDispatcher("showAll.jsp").forward(request,response);
    }

    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idContract = Integer.parseInt(request.getParameter("contract"));
        int idService = Integer.parseInt(request.getParameter("service"));
        int quatily = Integer.parseInt(request.getParameter("quatily"));
        ContractDetail contractDetail = new ContractDetail(idContract,idService,quatily);
        detailService.save(contractDetail);
        request.setAttribute("msg", "Created!");
        request.setAttribute("list", detailService.showAll());
        request.getRequestDispatcher("contractDetail.jsp").forward(request,response);
    }
    private void formCreateContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("contractDetail.jsp").forward(request,response);
    }

    private void formContracDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", detailService.showAll());
        request.getRequestDispatcher("contractDetail.jsp").forward(request,response);
    }
    private void createContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Contract contract = null;
        String dayStart = request.getParameter("start");
        String dayEnd = request.getParameter("end");
        Double deposit = Double.parseDouble(request.getParameter("deposit"));
        Double total = Double.parseDouble(request.getParameter("total"));
        int customer = Integer.parseInt(request.getParameter("customer"));
        int employee = Integer.parseInt(request.getParameter("employee"));
        int service = Integer.parseInt(request.getParameter("service"));
        contract = new Contract(dayStart,dayEnd,deposit,total,customer,employee,service);
        contractService.save(contract);
        request.setAttribute("msg", "Created!");
        request.setAttribute("list", contractService.showAll());
        request.getRequestDispatcher("contract.jsp").forward(request,response);

    }

    private void formCreateContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("contract.jsp").forward(request,response);
    }

    private void formContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", contractService.showAll());
        request.getRequestDispatcher("contract.jsp").forward(request,response);
    }

    private void formEditService(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id =Integer.parseInt( request.getParameter("id"));
            request.setAttribute("showByIdService", serviceService.showByIdService(id));
            request.getRequestDispatcher("editService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }


    private void FormSearchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }
    private void formSearchService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }
    private void searchService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        serviceService.seacrhService(name);
        request.setAttribute("list", serviceService.seacrhService(name));
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }
    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        employeeService.seacrhCustomer(name);
        List<Employee> employeeList = employeeService.seacrhCustomer(name);
        request.setAttribute("list", employeeList);
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        customerService.seacrhCustomer(name);
        List<Customer> customerList = customerService.seacrhCustomer(name);
        request.setAttribute("list", customerList);
        request.getRequestDispatcher("customer.jsp").forward(request, response);

    }

    private void fromSearchCustomer(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void house(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("house.jsp").forward(request, response);
    }

    private void fromService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", serviceService.listAll());
        request.getRequestDispatcher("service.jsp").forward(request, response);
    }

    private void formEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("showByIdEmployee", employeeService.showByIdEmployee(id));
        request.getRequestDispatcher("editEmployee.jsp").forward(request, response);
    }

    private void formCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void employee(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("list", employeeService.showList());
            request.getRequestDispatcher("employee.jsp").forward(request, response);
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
        String cmnd = request.getParameter("cmnd");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, type, name, birthDay, gender, cmnd, phone, email, address);
        customerService.update(id, customer);
        try {
            request.setAttribute("msg", "Edited!");
            request.setAttribute("showById", customerService.showById(id));
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double area = Double.parseDouble(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int people = Integer.parseInt(request.getParameter("people"));
        String rent = request.getParameter("rent");
        Service service = new Service(name,area,cost,people,rent);
        serviceService.update(id,service);
        request.setAttribute("msg", "Edited!");
        request.setAttribute("showByIdService", serviceService.showByIdService(id));
        request.getRequestDispatcher("editService.jsp").forward(request,response);

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
        Employee employee = new Employee(name, birthday, cmnd, salary, phone, email, address, position, education, division);
        System.out.println(employeeService.update(id, employee));
        request.setAttribute("msg", "Edited!");
        request.setAttribute("showByIdEmployee", employeeService.showByIdEmployee(id));
        request.getRequestDispatcher("editEmployee.jsp").forward(request, response);
    }

    private void formEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            request.setAttribute("showById", customerService.showById(id));
            request.getRequestDispatcher("edit.jsp").forward(request, response);
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
        int id = Integer.parseInt(request.getParameter("idCustomer"));
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
    private void deleteService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idService"));
        serviceService.delete(id);
        request.setAttribute("list",serviceService.listAll());
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idEmployee"));
        employeeService.delete(id);
        request.setAttribute("list", employeeService.showList());
        try {
            request.getRequestDispatcher("employee.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        int type = Integer.parseInt(request.getParameter("type"));
        String name = request.getParameter("name");
        String cmnd = request.getParameter("cmnd");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        Customer customer = new Customer(type, name, birthday, gender, cmnd, phone, email, address);
        if (this.customerService.save(customer)){
        try {
            request.setAttribute("list",customerService.showList());
            request.setAttribute("msg", "Created!");
            request.getRequestDispatcher("customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        } else {
            request.setAttribute("msg", "No validate phone!");
            try {
                request.getRequestDispatcher("customer.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        Employee employee = new Employee(name, birthday, cmnd, salary, phone, email, address, position, education, division);
        employeeService.save(employee);
        request.setAttribute("list",employeeService.showList());
        request.setAttribute("msg", "Created!");
        request.getRequestDispatcher("employee.jsp").forward(request, response);

    }
    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int area = Integer.parseInt( request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int people = Integer.parseInt(request.getParameter("people"));
        String rent = request.getParameter("rent");
        Service service = new Service(name,area,cost,people,rent);
        System.out.println(serviceService.save(service));
        request.setAttribute("list", serviceService.listAll());
        request.setAttribute("msg", "Created!");
        request.getRequestDispatcher("service.jsp").forward(request,response);
    }
    private void formCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
//            request.setAttribute("listTypeCustomer", customerService.showTypeCustomer());
            request.getRequestDispatcher("customer.jsp").forward(request, response);
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
