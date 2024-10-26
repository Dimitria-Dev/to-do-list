package com.example.todolist;
import java.io.*;
import java.util.List;
import entity.ToDo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


@WebServlet(name = "showTaskServlet", value = "/display-list")
public class ShowTasksServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            List<ToDo> tasks = entityManager.createQuery("SELECT t FROM ToDo t", ToDo.class).getResultList();
            request.setAttribute("tasks", tasks);

        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("show-list.jsp");
        dispatcher.forward(request, response);
    }

}
