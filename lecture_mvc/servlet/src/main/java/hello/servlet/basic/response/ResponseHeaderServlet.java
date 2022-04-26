package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(HttpServletResponse.SC_OK);

        // response.setHeader("Content-Type","text/plain");
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
        response.setHeader("Pragma", "no-cache");

        response.setHeader("my-header", "hello"); // 내가 원하는 값 지정도 가능

        cookie(response);
        redirect(response);

        response.getWriter().write("ok");
    }

    // 쿠키를 설정해주는 편의 메서드
    private void cookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("mycookie", "good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    // redirect 정보를 설정해주는 편의 메서드
    private void redirect(HttpServletResponse response) throws IOException {
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Location","/basic/hello-form.html");
        response.sendRedirect("/basic/hello-form.html");
    }
}
