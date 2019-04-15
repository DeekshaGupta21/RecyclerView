package demolifecycle.deeksha.com.recyclerview.api;

import java.util.List;

import demolifecycle.deeksha.com.recyclerview.model.Employee;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("employees")
    Call<List<Employee>> getEmployeeList();
}
