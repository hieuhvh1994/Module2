package storage;

import model.Phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilePhonebookManager implements IFileManager<Phonebook> {
    private static FilePhonebookManager filePhonebookManager;

    private FilePhonebookManager() {

    }

    public static FilePhonebookManager getInstance() {
        if (filePhonebookManager == null) {
            filePhonebookManager = new FilePhonebookManager();
        }
        return filePhonebookManager;
    }


    @Override
    public void writeFile(List<Phonebook> phonebooks) throws IOException {
        if (phonebooks == null) {
            phonebooks = new ArrayList<>();
        }

        try {
            FileWriter writer = new FileWriter("contacts.csv");


            for (Phonebook phonebook : phonebooks) {
                String line  = phonebook.getNumber() +","+ phonebook.getGroup() +","+ phonebook.getName() +","+ phonebook.getSex() +","+ phonebook.getAddress() +","+ phonebook.getDob() +","+ phonebook.getEmail();
                writer.write(line);

            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Phonebook> readFile() throws IOException, ClassNotFoundException {
        List<Phonebook> phonebooks = new ArrayList<>();


        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("contacts.csv"));

            while ((line = br.readLine()) != null) {
                List<String> result = new ArrayList<>();
                if (line != null) {
                    String[] splitData = line.split(",");
                    for (int i = 0; i < splitData.length; i++) {
                        result.add(splitData[i]);

                    }

                    Phonebook phonebook = new Phonebook(result.get(0), result.get(1), result.get(2),result.get(3), result.get(4),result.get(5), result.get(6));
                    phonebooks.add(phonebook);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br !=null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        phonebooks.remove(0);
        return phonebooks;
    }



}
