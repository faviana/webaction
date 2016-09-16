package com.ironyard.servlets;

import com.ironyard.data.Student;
import com.ironyard.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jasonskipper on 9/14/16.
 */
@javax.servlet.annotation.WebServlet(name = "MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        // check user action request
        String action = request.getParameter("action");

        if(action == null) {
            // default
            showList(request, response);
        }else if(action.equalsIgnoreCase("detail")){
            // show detail
            showDetail(request, response);
        }

    }

    private void showDetail(HttpServletRequest request,
                            HttpServletResponse response) throws ServletException, IOException {

        StudentService todoServ = new StudentService();
        List<Student> items = todoServ.getAllStudents();
        long requestedId = Long.parseLong(request.getParameter("id"));
        for(Student tmpStudent:items){
            if(tmpStudent.getId() == requestedId){
                request.setAttribute("theStudentThatWasClicked",tmpStudent);
                break;
            }
        }

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/detail.jsp");
        dispatcher.forward(request,response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // do some work
        StudentService studentService = new StudentService();
        List<Student> all = studentService.getAllStudents();
        request.setAttribute("listOfAllStudents",all);

        // then forward to JSP for display
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request,response);
    }
}
