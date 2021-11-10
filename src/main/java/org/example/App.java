package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {

        ResponseSite responseSite = new ResponseSite();
        String keyURL = "https://api.nasa.gov/planetary/apod?api_key=ZnEGRsxF4BXjPf9ZU1eAwoNdP6cd70yjZxVs2sBF";

        CloseableHttpResponse response = responseSite.response(keyURL);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        List<ResponseParameters> posts = mapper.readValue(response.getEntity().getContent(), new TypeReference<>() {});

        String urlPicture = posts.get(0).getUrl();
        int index = urlPicture.lastIndexOf('/');
        String fileName = urlPicture.substring(index + 1);
        
        CloseableHttpResponse responsePicture = responseSite.response(urlPicture);
        String body = new String(responsePicture.getEntity().getContent().readAllBytes());

        FileOutputStream out = new FileOutputStream("//Users//user//Desktop//" + fileName + ".txt");
        out.write(body.getBytes());
        out.close();

    }
}
