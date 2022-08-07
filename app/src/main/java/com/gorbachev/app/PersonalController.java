package com.gorbachev.app;

import com.gorbachev.model.Personal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PersonalController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personal", List.of(
                new Personal("Andry123", 123345, "Andry", 27),
                new Personal("Max123", 234567, "Max", 30),
                new Personal("Tema123", 345678, "Tema", 28)));
        req.getRequestDispatcher("personal.jsp").forward(req, resp);

    }
}
