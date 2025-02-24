package lrdtech.common.materials;

import gregtech.api.unification.material.materials.*;

import java.util.concurrent.atomic.AtomicBoolean;

public class LrdTechMaterials {
    private static final AtomicBoolean INIT = new AtomicBoolean(false);



    public static void register() {
        if (INIT.getAndSet(true)) {
            return;
        }


        FirstDegreeMaterials.register();


    }

}
