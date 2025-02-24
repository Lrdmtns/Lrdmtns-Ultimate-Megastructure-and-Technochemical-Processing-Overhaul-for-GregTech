package lrdtech.common.mtes;





import lrdtech.common.mtes.generator.MetaTileEntityLargeRocketEngine;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import gregtech.api.util.GTLog;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.*;

public class LrdTechMetaTileEntities {
    public static MetaTileEntityLargeRocketEngine BehemothComb;




    public static int id = 0;

    public static void init() {
        //Multis
        BehemothComb = registerMetaTileEntity(id++, new MetaTileEntityLargeRocketEngine(location("BehemothEngine")));
    }


    private static ResourceLocation location(@NotNull String name) {
        return new ResourceLocation("lrdtech", name);
    }

    /*public static void registerWFCoreSimpleMetaTileEntity(GCYWSimpleMachineMetaTileEntity[] machines, int startId, int maxTier, String name, RecipeMap<?> map, ICubeRenderer texture, boolean hasFrontFacing,  Function<String, ResourceLocation> resourceId, Function<Integer, Integer> tankScalingFunction) {
        for(int i = 0; i < maxTier; ++i) {
            String voltageName = GTValues.VN[i + 1].toLowerCase();
            machines[i + 1] = registerMetaTileEntity(startId + i, new WFCoreSimpleMachineMetaTileEntity(resourceId.apply(String.format("%s.%s", name, voltageName)), map, texture, i + 1, hasFrontFacing, tankScalingFunction));
        }

    }*/



    static {
    }
}