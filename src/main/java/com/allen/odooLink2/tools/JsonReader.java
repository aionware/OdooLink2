package com.allen.odooLink2.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;
public class JsonReader {
	
	String url;
	
	public JsonReader() {
		
	}

  public static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      
      System.out.println(jsonText);
//      JSONObject json = new JSONObject(jsonText);
      return null;
    } finally {
      is.close();
    }
  }
  public static String url2String(String url) throws IOException, IOException {
	  InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);      
	      System.out.println(jsonText);
	      write2File(jsonText);
	      return jsonText;
	    } finally {
	      is.close();
	      System.out.println("stream closed");
	    } 
  }
  
  public static void write2File(String str)	  throws IOException {
		    System.out.println(str);
		    BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/resources/json/temp.json"));
		    writer.write(str);
		    writer.close();
		    System.out.println("write complete");

		}
  
  
  public static void main(String[] args) throws IOException, JSONException {
//	    JSONObject json = readJsonFromUrl("https://jsonplaceholder.typicode.com/users");
	    
	    String json =  url2String("http://192.168.1.224:8080/api/customer/3");
	    write2File(json);
	  
//	  InIntell;
//	  System.out.println(b);
//	    System.out.println(json.toString());
//	    System.out.println(json.get("id"));
	  }
}
