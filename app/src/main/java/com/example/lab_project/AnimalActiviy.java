package com.example.lab_project;

import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.FrameLayout;
        import android.widget.Spinner;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;

public class AnimalActiviy extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private FrameLayout fragmentContainer;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_activiy);

        spinner = findViewById(R.id.spinner);
        fragmentContainer = findViewById(R.id.fragmentContainer);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.animals_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();

        // Load the initial fragment based on the selected spinner item
        String selectedItem = spinner.getSelectedItem().toString();
        loadFragment(selectedItem);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        loadFragment(selectedItem);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

    private void loadFragment(String selectedItem) {
        Fragment fragment;

        switch (selectedItem) {
            case "Cow":
                fragment = new Fragment1();
                break;
            case "Tiger":
                fragment = new Fragment2();
                break;
            case "Lion":
                fragment = new Fragment3();
                break;
            case "Valeriaa":
                fragment = new Fragment4();
                break;
            case "Penguin":
                fragment = new Fragment5();
                break;
            default:
                fragment = new Fragment1();
                break;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }
}
