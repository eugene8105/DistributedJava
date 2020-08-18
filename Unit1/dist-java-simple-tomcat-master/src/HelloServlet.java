
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            Writer writer = response.getWriter();
            writer.write("Hello! The current time is: ");
            writer.write(LocalDateTime.now().toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
