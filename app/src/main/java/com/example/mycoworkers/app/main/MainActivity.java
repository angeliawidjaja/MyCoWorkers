package com.example.mycoworkers.app.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mycoworkers.R;
import com.example.mycoworkers.app.about.AboutActivity;
import com.example.mycoworkers.app.detail.DetailCoWorkerActivity;
import com.example.mycoworkers.data.CoWorker;
import com.example.mycoworkers.data.CoWorkersData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListCoWorkerAdapter listCoWorkerAdapter;
    private RecyclerView rvCoWorkers;
    private ArrayList<CoWorker> coWorkerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoWorkers = findViewById(R.id.rv_co_workers);
        rvCoWorkers.setHasFixedSize(true);

        coWorkerList.addAll(CoWorkersData.getCoWorkersData());
        initAdapter();
    }

    private void initAdapter() {
        listCoWorkerAdapter = new ListCoWorkerAdapter(coWorkerList);
        rvCoWorkers.setLayoutManager(new LinearLayoutManager(this));
        rvCoWorkers.setAdapter(listCoWorkerAdapter);
        listCoWorkerAdapter.setOnItemClickCallback(new ListCoWorkerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClick(CoWorker coWorker) {
                intentToDetailCoWorker(coWorker);
            }
        });
    }

    private void intentToDetailCoWorker(CoWorker coWorker) {
        Intent detailIntent = new Intent(this, DetailCoWorkerActivity.class);
        detailIntent.putExtra("coWorkerData", coWorker);
        startActivity(detailIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        initToolbarAction(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void initToolbarAction(int itemId) {
        switch (itemId){
            case R.id.action_about:
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
    }
}