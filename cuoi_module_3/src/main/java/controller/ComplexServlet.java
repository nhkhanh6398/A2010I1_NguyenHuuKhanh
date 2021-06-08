package controller;

import bean.TComplex;
import common.Validate;
import service.ModuleService;
import service.ModuleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ComplexServlet", urlPatterns = "")
public class ComplexServlet extends HttpServlet {
    private ModuleService moduleService = new ModuleServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = " ";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "search":
                search(request, response);
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
            case "delete":
                formDelete(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void formDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        moduleService.delete(id);
        List<TComplex> tComplexes = moduleService.showList();
        request.setAttribute("list", tComplexes);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("name");
        moduleService.seacrhCustomer(type);
        List<TComplex> tComplexes = moduleService.seacrhCustomer(type);
        request.setAttribute("list", tComplexes);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    private void formCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String messageId = Validate.validateId(id);
        int area = Integer.parseInt(request.getParameter("area"));
        String messageArea = Validate.validateArea(area);
        String status = request.getParameter("status");
        int floot = Integer.parseInt(request.getParameter("floot"));
        String type = request.getParameter("type");
        String mota = request.getParameter("mota");
        int rent = Integer.parseInt(request.getParameter("rent"));
        String messageRent = Validate.validateRent(rent);
        String dayStart = request.getParameter("start");
        String dayEnd = request.getParameter("end");
        TComplex tComplex = new TComplex(id, area, status, floot, type, mota, rent, dayStart, dayEnd);
        if (messageId == null && messageRent == null && messageArea == null) {
            moduleService.save(tComplex);
            request.setAttribute("list", moduleService.showList());
            request.setAttribute("msg", "Created");
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            request.setAttribute("id", id);
            request.setAttribute("messageId", messageId);
            request.setAttribute("area", area);
            request.setAttribute("messageArea", messageArea);
            request.setAttribute("floot", floot);
            request.setAttribute("status", status);
            request.setAttribute("type", type);
            request.setAttribute("mota", mota);
            request.setAttribute("rent", rent);
            request.setAttribute("messageRent", messageRent);
            request.setAttribute("dayStart", dayStart);
            request.setAttribute("dayEnd", dayEnd);
            request.getRequestDispatcher("create.jsp").forward(request, response);
        }

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", moduleService.showList());
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
