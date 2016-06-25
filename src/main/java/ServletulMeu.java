import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by icondor on 25/06/16.
 */

@WebServlet("/demo")
public class ServletulMeu extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // codez logica

        // ce primesc pe req
        // ce fac cu el
        // ce trimit pe response

        String s = req.getParameter("cucu");
        System.out.println("Hello "+s);
        // numele campului din forma html
    }
}
