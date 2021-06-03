package prediction;

import lombok.*;
import org.json.simple.JSONObject;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
abstract public class Data{

    // call api
    public String callDataFromApi(String url) {

        // declare the weather object
        JSONObject dataJsonObj = new JSONObject();

        URL obj = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

        return response;
    }

    // clean data
    abstract void cleanData();


    
   
}