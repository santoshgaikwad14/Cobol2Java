package com.exlservice.cobol2java.dto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbendRec {
    final static String ABEND_REC = "ABEND PARA: ";
    public static void execute() {
        try (BufferedReader br = new BufferedReader(new FileReader("abend.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                final String parameterName = line.substring(12, 32);
                final String abendReason = line.substring(32, 72);
                final String expectedValue = line.substring(72, 78);
                final String actualValue = line.substring(86, 92);
                final String valueThree = line.substring(100, 106);
                final String oneVal = line.substring(114, 115);
                final String zeroVal = line.substring(124, 125);

                // Process the ABEND record
                // ...
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}