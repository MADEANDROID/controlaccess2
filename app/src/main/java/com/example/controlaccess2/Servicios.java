package com.example.controlaccess2;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
public class Servicios
{
    
    public void Post_JSON( String json, String imei ) {
        //String miurl = "http://104.248.5.131:8080/geox-backend/api/socket-server/guardar-coordenada";
        String miurl = "http://localhost:8080/api/socket-server/guardar-coordenada";
        try
        {
            URL url = new URL( miurl );
            HttpURLConnection conn = ( HttpURLConnection ) url.openConnection();
            conn.setRequestProperty( "Content-Type", "application/json; charset=UTF-8" );
            conn.setDoOutput( true );
            conn.setDoInput( true );
            conn.setRequestMethod( "POST" );
            OutputStream os = conn.getOutputStream();
            os.write( json.getBytes( "UTF-8" ) );
            os.close();
            InputStream in = new BufferedInputStream( conn.getInputStream() );
            String result = IOUtils.toString( in, "UTF-8" );
            System.out.println(result);
            in.close();
            conn.disconnect();
        }
        catch ( Exception e )
        {
            System.out.println(e);
        }
    }
}