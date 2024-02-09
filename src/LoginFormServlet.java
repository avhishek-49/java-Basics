import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Display data in the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("<p>Your password is: " + password + "</p>");
        out.println("</body></html>");
    }
}
