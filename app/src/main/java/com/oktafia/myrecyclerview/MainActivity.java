package com.oktafia.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWifes;
    private ArrayList<Wife> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWifes = findViewById(R.id.rv_wife);
        rvWifes.setHasFixedSize(true);

        list.addAll(WifesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWifes.setLayoutManager(new LinearLayoutManager(this));
        ListWifeAdapter listWifeAdapter = new ListWifeAdapter(list);
        rvWifes.setAdapter(listWifeAdapter);

        listWifeAdapter.setOnItemClickCallback(new ListWifeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wife data) {
                showSelectedWife(data);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    private void showSelectedWife(Wife wife) {
        Toast.makeText(this, "Kamu memilih " + wife.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        String title = null;
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode cardview";
                showRecyclerCardView();
                break;

            case R.id.action_about:
                title = "About";
                showAbout();
                break;
        }
        setActionBarTitle(title);
    }

    void showAbout() {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    private void showRecyclerGrid() {
        rvWifes.setLayoutManager(new GridLayoutManager(this, 2));
        GridWifeAdapter gridWifeAdapter = new GridWifeAdapter(list);
        rvWifes.setAdapter(gridWifeAdapter);
    }

    private void showRecyclerCardView() {
        rvWifes.setLayoutManager(new LinearLayoutManager(this));
        CardViewWifeAdapter cardViewWifeAdapter = new CardViewWifeAdapter(list, this);
        rvWifes.setAdapter(cardViewWifeAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}
