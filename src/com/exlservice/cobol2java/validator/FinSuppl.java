package com.exlservice.cobol2java.validator;

import com.exlservice.cobol2java.dto.EditResults;
import com.exlservice.cobol2java.dto.PartSuppAddrPO;
import com.exlservice.cobol2java.constants.Constants;

import static com.exlservice.cobol2java.util.ValidationUtil.*;

public class FinSuppl {

    public static void wsFinSuppl(PartSuppAddrPO partSuppAddrPO, EditResults editResults) {
        EditResults editResult = edits(partSuppAddrPO, editResults);
        if (!editResults.isSuccessful()) {
            System.out.println(Constants.SUPPLIES_EDIT_FAILED + editResult.getErrorMessage());
            System.out.println(Constants.INVALID_VALUE + editResult.getField());
            editResults.setStatus(Constants.WS_EDIT_STATUS_N);
        } else {
            editResults.setStatus(Constants.EDIT_RESULT_STATUS_Y);
            editResults.setField(Constants.EDIT_RESULT_EMPTY_FILED);
            System.out.println(Constants.SUPPLIES_EDIT_PASSED);
        }
    }

    // Equivalent of 000-EDITS.
    private static EditResults edits(PartSuppAddrPO partSuppAddrPO, EditResults editResults) {

        if (isEmptyString(Constants.SUPPLIER_NAME,partSuppAddrPO.getSupplier().getName(), editResults)) {
            return editResults;
        }

        if (isEmptyString(Constants.SUPPLIER_CODE,partSuppAddrPO.getSupplier().getCode(), editResults)) {
            return editResults;
        }

        if (isValidSupplier(Constants.SUPPLIER_TYPE,partSuppAddrPO.getSupplier().getType(), editResults)) {
            return editResults;
        }

        if (checkSupplierPerf(Constants.SUPPLIER_PREF,partSuppAddrPO.getSupplier().getPerf(), editResults)) {
            return editResults;
        }

        if (isValidRating(Constants.SUPPLIER_RATING ,partSuppAddrPO.getSupplier().getRating(),editResults)) {
            return editResults;
        }

        if (isValidSupplierStatus(Constants.SUPPLIER_STATUS, partSuppAddrPO.getSupplier().getStatus(), editResults)) {
            return editResults;
        }

        if (isValidAddressType(Constants.SUPPLIER_ADDRESS, partSuppAddrPO.getSuppAddLists(), editResults)) {
            return editResults;
        }
        return editResults;
    }
}