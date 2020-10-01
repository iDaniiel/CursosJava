
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
    // indicamos el tipo de respuedta al naavegador
        res.setContentType("application/vnd.ms-excel");
        res.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
    
        //attachment: significa ue cuando se de click
        // para un uno mas profecional se utiliza poi.apache.org
        res.setHeader("Pragma", "no-cache");
        res.setHeader("Cache-Control.", "no-store"); //no use cache en el servidor
        res.setDateHeader("Expires", -1); // la informacion expire de manera inmediata
        //Desplegar informacion al cliente
        PrintWriter out = res.getWriter();
        out.print("\tValores");
        out.print("\t1");
        out.print("\t2");
        out.print("Total\t=SUMA(b2:b3)");
        out.close();
    }
}
