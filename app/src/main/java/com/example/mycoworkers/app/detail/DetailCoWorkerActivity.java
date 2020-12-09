package com.example.mycoworkers.app.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mycoworkers.R;
import com.example.mycoworkers.data.CoWorker;

public class DetailCoWorkerActivity extends AppCompatActivity implements View.OnClickListener {
    private CoWorker coWorker;

    private TextView workerId;
    private TextView workerName;
    private ImageView workerPhoto;
    private TextView division;
    private TextView joinedSince;
    private TextView officeLocation;
    private TextView floorLocation;
    private TextView phone;
    private TextView email;
    private TextView jobRoles;
    private TextView jobSource;
    private TextView photoSource;
    private ImageButton btnPhone;
    private ImageButton btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_co_worker);
        initView();
        prepareCoWorkerData();
        initToolbar();
        initListener();
    }

    private void initListener() {
        btnPhone.setOnClickListener(this);
        btnEmail.setOnClickListener(this);
    }

    private void initToolbar() {
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(coWorker.getName() + "'s Profile");
        }
    }

    private void initView() {
        workerId = findViewById(R.id.tv_worker_id);
        workerName = findViewById(R.id.tv_worker_name);
        workerPhoto = findViewById(R.id.iv_worker_photo);
        division = findViewById(R.id.tv_division);
        joinedSince = findViewById(R.id.tv_joined_since);
        officeLocation = findViewById(R.id.tv_office_location);
        floorLocation = findViewById(R.id.tv_floor_location);
        phone = findViewById(R.id.tv_phone_number);
        email = findViewById(R.id.tv_email);
        jobRoles = findViewById(R.id.tv_job_roles);
        jobSource = findViewById(R.id.tv_job_source);
        photoSource = findViewById(R.id.tv_photo_source);
        btnPhone = findViewById(R.id.btn_call_phone);
        btnEmail = findViewById(R.id.btn_send_email);
    }

    private void prepareCoWorkerData() {
        coWorker = (CoWorker) getIntent().getSerializableExtra("coWorkerData");

        workerId.setText(coWorker.getWorkerId());
        workerName.setText(coWorker.getName());
        division.setText(coWorker.getDivision());
        joinedSince.setText(coWorker.getJoinedDate());
        officeLocation.setText(coWorker.getOfficeLocation());
        floorLocation.setText(coWorker.getFloorLocation());
        phone.setText(coWorker.getPhone());
        email.setText(coWorker.getEmail());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            jobRoles.setText(Html.fromHtml(coWorker.getJobRoles(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            jobRoles.setText(Html.fromHtml(coWorker.getJobRoles()));
        }
        jobSource.setText("Source: " + coWorker.getJobSource());
        photoSource.setText("Source: " + coWorker.getPhotoSource());

        Glide.with(getApplicationContext())
                .load(coWorker.getWorkerPhoto())
                .centerCrop()
                .apply(new RequestOptions().placeholder(R.drawable.ic_baseline_person))
                .into(workerPhoto);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btnPhone.getId()){
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ coWorker.getPhone()));
            startActivity(dialPhoneIntent);
        }
        else if(view.getId() == btnEmail.getId()){
            Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO);
            sendEmailIntent.setData(Uri.parse("mailto:"+coWorker.getEmail()));
            startActivity(sendEmailIntent);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}