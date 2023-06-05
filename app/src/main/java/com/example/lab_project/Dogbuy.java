package com.example.lab_project;

import android.content.Intent;
import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class Dogbuy extends AppCompatActivity {
    private EditText priceEditText;
    private EditText quantityEditText;
    private TextView calculationTextView;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogbuy);

        // Initialize views
        priceEditText = findViewById(R.id.priceEditText);
        quantityEditText = findViewById(R.id.quantityEditText);
        calculationTextView = findViewById(R.id.calculationTextView);
        submitButton = findViewById(R.id.submitButton);

        // Set click listener for submitButton
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the values from EditText fields
                String priceString = priceEditText.getText().toString();
                String quantityString = quantityEditText.getText().toString();

                // Convert the values to integers
                int price = Integer.parseInt(priceString);
                int quantity = Integer.parseInt(quantityString);

                // Perform the calculation
                int totalPrice = price * quantity;

                // Display the result in calculationTextView
                calculationTextView.setText("Total Price: " + totalPrice);
            }
        });
    }

    public void submitToBuy(View view) {

        Intent intent = new Intent(Dogbuy.this, VisitActivity.class);
        startActivity(intent);
    }
}
