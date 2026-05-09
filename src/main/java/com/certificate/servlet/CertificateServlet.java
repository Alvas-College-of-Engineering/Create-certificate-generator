package com.certificate.servlet;

import com.certificate.model.Certificate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/generateCertificate")
public class CertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Retrieve data from the form
        String participantName = request.getParameter("participantName");
        String courseName = request.getParameter("courseName");
        String achievementDescription = request.getParameter("achievementDescription");
        String issueDate = request.getParameter("issueDate");

        // 2. Create Certificate model object
        Certificate certificate = new Certificate(participantName, courseName, achievementDescription, issueDate);

        // 3. Set the object as an attribute in the request scope
        request.setAttribute("certificate", certificate);

        // 4. Forward the request to the JSP view to render the certificate
        RequestDispatcher dispatcher = request.getRequestDispatcher("/certificate.jsp");
        dispatcher.forward(request, response);
    }
}
