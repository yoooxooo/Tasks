package autoparkProject.utils.mechanics;

import autoparkProject.utils.mechanics.api.IFixer;
import autoparkProject.classes.Vehicle;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MechanicService implements IFixer {

    private static final String[] details = {"Фильтр", "Втулка", "Вал", "Ось", "Свеча", "Масло", "ГРМ", "ШРУС"};

    private static final String ORDERS_CSV_PATH = "src/autoparkProject/files/orders.csv";

    public Map<String, Integer> detectBreaking(Vehicle vehicle) {
        Random random = new Random();
        Map<String, Integer> map = new HashMap<>();
        int detailID = random.nextInt(details.length - 1);
        int detailAmount = random.nextInt(3);
        if (detailAmount != 0) {
            map.put(details[detailID], detailAmount);
            File file = new File(ORDERS_CSV_PATH);

            try (FileWriter writer = new FileWriter(file, true)) {
                StringBuilder str = new StringBuilder();
                str.append(vehicle.getCarID()).append(",");
                str.append(details[detailID]).append(",");
                str.append(detailAmount);
                writer.append(str.toString() + "\n");
            } catch (IOException e) {
                System.out.println("Something went wrong...");
            }
        }
        return map;
    }

    public void repair(Vehicle vehicle) {
        File oldFile = new File(ORDERS_CSV_PATH);
        File newFile = new File(ORDERS_CSV_PATH + "_Buffered");

        try (BufferedReader reader = new BufferedReader(new FileReader(oldFile));
             FileWriter writer = new FileWriter(newFile)) {
            newFile.createNewFile();
            String bufferedLine;
            while ((bufferedLine = reader.readLine()) != null) {
                if (Integer.parseInt(bufferedLine.split(",")[0]) != vehicle.getCarID()) {
                    writer.append(bufferedLine);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        oldFile.delete();
        newFile.renameTo(oldFile);
    }

    public boolean isBroken(Vehicle vehicle) {
        File file = new File(ORDERS_CSV_PATH);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String bufferedLine;
            while ((bufferedLine = reader.readLine()) != null) {
                if (Integer.parseInt(bufferedLine.split(",")[0]) == vehicle.getCarID()) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        return false;
    }
}
