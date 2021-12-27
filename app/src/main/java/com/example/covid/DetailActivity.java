package com.example.covid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private int positionCountry;
    TextView tvCountry,tvCases, tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of" + SearchCovid.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCases = findViewById(R.id.tvCases);
        tvCountry = findViewById(R.id.tvCountry);
        tvRecovered = findViewById(R.id.tvRecovored);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvToDayDeaths);

        tvCountry.setText(SearchCovid.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(SearchCovid.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(SearchCovid.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(SearchCovid.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(SearchCovid.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(SearchCovid.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(SearchCovid.countryModelList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(SearchCovid.countryModelList.get(positionCountry).getTodayDeaths());

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}