package com.example.neobu.second;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class JsonActivity extends MainActivity{
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jason);

        mTextView = (TextView)findViewById(R.id.jsonData);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflate().inflate(R.menu.menu_json, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemID();

    }
}

public void sendData(View view){
        String url = "https://www.google.com/maps/@-1.8938242,98.4227832,6007116m/data=!3m1!1e3?hl=ko"

        try{
            connectivityManaget conManager = (connectivityManager)getsystemservice(context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = conManaget.getActiveNetsorkInfo();

            if(netInfo != null && netInfo.isConnected()){
                new DownloadJson().execute(url);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Network isn't connected", Toast.LENGTH_LONG);
            toast.show();
        }
        } catch (Exception e){
            e.printStackTrace();
        }
        }
