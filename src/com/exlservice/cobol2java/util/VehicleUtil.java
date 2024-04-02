package com.exlservice.cobol2java.util;

import com.exlservice.cobol2java.enums.VehicleType;
import com.exlservice.cobol2java.dto.Parts;

import java.util.Arrays;
import java.util.List;

public class VehicleUtil {
    public static final List<String> VEHICLE_MAKE_LIST = Arrays.asList
            (VehicleType.CHR.id(), VehicleType.FOR.id(), VehicleType.GM.id(), VehicleType.VW.id(),
                    VehicleType.TOY.id(), VehicleType.JAG.id(), VehicleType.PEU.id(), VehicleType.BMW.id()); //"CHR","FOR","GM ","VW ","TOY","JAG","PEU","BMW"

    public boolean isCHR(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.CHR.id());
    }

    public boolean isFOR(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.FOR.id());
    }

    public boolean isGM(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.GM.id());
    }

    public boolean isVW(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.VW.id());
    }

    public boolean isTOY(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.TOY.id());
    }

    public boolean isJAG(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.JAG.id());
    }

    public boolean isPEU(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.PEU.id());
    }

    public boolean isBMW(final Parts part) {
        final String vehicleMake = part.getVehicleMake();
        return VEHICLE_MAKE_LIST.contains(vehicleMake) && vehicleMake.equals(VehicleType.BMW.id());
    }
}
