
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public final class Prophecy extends ExpansionSet {

    private static final Prophecy instance = new Prophecy();

    public static Prophecy getInstance() {
        return instance;
    }

    private Prophecy() {
        super("Prophecy", "PCY", ExpansionSet.buildDate(2000, 4, 27), SetType.EXPANSION);
        this.blockName = "Masques";
        this.parentSet = MercadianMasques.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Abolish", 1, Rarity.UNCOMMON, mage.cards.a.Abolish.class, RETRO_ART));
        cards.add(new SetCardInfo("Agent of Shauku", 55, Rarity.COMMON, mage.cards.a.AgentOfShauku.class, RETRO_ART));
        cards.add(new SetCardInfo("Alexi's Cloak", 29, Rarity.COMMON, mage.cards.a.AlexisCloak.class, RETRO_ART));
        cards.add(new SetCardInfo("Alexi, Zephyr Mage", 28, Rarity.RARE, mage.cards.a.AlexiZephyrMage.class, RETRO_ART));
        cards.add(new SetCardInfo("Aura Fracture", 2, Rarity.COMMON, mage.cards.a.AuraFracture.class, RETRO_ART));
        cards.add(new SetCardInfo("Avatar of Fury", 82, Rarity.RARE, mage.cards.a.AvatarOfFury.class, RETRO_ART));
        cards.add(new SetCardInfo("Avatar of Hope", 3, Rarity.RARE, mage.cards.a.AvatarOfHope.class, RETRO_ART));
        cards.add(new SetCardInfo("Avatar of Might", 109, Rarity.RARE, mage.cards.a.AvatarOfMight.class, RETRO_ART));
        cards.add(new SetCardInfo("Avatar of Will", 30, Rarity.RARE, mage.cards.a.AvatarOfWill.class, RETRO_ART));
        cards.add(new SetCardInfo("Avatar of Woe", 56, Rarity.RARE, mage.cards.a.AvatarOfWoe.class, RETRO_ART));
        cards.add(new SetCardInfo("Barbed Field", 83, Rarity.UNCOMMON, mage.cards.b.BarbedField.class, RETRO_ART));
        cards.add(new SetCardInfo("Blessed Wind", 4, Rarity.RARE, mage.cards.b.BlessedWind.class, RETRO_ART));
        cards.add(new SetCardInfo("Bog Elemental", 57, Rarity.RARE, mage.cards.b.BogElemental.class, RETRO_ART));
        cards.add(new SetCardInfo("Bog Glider", 58, Rarity.COMMON, mage.cards.b.BogGlider.class, RETRO_ART));
        cards.add(new SetCardInfo("Branded Brawlers", 84, Rarity.COMMON, mage.cards.b.BrandedBrawlers.class, RETRO_ART));
        cards.add(new SetCardInfo("Brutal Suppression", 85, Rarity.UNCOMMON, mage.cards.b.BrutalSuppression.class, RETRO_ART));
        cards.add(new SetCardInfo("Calming Verse", 110, Rarity.COMMON, mage.cards.c.CalmingVerse.class, RETRO_ART));
        cards.add(new SetCardInfo("Celestial Convergence", 5, Rarity.RARE, mage.cards.c.CelestialConvergence.class, RETRO_ART));
        cards.add(new SetCardInfo("Chilling Apparition", 59, Rarity.UNCOMMON, mage.cards.c.ChillingApparition.class, RETRO_ART));
        cards.add(new SetCardInfo("Chimeric Idol", 136, Rarity.UNCOMMON, mage.cards.c.ChimericIdol.class, RETRO_ART));
        cards.add(new SetCardInfo("Citadel of Pain", 86, Rarity.UNCOMMON, mage.cards.c.CitadelOfPain.class, RETRO_ART));
        cards.add(new SetCardInfo("Coastal Hornclaw", 31, Rarity.COMMON, mage.cards.c.CoastalHornclaw.class, RETRO_ART));
        cards.add(new SetCardInfo("Coffin Puppets", 60, Rarity.RARE, mage.cards.c.CoffinPuppets.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Coffin Puppets", "60s", Rarity.RARE, mage.cards.c.CoffinPuppets.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Copper-Leaf Angel", 137, Rarity.RARE, mage.cards.c.CopperLeafAngel.class, RETRO_ART));
        cards.add(new SetCardInfo("Darba", 111, Rarity.UNCOMMON, mage.cards.d.Darba.class, RETRO_ART));
        cards.add(new SetCardInfo("Death Charmer", 61, Rarity.COMMON, mage.cards.d.DeathCharmer.class, RETRO_ART));
        cards.add(new SetCardInfo("Denying Wind", 32, Rarity.RARE, mage.cards.d.DenyingWind.class, RETRO_ART));
        cards.add(new SetCardInfo("Despoil", 62, Rarity.COMMON, mage.cards.d.Despoil.class, RETRO_ART));
        cards.add(new SetCardInfo("Devastate", 87, Rarity.COMMON, mage.cards.d.Devastate.class, RETRO_ART));
        cards.add(new SetCardInfo("Diving Griffin", 6, Rarity.COMMON, mage.cards.d.DivingGriffin.class, RETRO_ART));
        cards.add(new SetCardInfo("Dual Nature", 112, Rarity.RARE, mage.cards.d.DualNature.class, RETRO_ART));
        cards.add(new SetCardInfo("Elephant Resurgence", 113, Rarity.RARE, mage.cards.e.ElephantResurgence.class, RETRO_ART));
        cards.add(new SetCardInfo("Endbringer's Revel", 63, Rarity.UNCOMMON, mage.cards.e.EndbringersRevel.class, RETRO_ART));
        cards.add(new SetCardInfo("Entangler", 7, Rarity.UNCOMMON, mage.cards.e.Entangler.class, RETRO_ART));
        cards.add(new SetCardInfo("Excavation", 33, Rarity.UNCOMMON, mage.cards.e.Excavation.class, RETRO_ART));
        cards.add(new SetCardInfo("Excise", 8, Rarity.COMMON, mage.cards.e.Excise.class, RETRO_ART));
        cards.add(new SetCardInfo("Fault Riders", 88, Rarity.COMMON, mage.cards.f.FaultRiders.class, RETRO_ART));
        cards.add(new SetCardInfo("Fen Stalker", 64, Rarity.COMMON, mage.cards.f.FenStalker.class, RETRO_ART));
        cards.add(new SetCardInfo("Fickle Efreet", 89, Rarity.RARE, mage.cards.f.FickleEfreet.class, RETRO_ART));
        cards.add(new SetCardInfo("Flameshot", 90, Rarity.UNCOMMON, mage.cards.f.Flameshot.class, RETRO_ART));
        cards.add(new SetCardInfo("Flay", 65, Rarity.COMMON, mage.cards.f.Flay.class, RETRO_ART));
        cards.add(new SetCardInfo("Flowering Field", 9, Rarity.UNCOMMON, mage.cards.f.FloweringField.class, RETRO_ART));
        cards.add(new SetCardInfo("Foil", 34, Rarity.UNCOMMON, mage.cards.f.Foil.class, RETRO_ART));
        cards.add(new SetCardInfo("Forgotten Harvest", 114, Rarity.RARE, mage.cards.f.ForgottenHarvest.class, RETRO_ART));
        cards.add(new SetCardInfo("Glittering Lion", 10, Rarity.UNCOMMON, mage.cards.g.GlitteringLion.class, RETRO_ART));
        cards.add(new SetCardInfo("Glittering Lynx", 11, Rarity.COMMON, mage.cards.g.GlitteringLynx.class, RETRO_ART));
        cards.add(new SetCardInfo("Greel's Caress", 67, Rarity.COMMON, mage.cards.g.GreelsCaress.class, RETRO_ART));
        cards.add(new SetCardInfo("Greel, Mind Raker", 66, Rarity.RARE, mage.cards.g.GreelMindRaker.class, RETRO_ART));
        cards.add(new SetCardInfo("Gulf Squid", 35, Rarity.COMMON, mage.cards.g.GulfSquid.class, RETRO_ART));
        cards.add(new SetCardInfo("Hazy Homunculus", 36, Rarity.COMMON, mage.cards.h.HazyHomunculus.class, RETRO_ART));
        cards.add(new SetCardInfo("Heightened Awareness", 37, Rarity.RARE, mage.cards.h.HeightenedAwareness.class, RETRO_ART));
        cards.add(new SetCardInfo("Hollow Warrior", 138, Rarity.UNCOMMON, mage.cards.h.HollowWarrior.class, RETRO_ART));
        cards.add(new SetCardInfo("Infernal Genesis", 68, Rarity.RARE, mage.cards.i.InfernalGenesis.class, RETRO_ART));
        cards.add(new SetCardInfo("Inflame", 91, Rarity.COMMON, mage.cards.i.Inflame.class, RETRO_ART));
        cards.add(new SetCardInfo("Jeweled Spirit", 12, Rarity.RARE, mage.cards.j.JeweledSpirit.class, RETRO_ART));
        cards.add(new SetCardInfo("Jolrael's Favor", 116, Rarity.COMMON, mage.cards.j.JolraelsFavor.class, RETRO_ART));
        cards.add(new SetCardInfo("Jolrael, Empress of Beasts", 115, Rarity.RARE, mage.cards.j.JolraelEmpressOfBeasts.class, RETRO_ART));
        cards.add(new SetCardInfo("Keldon Arsonist", 92, Rarity.UNCOMMON, mage.cards.k.KeldonArsonist.class, RETRO_ART));
        cards.add(new SetCardInfo("Keldon Battlewagon", 139, Rarity.RARE, mage.cards.k.KeldonBattlewagon.class, RETRO_ART));
        cards.add(new SetCardInfo("Keldon Berserker", 93, Rarity.COMMON, mage.cards.k.KeldonBerserker.class, RETRO_ART));
        cards.add(new SetCardInfo("Keldon Firebombers", 94, Rarity.RARE, mage.cards.k.KeldonFirebombers.class, RETRO_ART));
        cards.add(new SetCardInfo("Latulla's Orders", 96, Rarity.COMMON, mage.cards.l.LatullasOrders.class, RETRO_ART));
        cards.add(new SetCardInfo("Latulla, Keldon Overseer", 95, Rarity.RARE, mage.cards.l.LatullaKeldonOverseer.class, RETRO_ART));
        cards.add(new SetCardInfo("Lesser Gargadon", 97, Rarity.UNCOMMON, mage.cards.l.LesserGargadon.class, RETRO_ART));
        cards.add(new SetCardInfo("Living Terrain", 117, Rarity.UNCOMMON, mage.cards.l.LivingTerrain.class, RETRO_ART));
        cards.add(new SetCardInfo("Mageta the Lion", 13, Rarity.RARE, mage.cards.m.MagetaTheLion.class, RETRO_ART));
        cards.add(new SetCardInfo("Mageta's Boon", 14, Rarity.COMMON, mage.cards.m.MagetasBoon.class, RETRO_ART));
        cards.add(new SetCardInfo("Mana Vapors", 38, Rarity.UNCOMMON, mage.cards.m.ManaVapors.class, RETRO_ART));
        cards.add(new SetCardInfo("Marsh Boa", 118, Rarity.COMMON, mage.cards.m.MarshBoa.class, RETRO_ART));
        cards.add(new SetCardInfo("Mercenary Informer", 15, Rarity.RARE, mage.cards.m.MercenaryInformer.class, RETRO_ART));
        cards.add(new SetCardInfo("Mine Bearer", 16, Rarity.COMMON, mage.cards.m.MineBearer.class, RETRO_ART));
        cards.add(new SetCardInfo("Mirror Strike", 17, Rarity.UNCOMMON, mage.cards.m.MirrorStrike.class, RETRO_ART));
        cards.add(new SetCardInfo("Mungha Wurm", 119, Rarity.RARE, mage.cards.m.MunghaWurm.class, RETRO_ART));
        cards.add(new SetCardInfo("Nakaya Shade", 69, Rarity.UNCOMMON, mage.cards.n.NakayaShade.class, RETRO_ART));
        cards.add(new SetCardInfo("Noxious Field", 70, Rarity.UNCOMMON, mage.cards.n.NoxiousField.class, RETRO_ART));
        cards.add(new SetCardInfo("Outbreak", 71, Rarity.UNCOMMON, mage.cards.o.Outbreak.class, RETRO_ART));
        cards.add(new SetCardInfo("Overburden", 39, Rarity.RARE, mage.cards.o.Overburden.class, RETRO_ART));
        cards.add(new SetCardInfo("Panic Attack", 98, Rarity.COMMON, mage.cards.p.PanicAttack.class, RETRO_ART));
        cards.add(new SetCardInfo("Pit Raptor", 72, Rarity.UNCOMMON, mage.cards.p.PitRaptor.class, RETRO_ART));
        cards.add(new SetCardInfo("Plague Fiend", 73, Rarity.COMMON, mage.cards.p.PlagueFiend.class, RETRO_ART));
        cards.add(new SetCardInfo("Plague Wind", 74, Rarity.RARE, mage.cards.p.PlagueWind.class, RETRO_ART));
        cards.add(new SetCardInfo("Psychic Theft", 40, Rarity.RARE, mage.cards.p.PsychicTheft.class, RETRO_ART));
        cards.add(new SetCardInfo("Pygmy Razorback", 120, Rarity.COMMON, mage.cards.p.PygmyRazorback.class, RETRO_ART));
        cards.add(new SetCardInfo("Quicksilver Wall", 41, Rarity.UNCOMMON, mage.cards.q.QuicksilverWall.class, RETRO_ART));
        cards.add(new SetCardInfo("Rebel Informer", 75, Rarity.RARE, mage.cards.r.RebelInformer.class, RETRO_ART));
        cards.add(new SetCardInfo("Rethink", 42, Rarity.COMMON, mage.cards.r.Rethink.class, RETRO_ART));
        cards.add(new SetCardInfo("Reveille Squad", 18, Rarity.UNCOMMON, mage.cards.r.ReveilleSquad.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Cave", 142, Rarity.UNCOMMON, mage.cards.r.RhysticCave.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Circle", 19, Rarity.COMMON, mage.cards.r.RhysticCircle.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Deluge", 43, Rarity.COMMON, mage.cards.r.RhysticDeluge.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Lightning", 99, Rarity.COMMON, mage.cards.r.RhysticLightning.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Scrying", 44, Rarity.UNCOMMON, mage.cards.r.RhysticScrying.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Shield", 20, Rarity.COMMON, mage.cards.r.RhysticShield.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Study", 45, Rarity.COMMON, mage.cards.r.RhysticStudy.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Syphon", 76, Rarity.UNCOMMON, mage.cards.r.RhysticSyphon.class, RETRO_ART));
        cards.add(new SetCardInfo("Rhystic Tutor", 77, Rarity.RARE, mage.cards.r.RhysticTutor.class, RETRO_ART));
        cards.add(new SetCardInfo("Rib Cage Spider", 121, Rarity.COMMON, mage.cards.r.RibCageSpider.class, RETRO_ART));
        cards.add(new SetCardInfo("Ribbon Snake", 46, Rarity.COMMON, mage.cards.r.RibbonSnake.class, RETRO_ART));
        cards.add(new SetCardInfo("Ridgeline Rager", 100, Rarity.COMMON, mage.cards.r.RidgelineRager.class, RETRO_ART));
        cards.add(new SetCardInfo("Root Cage", 122, Rarity.UNCOMMON, mage.cards.r.RootCage.class, RETRO_ART));
        cards.add(new SetCardInfo("Samite Sanctuary", 21, Rarity.RARE, mage.cards.s.SamiteSanctuary.class, RETRO_ART));
        cards.add(new SetCardInfo("Scoria Cat", 101, Rarity.UNCOMMON, mage.cards.s.ScoriaCat.class, RETRO_ART));
        cards.add(new SetCardInfo("Search for Survivors", 102, Rarity.RARE, mage.cards.s.SearchForSurvivors.class, RETRO_ART));
        cards.add(new SetCardInfo("Searing Wind", 103, Rarity.RARE, mage.cards.s.SearingWind.class, RETRO_ART));
        cards.add(new SetCardInfo("Sheltering Prayers", 22, Rarity.RARE, mage.cards.s.ShelteringPrayers.class, RETRO_ART));
        cards.add(new SetCardInfo("Shield Dancer", 23, Rarity.UNCOMMON, mage.cards.s.ShieldDancer.class, RETRO_ART));
        cards.add(new SetCardInfo("Shrouded Serpent", 47, Rarity.RARE, mage.cards.s.ShroudedSerpent.class, RETRO_ART));
        cards.add(new SetCardInfo("Silt Crawler", 123, Rarity.COMMON, mage.cards.s.SiltCrawler.class, RETRO_ART));
        cards.add(new SetCardInfo("Snag", 124, Rarity.UNCOMMON, mage.cards.s.Snag.class, RETRO_ART));
        cards.add(new SetCardInfo("Soul Charmer", 24, Rarity.COMMON, mage.cards.s.SoulCharmer.class, RETRO_ART));
        cards.add(new SetCardInfo("Soul Strings", 78, Rarity.COMMON, mage.cards.s.SoulStrings.class, RETRO_ART));
        cards.add(new SetCardInfo("Spiketail Drake", 48, Rarity.UNCOMMON, mage.cards.s.SpiketailDrake.class, RETRO_ART));
        cards.add(new SetCardInfo("Spiketail Hatchling", 49, Rarity.COMMON, mage.cards.s.SpiketailHatchling.class, RETRO_ART));
        cards.add(new SetCardInfo("Spitting Spider", 125, Rarity.UNCOMMON, mage.cards.s.SpittingSpider.class, RETRO_ART));
        cards.add(new SetCardInfo("Spore Frog", 126, Rarity.COMMON, mage.cards.s.SporeFrog.class, RETRO_ART));
        cards.add(new SetCardInfo("Spur Grappler", 104, Rarity.COMMON, mage.cards.s.SpurGrappler.class, RETRO_ART));
        cards.add(new SetCardInfo("Squirrel Wrangler", 127, Rarity.RARE, mage.cards.s.SquirrelWrangler.class, RETRO_ART));
        cards.add(new SetCardInfo("Steal Strength", 79, Rarity.COMMON, mage.cards.s.StealStrength.class, RETRO_ART));
        cards.add(new SetCardInfo("Stormwatch Eagle", 50, Rarity.COMMON, mage.cards.s.StormwatchEagle.class, RETRO_ART));
        cards.add(new SetCardInfo("Sunken Field", 51, Rarity.UNCOMMON, mage.cards.s.SunkenField.class, RETRO_ART));
        cards.add(new SetCardInfo("Sword Dancer", 25, Rarity.UNCOMMON, mage.cards.s.SwordDancer.class, RETRO_ART));
        cards.add(new SetCardInfo("Task Mage Assembly", 105, Rarity.RARE, mage.cards.t.TaskMageAssembly.class, RETRO_ART));
        cards.add(new SetCardInfo("Thresher Beast", 128, Rarity.COMMON, mage.cards.t.ThresherBeast.class, RETRO_ART));
        cards.add(new SetCardInfo("Thrive", 129, Rarity.COMMON, mage.cards.t.Thrive.class, RETRO_ART));
        cards.add(new SetCardInfo("Trenching Steed", 26, Rarity.COMMON, mage.cards.t.TrenchingSteed.class, RETRO_ART));
        cards.add(new SetCardInfo("Troubled Healer", 27, Rarity.COMMON, mage.cards.t.TroubledHealer.class, RETRO_ART));
        cards.add(new SetCardInfo("Troublesome Spirit", 52, Rarity.RARE, mage.cards.t.TroublesomeSpirit.class, RETRO_ART));
        cards.add(new SetCardInfo("Verdant Field", 130, Rarity.UNCOMMON, mage.cards.v.VerdantField.class, RETRO_ART));
        cards.add(new SetCardInfo("Veteran Brawlers", 106, Rarity.RARE, mage.cards.v.VeteranBrawlers.class, RETRO_ART));
        cards.add(new SetCardInfo("Vintara Elephant", 131, Rarity.COMMON, mage.cards.v.VintaraElephant.class, RETRO_ART));
        cards.add(new SetCardInfo("Vintara Snapper", 132, Rarity.UNCOMMON, mage.cards.v.VintaraSnapper.class, RETRO_ART));
        cards.add(new SetCardInfo("Vitalizing Wind", 133, Rarity.RARE, mage.cards.v.VitalizingWind.class, RETRO_ART));
        cards.add(new SetCardInfo("Wall of Vipers", 80, Rarity.UNCOMMON, mage.cards.w.WallOfVipers.class, RETRO_ART));
        cards.add(new SetCardInfo("Well of Discovery", 140, Rarity.RARE, mage.cards.w.WellOfDiscovery.class, RETRO_ART));
        cards.add(new SetCardInfo("Well of Life", 141, Rarity.UNCOMMON, mage.cards.w.WellOfLife.class, RETRO_ART));
        cards.add(new SetCardInfo("Whip Sergeant", 107, Rarity.UNCOMMON, mage.cards.w.WhipSergeant.class, RETRO_ART));
        cards.add(new SetCardInfo("Whipstitched Zombie", 81, Rarity.COMMON, mage.cards.w.WhipstitchedZombie.class, RETRO_ART));
        cards.add(new SetCardInfo("Wild Might", 134, Rarity.COMMON, mage.cards.w.WildMight.class, RETRO_ART));
        cards.add(new SetCardInfo("Windscouter", 53, Rarity.UNCOMMON, mage.cards.w.Windscouter.class, RETRO_ART));
        cards.add(new SetCardInfo("Wing Storm", 135, Rarity.UNCOMMON, mage.cards.w.WingStorm.class, RETRO_ART));
        cards.add(new SetCardInfo("Wintermoon Mesa", 143, Rarity.RARE, mage.cards.w.WintermoonMesa.class, RETRO_ART));
        cards.add(new SetCardInfo("Withdraw", 54, Rarity.COMMON, mage.cards.w.Withdraw.class, RETRO_ART));
        cards.add(new SetCardInfo("Zerapa Minotaur", 108, Rarity.COMMON, mage.cards.z.ZerapaMinotaur.class, RETRO_ART));
    }
}
