package demolifecycle.deeksha.com.recyclerview.adapters;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import demolifecycle.deeksha.com.recyclerview.R;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {//this adapter is generic type adapter

    private String[] data;

    public ProgrammingAdapter(String[] data) {
        this.data = data;
    }


    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int position) {
        String title = data[position];
        programmingViewHolder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;

        ProgrammingViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.textTitle);

            txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), txtTitle.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
