package company;

import company.command.ACommand;
import company.command.CommandRegistry;
import company.db.DBApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Application {

    static private int count = 1;

    public static void main(String[] args) {
        //DBApplication.INSTANCE.start();
        //DBApplication.INSTANCE.stop();
        //BadApplication badApplication = new BadApplication();
        //badApplication.start();
        testXMLReader();
        //DBApplication.INSTANCE.start();
        try {
            com.epam.javacore2019.steve2.webservice.WebClientApplication.INSTANCE.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void testXMLReader() {
        DBApplication.INSTANCE.start();

//        try {
//            company.db.misc.Utils.readXMLDocument(company.db.misc.DBConstants.STRUCTURE_DIR + "/test.xml",
//                    new company.db.misc.XMLDocumentHandler() {
//                        @Override
//                        public void handleDocument(Document document) {
//                            Element root = document.getDocumentElement();
//                            System.out.println(root.getAttribute("name"));
//                            NodeList columns = root.getElementsByTagName("column");
//                            System.out.println(columns.getLength());
//                            for (int i = 0, len = columns.getLength(); i < len; i++) {
//                                Element column = (Element) columns.item(i);
//                                System.out.println(column.getAttribute("systemName"));
//                                System.out.println(column.getAttribute("displayName"));
//                            }
//                        }
//                    });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}