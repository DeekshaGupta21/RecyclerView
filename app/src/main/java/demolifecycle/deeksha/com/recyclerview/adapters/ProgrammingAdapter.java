package demolifecycle.deeksha.com.recyclerview.adapters;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import demolifecycle.deeksha.com.recyclerview.R;
import demolifecycle.deeksha.com.recyclerview.model.Contacts;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {//this adapter is generic type adapter


    List<Contacts> list;
    Context context;

    public ProgrammingAdapter(List<Contacts> data, Context context) {
        this.list = data;
        this.context = context;
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
        programmingViewHolder.txtTitle.setText(list.get(position).getName());
        Picasso.get().load(list.get(position).getProfileImage()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(programmingViewHolder.imgIcon);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;

        ProgrammingViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgContact);
            txtTitle = itemView.findViewById(R.id.txtName);

            txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), txtTitle.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
