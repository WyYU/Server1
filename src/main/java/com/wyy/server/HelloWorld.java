package com.wyy.server;

import com.wyy.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by dell on 2019/3/11 0011.
 */
public class HelloWorld extends HttpServlet{
    private String message;
    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        UserDaoImp userDaoImp = new UserDaoImp();
        String username = userDaoImp.queryId(14).getUsername();
        out.print("<h1>" + username + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
