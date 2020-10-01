package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String metodo = req.getMethod();
        String path = req.getProtocol();
        Enumeration headers = req.getHeaderNames();
        String ip = req.getRemoteAddr();
        
        out.print("<html>");
        out.print("<title>Headers</title>");
        out.print("<body>");
        out.print("<h2>Metodo de consulta:</h2>");
        out.print("<p>" + metodo + "</p>");
        out.print("<h2>Path de consulta:</h2>");
        out.print("<p>" + path + "</p>");
        out.print("<h2>Host de consulta:</h2>");
        while(headers.hasMoreElements()){
            String nombre = (String) headers.nextElement();
            out.print("<b>"+ nombre +"</b>");
            out.print(req.getHeader(nombre));
            out.print("<br>");
        }
        
        out.print("<h2>Ip remota:</h2>");
        out.print("<p>" + ip + "</p>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
