package org.chzz.mvvm.demo.viewmodel;

import org.chzz.mvvm.demo.model.TestEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * 版权 ：深圳市医友智能技术有限公司 版权所有 (c)   2016/10/28
 * 作者:copy   xiaoxinxing12@qq.com
 * 版本 ：1.0
 * 创建日期 ： 2016/10/28--15:28
 * 描述 ：
 * 修订历史 ：
 * ============================================================
 **/

public class MainViewModel {
    String title;
    DataListener dataListener;


    public MainViewModel(DataListener dataListener, String title) {
        this.dataListener = dataListener;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void loadDate() {
        List<TestEntity> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new TestEntity("中国", "android", "1000", "升级Android Studio2.2遇坑经历记录" + i));
        }
        title = "10条数据";
        dataListener.onRepositoriesChanged(list);
    }

    public interface DataListener {
        void onRepositoriesChanged(List<TestEntity> repositories);
    }
}
