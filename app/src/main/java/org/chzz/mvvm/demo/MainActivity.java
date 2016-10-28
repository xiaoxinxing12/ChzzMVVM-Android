package org.chzz.mvvm.demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.chzz.adapter.CHZZViewHolderHelper;
import org.chzz.mvvm.demo.adapter.NormalRecyclerViewAdapter;
import org.chzz.mvvm.demo.adapter.RepositoryAdapter;
import org.chzz.mvvm.demo.databinding.ActivityMainBinding;
import org.chzz.mvvm.demo.model.BaseEntity;
import org.chzz.mvvm.demo.model.TestEntity;
import org.chzz.mvvm.demo.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NormalRecyclerViewAdapter.IFillDataListener, MainViewModel.DataListener {
    private ActivityMainBinding binding;
    RepositoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel model = new MainViewModel(this, "你好");
        binding.setViewModel(model);
        setupRecyclerView(binding.rvData);
        model.loadDate();
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        adapter = new RepositoryAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void setFillDataListener(CHZZViewHolderHelper chzzViewHolderHelper, int itemLayoutId, int i, BaseEntity t) {

    }

    @Override
    public void onRepositoriesChanged(List<TestEntity> repositories) {
        adapter.setRepositories(repositories);
        adapter.notifyDataSetChanged();
    }
}
