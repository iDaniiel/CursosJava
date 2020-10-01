
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        System.out.println("usuario: " + usuario);
        System.out.println("password: " + password);
        
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("Mi Servlet");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
