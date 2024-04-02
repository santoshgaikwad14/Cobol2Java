package com.exlservice.cobol2java.util;

import com.exlservice.cobol2java.enums.AddressType;
import com.exlservice.cobol2java.enums.SupplierRating;
import com.exlservice.cobol2java.enums.SupplierStatus;
import com.exlservice.cobol2java.enums.SupplierType;

import java.util.Arrays;
import java.util.List;

public class SupplierUtil {
    public static final List<String> SUPPLIER_TYPE_LIST = Arrays.asList(SupplierType.SUBCONTRACTOR.id(), SupplierType.DISTRIBUTOR.id(),
            SupplierType.MANUFACTURER.id(), SupplierType.IMPORTER.id());

    public static final List<String> SUPPLIER_RATING_LIST = Arrays.asList(SupplierRating.HIGH.id(), SupplierRating.AVERAGE.id(), SupplierRating.LOW.id());

    public static final List<String> SUPPLIER_STATUS_LIST = Arrays.asList(SupplierStatus.GOVT_AND_COMMERCIAL.id(), SupplierStatus.GOVT_ONLY.id(), SupplierStatus.COMMERCIAL_ONLY.id());

    public static final List<String> ADDRESS_TYPE_LIST = Arrays.asList(AddressType.ORDER_ADDRESS.id(), AddressType.SCHED_ADDRESS.id(), AddressType.REMIT_ADDRESS.id());

    public static boolean isValidSupplier(final String supplierType) {
        return SUPPLIER_TYPE_LIST.contains(supplierType);
    }

    public static boolean isValidRating(final String supplierRating) {
        return SUPPLIER_RATING_LIST.contains(supplierRating);
    }

    public static boolean isValidSupplierStatus(final String supplierStatus) {
        return SUPPLIER_STATUS_LIST.contains(supplierStatus);
    }

    public static boolean isValidAddressType(final String addressType) {
        return ADDRESS_TYPE_LIST.contains(addressType);
    }
}
