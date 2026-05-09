<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.certificate.model.Certificate" %>
<%
    Certificate certificate = (Certificate) request.getAttribute("certificate");
    if (certificate == null) {
        response.sendRedirect("index.html");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Certificate of Achievement</title>
    <link rel="stylesheet" href="css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Georgia&family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<body style="flex-direction: column;">

    <div class="certificate-wrapper">
        <div class="certificate-border">
            <div class="certificate-header">Certificate of Achievement</div>
            <div class="certificate-subtitle">This is to certify that</div>

            <div class="recipient-name"><%= certificate.getParticipantName() %></div>

            <div class="achievement-text">
                <%= certificate.getAchievementDescription() %>
            </div>

            <div class="course-name"><%= certificate.getCourseName() %></div>

            <div class="certificate-footer">
                <div class="date-block">
                    <div class="date-line"><%= certificate.getIssueDate() %></div>
                    <div class="block-label">Date of Issue</div>
                </div>
                <div class="signature-block">
                    <div class="signature-line" style="font-family: 'Georgia', cursive; font-style: italic;">Authorized Signature</div>
                    <div class="block-label">Director / Instructor</div>
                </div>
            </div>
        </div>
    </div>

    <div class="action-buttons">
        <button onclick="window.print()" class="btn-submit" style="width: auto; padding: 0.75rem 2rem;">Print / Save as PDF</button>
        <a href="index.html" class="btn-secondary">Generate Another</a>
    </div>

</body>
</html>
