import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String Product_Description = request.getParameter("product_description");
        String a = request.getParameter("list_price");
        System.out.println(a);
        float List_Price = Float.parseFloat(a);
        System.out.println("list_price "+List_Price);

        double Discount_Percent = Double.parseDouble(request.getParameter("discount_percent"));
        System.out.printf("Dis count === "+Discount_Percent);
        double Discount_Amount  = List_Price * Discount_Percent*0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product_Description: " + Product_Description + "</h1>");
        writer.println("<h1>List_Price: " + List_Price + "</h1>");
        writer.println("<h1>Discount_Percent: " + Discount_Percent + "</h1>");
        writer.println("<h1>Discount_Amount: " + Discount_Amount + "</h1>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
