import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CenterServlet",urlPatterns = "/form")
public class CenterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Integer.parseInt(request.getParameter("price"));
        float percent = Integer.parseInt(request.getParameter("percent"));

        double total = price * percent * 0.1;

        request.setAttribute("totalDiscount", total);
        request.getRequestDispatcher("display.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
