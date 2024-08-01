package mvc.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
* 1. 파라미터 전송 기능
* http://localhost:8080/request-param?username=kim&age=20
 */

@WebServlet(name = "requestParamServlet" ,urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("전체 파라미터 조회 - start");

        req.getParameterNames().asIterator()
                .forEachRemaining(name -> System.out.println(name + " : " + req.getParameter(name)));

        System.out.println("전체 파라미터 조회 - end");

    }
}
