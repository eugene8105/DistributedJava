import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/place-order")
public class OrderProcessingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qty = request.getParameter("quantity");

        String html = "<html><title>Thank You</title>\n"
                + "<body>You ordered "
                + qty
                + " things.</body>\n" +
                "</html>";

        response.getWriter().write(html);
        response.getWriter().flush();
        response.getWriter().close();
    }


}
