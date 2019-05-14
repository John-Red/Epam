package company.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import company.db.DBApplication;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;

import static company.ApplicationConst.PORT;

public enum DBServer {
    INSTANCE;

    public static final String BAD_HTML =
            "<html>" +
                    "<head></head>" +
                    "<body><div style=\"background-color:#AAAA00; width:100%; height:100%; border:1px solid black; color:white;\">{{state}}</body>"+
                    "</html>";

    public void start() throws Exception{
        HttpServer server= HttpServer.create(new InetSocketAddress(PORT),10);
        server.createContext("/db/state", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                String state = BAD_HTML.replace("{{state}}", DBApplication.INSTANCE.getStateName());
               // state= String.format(BAD_HTML,state);
                httpExchange.sendResponseHeaders(200,state.length());
                httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList(new String[]{"text/xml"}));
                OutputStream os = httpExchange.getResponseBody();
                os.write(state.getBytes());
                os.close();
            }
        });
        server.start();
        String message =String.format("Server is running on port: %d", server.getAddress().getPort());
        System.out.println(message);
    }
}
