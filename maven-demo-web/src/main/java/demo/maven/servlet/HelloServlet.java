package demo.maven.servlet;

import demo.maven.service.HelloService;
import demo.maven.service.HelloServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello servlet.
 *
 * @author akuma
 */
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        HelloService helloService = new HelloServiceImpl();
        out.println(helloService.sayHello(name));

        out.flush();
        out.close();
    }
}
