package demolifecycle.deeksha.com.recyclerview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Phone {
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("office")
    @Expose
    private String office;

    public String getMobile() {
        return mobile;
    }

    public String getHome() {
        return home;
    }

    public String getOffice() {
        return office;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
