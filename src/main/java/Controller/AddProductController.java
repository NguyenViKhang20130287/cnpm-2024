package Controller;

import Service.ProductManagementService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;


@WebServlet(name = "AddProductController", value = "/admin/doc/AddProductController")
@MultipartConfig
public class AddProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 7. Xu li du lieu
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        String quantity = request.getParameter("quantity");
        String price = request.getParameter("price");
        String thumbnailFileName = request.getParameter("ImageUpload");
        String content = request.getParameter("mota");

        int categoryParsed = Integer.parseInt(category);
        int colorParsed = Integer.parseInt(color);
        int sizeParsed = Integer.parseInt(size);
        int quantityParsed = Integer.parseInt(quantity);
        double priceParsed = Double.parseDouble(price);
        ProductManagementService service = new ProductManagementService();
        // 8. Gui thong tin den service
        service.addProduct(categoryParsed, name, thumbnailFileName, content, priceParsed,
                colorParsed, sizeParsed, quantityParsed);
        // 10. Quay lai trang
        response.sendRedirect("table-data-product.jsp");
    }
}