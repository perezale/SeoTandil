package commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class MyHttpRequest {	

	public static String httpRequest(String urlToCall, String queryString) throws IOException
	{
		String resultado = "";
		
		InputStream is = null;
		
		try {
			
			String urlTemp = urlToCall + queryString;
			
			System.out.println("URL: "+ urlTemp);
			
			URL url = new URL(urlTemp);	
			is = url.openStream();
			
            BufferedReader reader = new BufferedReader(new InputStreamReader(is), 8 * 1024);
            String line = null;
            while ((line = reader.readLine()) != null) {
            	resultado += line + System.getProperty("line.separator");
            }
            is.close();
		  
		}catch(IOException e){
			throw e;
		}catch(Exception e){
			System.out.println(e.getMessage());
			resultado = null;
		}finally {
			try{ is.close(); }catch(Exception e){}
		}
		
		
		try {
			resultado.trim();
		} catch (Exception e) {}
		
		System.out.println("Resultado: "+ resultado);
		
		return resultado;
	}
	
}
