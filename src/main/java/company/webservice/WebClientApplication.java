package company.webservice;

import company.dbservice.misc.XMLDocumentHandler;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

public enum WebClientApplication {
    INSTANCE;

    public static int PORT;
    public static final String APP_NAME = "Web Client Service";
    private HttpServer server;
    private Map<String, HttpHandler> handlers;

    public void start(int port) throws Exception {
        handlers = new HashMap<>();
        server = HttpServer.create(new InetSocketAddress(port), 10 );
        PORT = port;
        initHandlers();
        server.start();
        String message = String.format("%s is running on port: %d", APP_NAME, server.getAddress().getPort());
        System.out.println(message);
    }

    private HttpHandler getHandlerByClassName(String className) {
        for (HttpHandler handler : handlers.values()) {
            if (handler.getClass().getName().equals(className)) {
                return handler;
            }
        }
        return null;
    }

    public void initHandlers() {
        handlers = new HashMap<>();
        try {
            Utils.readXMLDocument("webclient/web.xml", new XMLDocumentHandler() {
                @Override
                public void handleDocument(Document document) {
                    try {
                        NodeList list = document.getElementsByTagName("handler");
                        for (int i =0 , len = list.getLength(); i < len; i++) {
                            Element el = (Element)(list.item(i));
                            String path = el.getAttribute("path");
                            String className =  el.getAttribute("class");
                            HttpHandler handler = getHandlerByClassName(className);
                            if (handler == null) {
                                handler = (HttpHandler)(Class.forName(className).newInstance());
                                handlers.put(path, handler);
                            }
                            server.createContext(path, handler);
                        }
                        System.out.printf("\nHANDLERS NUMBER: %d", handlers.size());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
