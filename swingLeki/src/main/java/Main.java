import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Lek;

import javax.swing.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.showApp();
    }

    private List<Lek> getData() {

        try {
            URL url = new URL("http://localhost:8080/api/leki");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int responseCode = con.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("Wrong response code: " + responseCode);

            } else {
                StringBuilder stringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    stringBuilder.append(scanner.nextLine());
                }
                scanner.close();

                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(stringBuilder.toString(), new TypeReference<List<Lek>>() {
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    private void showApp() {
        JFrame jFrame = new JFrame("Tabela leków");
        JPanel rootPanel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        LekiTableModel lekiTableModel = new LekiTableModel(getData());
        JTable table = new JTable(lekiTableModel);
        table.validate();
        scrollPane.setViewportView(table);
        rootPanel.add(scrollPane);
        jFrame.getContentPane().add(rootPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
