package cn.zdh.dataclearutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_clear = (TextView) findViewById(R.id.tv_clear);

        //获取缓存
        tv_clear.setText(DataClearUtil.getTotalCacheSize(this));
    }


    public void clear(View view) {
        //清除缓存
        DataClearUtil.cleanAllCache(this);
        Toast.makeText(this, "清除缓存成功", Toast.LENGTH_SHORT).show();
        tv_clear.setText(DataClearUtil.getTotalCacheSize(this));

    }
}
