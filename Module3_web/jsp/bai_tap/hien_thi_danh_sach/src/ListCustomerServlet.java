import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListCustomerServlet", urlPatterns = {"/"})
public class ListCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20", "Hà nội","/image/test.jpg" ));
        customerList.add(new Customer("Nguyễn Văn Nam","1999-08-20", "Đà Nẳng","/image/test2.jpg" ));
        customerList.add(new Customer("Nguyễn Minh Hiếu","1998-08-20", "Quảng Trị","/image/test3.png" ));
        customerList.add(new Customer("Lê Thế Trung","1997-08-20", "Hà nội","/image/test4.jpg" ));
        customerList.add(new Customer("Lê Thị Minh Anh","1996-08-20", "Cà Mau","/image/test5.jpg" ));

        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("listCustomer.jsp").forward(request,response);
    }
}
