package controllers;

import com.gorbachev.app.EmployeesRepository;
import com.gorbachev.app.RepositoryFactory;
import com.gorbachev.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeesController extends HttpServlet {
    private EmployeesRepository employeesRepository = RepositoryFactory.getEmployeesRepository();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("employees", employeesRepository.findAll());
        req.getRequestDispatcher("employees.jsp").forward(req, resp);

    }
}
