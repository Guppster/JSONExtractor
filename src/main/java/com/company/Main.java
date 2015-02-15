package com.company;

import com.squareup.okhttp.*;
import org.json.JSONObject;

import java.io.IOException;

public class Main 
{
    private static Object data;

    public static void main(String[] args) 
    {
        String apiURL = "http://drunk.artemis.me/index/json/app/e4bbe5b7a4c1eb55652965aee885dd59bd2ee7f4";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(apiURL).build();

        Call call = client.newCall(request);
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Request request, IOException e)
            {

            }

            @Override
            public void onResponse(Response response) throws IOException
            {
                try
                {
                    String JSONData = response.body().string();
                    System.out.println(JSONData);

                    if (!response.isSuccessful())
                    {

                    }
                    else
                    {
                        Object object = getDetails(JSONData);
                        System.out.println(object.toString());
                    }
                }
                catch (IOException e)
                {
                    System.out.println(e);
                }
            }
        });
    }//End of main method

    private static Object getDetails(String jsonData) 
    {
        JSONObject data = new JSONObject(jsonData);
        
        return new Object(data.getInt("id"), data.getInt("type"), data.getString("content"), data.getBoolean("active"));
    }
}//End of main class
