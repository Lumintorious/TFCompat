package mrthomas20121.tfcompat.compat.thaumcraft;

import mrthomas20121.rocksalt.utils.MetalUtils;
import mrthomas20121.rocksalt.utils.OredictUtils;
import mrthomas20121.tfcompat.compat.ArmorMaterialsTFCompat;
import mrthomas20121.tfcompat.compat.ToolMaterialsTFCompat;
import mrthomas20121.tfcompat.library.ModuleCore;
import net.dries007.tfc.api.types.Metal;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ThaumcraftModule extends ModuleCore {

    public ThaumcraftModule()
    {
        super("thaumcraft");
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        addRegistry(new ThaumcraftRegistry());
        MetalUtils.registerMetal("thaumium", Metal.Tier.TIER_IV, true, 1500, 1300, 0x5A4B8B, ToolMaterialsTFCompat.thaumium, ArmorMaterialsTFCompat.thaumium);
        MetalUtils.registerMetal("void_metal", Metal.Tier.TIER_VI, true, 1500, 1300, 0x2D1847);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OredictUtils.add("void_metal", "void");
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
