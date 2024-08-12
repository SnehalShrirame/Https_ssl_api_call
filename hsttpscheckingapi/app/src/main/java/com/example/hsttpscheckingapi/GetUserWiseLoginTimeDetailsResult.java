package com.example.hsttpscheckingapi;

import java.util.List;

public class GetUserWiseLoginTimeDetailsResult {
    private List<UserTimeLog> UsersTimeLogs;
    private String message;
    private String status;

    public List<UserTimeLog> getUsersTimeLogs() {
        return UsersTimeLogs;
    }

    public void setUsersTimeLogs(List<UserTimeLog> usersTimeLogs) {
        UsersTimeLogs = usersTimeLogs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
// Getters and setters
}