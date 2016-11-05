package com.example.administrator.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/5.
 */

public class FristActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //display title.
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.layout);
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FristActivity.this, "Buntton_1 was clicked", Toast.LENGTH_SHORT).show();
//摧毁活动，同back作用
//                finish();
//                Intent intent= new Intent(FristActivity.this,SecondActivity.class);
//                隐性意图
                Intent intent= new Intent("com.example.administrator.hello.ACTION_START");
                intent.addCategory("com.example.administrator.hello.MY_CATEGORY");
//                startActivity(intent);
//                Intent intent= new Intent("com.example.administrator.hello.ACTION_START");
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                intent.setData(Uri.parse("tel:10086"));

                startActivity(intent);
            }
        });
    }
//按下Menu 键才会出现
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
//        return super.onOptionsItemSelected(item);
    }


}
