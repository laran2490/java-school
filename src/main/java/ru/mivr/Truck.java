package ru.mivr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by LL on 07.08.2016.
 */
public class Truck {
    public static void main(String[] args) {

//        processSimple();
//        processConsole();

        processFile();

        System.out.println("end of process");
    }

    /**
     * method for resolve task with static params
     */
    private static void processSimple() {
        int m = 10;
        int resCnt = 0;
        int resValue = 0;

        int[] values = {5, 7, 3, 9, 1};

        for (int value : values) {
            if (resValue + value <= m) {
                resValue += value;
                resCnt++;
            }
        }

        System.out.println(resCnt + " " + resValue + System.lineSeparator());
    }

    /**
     * method for counting things and their summary weight
     *
     * @params gets from console
     */
    private static void processConsole() {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            process(reader, writer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*} catch (IndexOutOfBoundsException e) {
            System.out.println("Count things less then value of n.");
        } catch (IOException e) {
            System.out.println("Some IO Exception.");*/
    }

    /**
     * method for counting things and their summary weight
     *
     * @params (static) file: input.txt and output.txt
     */
    private static void processFile() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        ) {
            while (reader.ready()) {
                process(reader, writer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File input.txt not found.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Count things less then value of n.");
        } catch (IOException e) {
            System.out.println("Some IO Exception.");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static void process(BufferedReader reader, BufferedWriter writer) throws Exception {
        int numberOfItems;
        int maxWight;
        int resultItemsCount;
        int resultWeight;

        String[] params = reader.readLine().split(" ");
        if (params.length < 2) {
            return;
        }

        numberOfItems = Integer.parseInt(params[0]);
        maxWight = Integer.parseInt(params[1]);

        resultItemsCount = 0;
        resultWeight = 0;

        String[] valuesStr = reader.readLine().split(" ");
        if (valuesStr.length < numberOfItems) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = 0; i < numberOfItems; i++) {
            if (resultWeight + Integer.parseInt(valuesStr[i]) <= maxWight) {
                resultWeight += Integer.parseInt(valuesStr[i]);
                resultItemsCount++;
            }
        }
        writer.write(resultItemsCount + " " + resultWeight + System.lineSeparator());
//        writer.flush();
    }
}
