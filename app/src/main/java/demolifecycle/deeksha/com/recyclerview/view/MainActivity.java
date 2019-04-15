package demolifecycle.deeksha.com.recyclerview.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import demolifecycle.deeksha.com.recyclerview.adapters.ProgrammingAdapter;
import demolifecycle.deeksha.com.recyclerview.R;
import demolifecycle.deeksha.com.recyclerview.api.ApiService;
import demolifecycle.deeksha.com.recyclerview.api.RetroClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEmployee();
        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        String[] languages = {"JAVA","JavaScript","C","C++","C#","Python","JAVA","JavaScript","C","C++","C#","Python"};

        //set adapter here not layout --------
        programmingList.setAdapter(new ProgrammingAdapter(languages));
        }
        private void getEmployee()
        {
            ApiService apiService = RetroClient.getApiService();
            Call call = apiService.getEmployeeList();
            call.enqueue(new Callback() {
                @Override
                public void onResponse(Call call, Response response) {
               //     Log.d("MainActivity", response.toString());
                    Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"FAILURE",Toast.LENGTH_LONG).show();

                }
            });
        }
}
