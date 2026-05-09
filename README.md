# Java Certificate Generator

A Java-based Dynamic Web Application that generates personalized certificates. It collects participant and course details via a web form, processes the information using Java Servlets, and dynamically generates a beautifully formatted certificate.

## Features

- **Dynamic Data Collection**: Web form to collect participant name, course name, date, etc.
- **Java Backend**: Robust Java Servlet architecture to handle requests and process data.
- **JSP Views**: Dynamically renders the generated certificate using JavaServer Pages.
- **Maven Build System**: Easy dependency management and build process.
- **Embedded Tomcat**: Run the project effortlessly using the Tomcat Maven plugin.

## Technologies Used

- **Backend**: Java 11, Servlets, JSP (JavaServer Pages)
- **Frontend**: HTML5, CSS3
- **Build Tool**: Maven
- **Server**: Apache Tomcat 7 (via Maven Plugin)

## Project Structure

```text
├── pom.xml                               # Maven configuration and dependencies
└── src
    └── main
        ├── java/com/certificate
        │   ├── model/Certificate.java    # Data model for the certificate
        │   └── servlet/                  # Backend controllers
        │       └── CertificateServlet.java
        └── webapp
            ├── WEB-INF/web.xml           # Deployment descriptor
            ├── css/style.css             # Stylesheets for the UI
            ├── index.html                # Input form for certificate details
            └── certificate.jsp           # View to render the final certificate
```

## How to Run

### Prerequisites
- JDK 11 or higher installed.
- Maven installed (or use the provided local Maven distribution).

### Running the Application

You can easily run this application using the Maven Tomcat plugin.

1. Open your terminal and navigate to the root directory of the project (where `pom.xml` is located).
2. Execute the following Maven command:

   ```bash
   mvn tomcat7:run
   ```
   *(Note: If you are using the local Maven downloaded in the project folder, use `.\apache-maven-3.9.9\bin\mvn.cmd tomcat7:run` instead).*

3. Wait for the server to start. You will see `[INFO] Starting ProtocolHandler ["http-bio-8080"]` in the console.
4. Open your web browser and navigate to:
   
   **http://localhost:8080/**

5. Fill in the details in the form and click submit to generate your certificate!

## Version Control (Git & GitHub)

To push this project to a GitHub repository:

1. **Initialize Git**:
   ```bash
   git init
   ```
2. **Add a `.gitignore` file** (to ignore the `target/` directory and other unnecessary files):
   ```bash
   echo "target/" > .gitignore
   echo ".idea/" >> .gitignore
   echo "*.class" >> .gitignore
   ```
3. **Commit your code**:
   ```bash
   git add .
   git commit -m "Initial commit: Add Certificate Generator application"
   ```
4. **Push to GitHub**:
   - Create a new repository on GitHub.
   - Link your local repo and push:
     ```bash
     git remote add origin https://github.com/your-username/your-repo-name.git
     git branch -M main
     git push -u origin main
     ```
