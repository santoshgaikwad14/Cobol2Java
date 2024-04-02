package com.exlservice.cobol2java.validator;

import com.exlservice.cobol2java.dto.EditResults;
import com.exlservice.cobol2java.dto.PartSuppAddrPO;
import com.exlservice.cobol2java.constants.Constants;

import static com.exlservice.cobol2java.util.ValidationUtil.isEmpty;
import static com.exlservice.cobol2java.util.ValidationUtil.checkVehicleMake;
import static com.exlservice.cobol2java.util.ValidationUtil.isVehicleYearValid;
import static com.exlservice.cobol2java.util.ValidationUtil.isWeeksLeadTimeValid;

public class FinParts {

    public static void wsFinParts(PartSuppAddrPO partSuppAddrPO, EditResults editResults) {
        EditResults editResult = edits(partSuppAddrPO, editResults);

        if (!editResult.isSuccessful()) {
            System.out.println(Constants.PARTS_EDIT_FAILED + editResult.getErrorMessage());
            System.out.println(Constants.INVALID_VALUE + editResult.getField());
            editResults.setStatus(Constants.WS_EDIT_STATUS_N);
        } else {
            editResults.setStatus(Constants.EDIT_RESULT_STATUS_Y);
            editResults.setField(Constants.EDIT_RESULT_EMPTY_FILED);
            System.out.println(Constants.PARTS_EDIT_PASSED);
        }
    }

    private static EditResults edits(PartSuppAddrPO partSuppAddrPO, EditResults editResults) {
        // Equivalent of 000-EDITS.
        
        // Equivalent of IF PART-NUMBER = SPACES
        if (isEmpty(Constants.PART_NUMBER,partSuppAddrPO.getParts().getPartNumber(),editResults)) {
            return editResults;
        }

        // Equivalent of IF PART-NAME = SPACES
        if (isEmpty(Constants.PART_NAME,partSuppAddrPO.getParts().getPartName(),editResults)) {
            return editResults;
        }

        if (checkVehicleMake(Constants.VEHICLE_MAKE,partSuppAddrPO.getParts().getVehicleMake(),editResults)) {
            return editResults;
        }
        
        // Equivalent of IF VEHICLE-MODEL = SPACES
        if (isEmpty(Constants.VEHICLE_MODEL,partSuppAddrPO.getParts().getVehicleModel(),editResults)) {
            return editResults;
        }
        
        // Equivalent of IF NOT VEHICLE-YEAR-OK
        if (isVehicleYearValid(Constants.VEHICLE_YEAR,partSuppAddrPO.getParts().getVehicleYear(),editResults)) {
            return editResults;
        }
        
        // Equivalent of IF NOT WEEKS-LEAD-TIME-OK
        if (isWeeksLeadTimeValid(Constants.WEEKS_LEAD_TIME,partSuppAddrPO.getParts().getWeekLeadTime(),editResults)) {
            return editResults;
        }
        return editResults;
        // Continue with the rest of the code...
    }

}