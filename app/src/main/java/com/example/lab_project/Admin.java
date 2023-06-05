package com.example.lab_project;



import android.os.Bundle;
        import android.widget.TextView;
        import com.example.lab_project.User;
        import androidx.appcompat.app.AppCompatActivity;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

public class Admin extends AppCompatActivity {

    private TextView dataTextView;
    private DatabaseReference usersRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        dataTextView = findViewById(R.id.dataTextView);
        usersRef = FirebaseDatabase.getInstance().getReference("users");

        usersRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                StringBuilder data = new StringBuilder();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    User user = snapshot.getValue(User.class);
                    data.append("Name: ").append(user.getName()).append("\n");
                    data.append("Age: ").append(user.getAge()).append("\n");
                    data.append("Email: ").append(user.getEmail()).append("\n");
                    data.append("Hours: ").append(user.getHours()).append("\n");
                    data.append("Phone: ").append(user.getPhone()).append("\n\n");
                }
                dataTextView.setText(data.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle potential errors
            }
        });
    }
}
