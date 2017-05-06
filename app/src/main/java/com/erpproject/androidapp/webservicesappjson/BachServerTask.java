package com.erpproject.androidapp.webservicesappjson;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Eslam on 5/6/2017.
 */

public class BachServerTask extends AsyncTask<String ,String ,String> {

    String register_url = "http://192.168.177.1/formuser/get_json_data.php";
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

    }

    @Override
    protected String doInBackground(String... params) {

        String getkey = params[0];
        String name = params[1];
        String username = params[2];
        String  email = params[3];
        String password = params[4];

        JSONObject jsonObject = new JSONObject();
        try {
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i= 0;i<jsonArray.length();i++){
                JSONObject getdata = jsonArray.getJSONObject(i);
                name = getdata.getString("name");
                username = getdata.getString("user_name");
                email = getdata.getString("email");
                password = getdata.getString("password");

                Contact contact = new Contact(name);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        if(getkey.equals("RegisterData")){
//            try {
//                URL url = new URL(register_url);
//                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                OutputStream  outputStream = httpURLConnection.getOutputStream();
//                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//
//                String data =
//                        URLEncoder.encode("name","UTF-8") +  " =  " + URLEncoder.encode( name,"UTF-8")
//                                +"&"+
//                                URLEncoder.encode("username","UTF-8") +  " =  " + URLEncoder.encode( username,"UTF-8")
//
//                                +"&"+
//                                URLEncoder.encode("email","UTF-8") +  " =  " + URLEncoder.encode( email,"UTF-8")
//
//                                +"&"+
//                                URLEncoder.encode("password","UTF-8") +  " =  " + URLEncoder.encode( password,"UTF-8");
//
//                bufferedWriter.write(data);
//                bufferedWriter.flush();
//                bufferedWriter.close();
//                outputStream.close();
//
//                return  "succes data";
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }else{
//
//        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
