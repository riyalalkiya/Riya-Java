package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDAO;


public class StudentServlet extends HttpServlet {
	private final StudentDAO studentDAO = new StudentDAO();
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		    String action = null;
			if (action == null) {
		        response.getWriter().write("No action specified.");
		        return;
		    }

		    switch (action.toLowerCase()) {
		        case "insert":
		            insertStudent(request, response);
		            break;
		        case "update":
		            updateStudent(request, response);
		            break;
		        case "delete":
		            deleteStudent(request, response);
		            break;
		        case "search":
		            searchStudent(request, response);
		            break;
		        default:
		            response.getWriter().write("Invalid action.");
		    }
		}

        

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if (fname == null || lname == null || email == null || mobile == null) {
            response.getWriter().write("All fields are required for insertion.");
            return;
        }

        Student student = new Student();
        studentDAO.insertStudent(student);
        response.getWriter().write("Student inserted successfully!");
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");
        if (idParam == null) {
            response.getWriter().write("Student ID is required for updating.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.getWriter().write("Invalid student ID.");
            return;
        }

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        Student student = new Student();
        studentDAO.updateStudent(student);
        response.getWriter().write("Student updated successfully!");
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");
        if (idParam == null) {
            response.getWriter().write("Student ID is required for deletion.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.getWriter().write("Invalid student ID.");
            return;
        }

        studentDAO.deleteStudent(id);
        response.getWriter().write("Student deleted successfully!");
    }

    private void searchStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");
        if (idParam == null) {
            response.getWriter().write("Student ID is required for searching.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.getWriter().write("Invalid student ID.");
            return;
        }

        Student student = studentDAO.getStudentById(id);

        if (student != null) {
            response.getWriter().write("Student found: " + student.getFname() + " " + student.getLname());
        } else {
            response.getWriter().write("No student found with ID: " + id);
        }
    }

	}


