package io.github.wtfjoke;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;


public class PersonHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            outputStream.write("ok".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
    }
}