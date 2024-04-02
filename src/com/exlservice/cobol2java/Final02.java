package com.exlservice.cobol2java;

import com.exlservice.cobol2java.dto.EditResults;
import com.exlservice.cobol2java.dto.PartSuppAddrPO;
import com.exlservice.cobol2java.validator.FinParts;
import com.exlservice.cobol2java.validator.FinSuppl;
import com.exlservice.cobol2java.parsers.PartSuppAddrParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static com.exlservice.cobol2java.constants.Constants.EDIT_RESULT_STATUS_Y;
import static com.exlservice.cobol2java.constants.Constants.LINE_FORMATTING;
import static com.exlservice.cobol2java.constants.Constants.PART_SUPP_INPUT_FILE;
import static com.exlservice.cobol2java.constants.Constants.PROCESSING_RECORD;
import static com.exlservice.cobol2java.constants.Constants.RESULT_FORMATTING;

public class Final02 {

    public static void main(String[] args) {

        int wsPartSuppread = 0;

        try {
            // Equivalent of 000-HOUSEKEEPING
            ClassLoader classLoader = Final02.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(PART_SUPP_INPUT_FILE);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                // Read lines until the end of the file
                while ((line = reader.readLine()) != null) {
                    System.out.println(PROCESSING_RECORD + wsPartSuppread);
                    System.out.println(RESULT_FORMATTING);
                    PartSuppAddrPO partSuppAddrPO = PartSuppAddrParser.parse(line);

                    EditResults editResults = new EditResults(true, EDIT_RESULT_STATUS_Y);
                    FinParts.wsFinParts(partSuppAddrPO, editResults);
                    if(editResults.isSuccessful()){
                        System.out.println(LINE_FORMATTING);
                        editResults = new EditResults(true, EDIT_RESULT_STATUS_Y);
                        FinSuppl.wsFinSuppl(partSuppAddrPO, editResults);
                    }
                    wsPartSuppread += 1;

                    System.out.println(RESULT_FORMATTING);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error while processing file, Status: " + e);
            }
        } catch (Exception e) {
            System.out.println("Error while processing, Status: " + e);
            e.printStackTrace();
        }
    }
}
