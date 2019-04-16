package demolifecycle.deeksha.com.recyclerview.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import demolifecycle.deeksha.com.recyclerview.R;
import demolifecycle.deeksha.com.recyclerview.adapters.ProgrammingAdapter;
import demolifecycle.deeksha.com.recyclerview.api.ApiService;
import demolifecycle.deeksha.com.recyclerview.api.RetroClient;
import demolifecycle.deeksha.com.recyclerview.model.ContactList;
import demolifecycle.deeksha.com.recyclerview.model.Contacts;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contacts> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEmployee();
        /*RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        String[] languages = {"JAVA", "JavaScript", "C", "C++", "C#", "Python", "JAVA", "JavaScript", "C", "C++", "C#", "Python"};

        //set adapter here not layout --------
        programmingList.setAdapter(new ProgrammingAdapter(languages));*/
    }

    private void getEmployee() {
        ApiService apiService = RetroClient.getApiService();
        Call<ContactList> call = apiService.getEmployeeList();
        call.enqueue(new Callback<ContactList>() {
            @Override
            public void onResponse(Call<ContactList> call, Response<ContactList> response) {
                contactList = response.body().getContacts();

                RecyclerView recyclerContacts = (RecyclerView) findViewById(R.id.programmingList);
                ProgrammingAdapter adapter = new ProgrammingAdapter(contactList, MainActivity.this);
                recyclerContacts.setAdapter(adapter);
                recyclerContacts.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }

            @Override
            public void onFailure(Call<ContactList> call, Throwable t) {

            }
        });

    }
}
