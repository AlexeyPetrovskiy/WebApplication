package main;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class FirstServlet extends HttpServlet {

    @Inject
    private ExampleBean exampleBean;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().append("Hello world");
        res.getWriter().append("login " + exampleBean.getLogin());
        res.getWriter().append("Password " + exampleBean.getPassword());
    }
}
