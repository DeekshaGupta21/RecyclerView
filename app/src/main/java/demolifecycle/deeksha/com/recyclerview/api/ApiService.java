package demolifecycle.deeksha.com.recyclerview.api;

import demolifecycle.deeksha.com.recyclerview.model.ContactList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/json_data.json")
    Call<ContactList> getEmployeeList();
}
