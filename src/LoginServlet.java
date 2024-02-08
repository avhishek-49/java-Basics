//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/LoginServlet")
//public class LoginServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Set response content type
//        response.setContentType("text/html");
//
//        // Get parameters from the request
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        // Create HTML response
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h2>Welcome, " + username + "!</h2>");
//        out.println("<p>Your password is: " + password + "</p>");
//        out.println("</body></html>");
//    }
//
//}
