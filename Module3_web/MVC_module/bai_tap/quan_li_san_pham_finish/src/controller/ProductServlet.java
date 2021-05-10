package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product", "/"})
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

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
                edit(request, response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteForm(request, response);
                break;
            case "view":
                view(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findId(id);
        if (product == null) {
            request.getRequestDispatcher("404-eror.jsp").forward(request, response);
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("view.jsp").forward(request, response);
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = this.productService.findAll();
        request.setAttribute("list", productList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int cost = Integer.parseInt(request.getParameter("cost"));
        int id = (int) (Math.random() * 1000);

        Product product = new Product(id, name, cost);
        this.productService.save(product);
        request.setAttribute("msg", "New Product was created");
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findId(id);
        if (product == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int cost = Integer.parseInt(request.getParameter("cost"));
        Product product = this.productService.findId(id);
        if (product == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            product.setName(name);
            product.setCost(cost);
            this.productService.update(id, product);
            request.setAttribute("product", product);
            request.setAttribute("msg", "Product was update");
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt( request.getParameter("id"));
        Product product = this.productService.findId(id);
        if (product==null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        }else {

            this.productService.delete(id);
            request.setAttribute("product",product);
            request.getRequestDispatcher("delete.jsp").forward(request,response);
        }
    }

    private void deleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findId(id);
        if (product == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("delete.jsp").forward(request, response);
        }
    }
}
