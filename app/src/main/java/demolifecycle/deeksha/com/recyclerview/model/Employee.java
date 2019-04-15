package demolifecycle.deeksha.com.recyclerview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("employee_name")
    @Expose
    private String employeeName;
    @SerializedName("employee_salary")
    @Expose
    private String employeeSalary;
    @SerializedName("employee_age")
    @Expose
    private String employeeAge;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    public String getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
