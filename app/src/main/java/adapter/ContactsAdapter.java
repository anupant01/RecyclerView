package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recyclerview.DetailsActivity;
import com.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext())
               .inflate(R.layout.contact,viewGroup,false);

        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, final int i) {
        final Contacts contacts=contactsList.get(i);
        contactsViewHolder.imgprofile.setImageResource(contacts.getImageId());
        contactsViewHolder.tvcontact.setText(contacts.getName());
        contactsViewHolder.tvphone.setText(contacts.getPhoneno());

        contactsViewHolder.imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(mContext, DetailsActivity.class);

                intent.putExtra("image",contacts.getImageId());
                intent.putExtra("name",contacts.getName());
                intent.putExtra("phone",contacts.getPhoneno());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgprofile;
        TextView tvcontact, tvphone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgprofile =itemView.findViewById(R.id.imgprofile);
            tvcontact =itemView.findViewById(R.id.tvcontact);
            tvphone= itemView.findViewById(R.id.tvphone);
        }
    }
}
