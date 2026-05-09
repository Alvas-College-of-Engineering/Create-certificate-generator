package com.certificate.model;

public class Certificate {
    private String participantName;
    private String courseName;
    private String achievementDescription;
    private String issueDate;

    // Default constructor
    public Certificate() {
    }

    // Parameterized constructor
    public Certificate(String participantName, String courseName, String achievementDescription, String issueDate) {
        this.participantName = participantName;
        this.courseName = courseName;
        this.achievementDescription = achievementDescription;
        this.issueDate = issueDate;
    }

    // Getters and Setters
    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAchievementDescription() {
        return achievementDescription;
    }

    public void setAchievementDescription(String achievementDescription) {
        this.achievementDescription = achievementDescription;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
