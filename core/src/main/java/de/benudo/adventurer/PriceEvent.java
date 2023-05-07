package de.benudo.adventurer;

import de.benudo.AdventureAddon;
import net.labymod.api.client.component.serializer.plain.PlainTextComponentSerializer;
import net.labymod.api.client.world.item.ItemStack;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.world.ItemStackTooltipEvent;
import javax.inject.Singleton;

@Singleton
public class PriceEvent {

  @Subscribe
  public void onToolTip(ItemStackTooltipEvent event) {

    if (AdventureAddon.getInstance().configuration().enabled().get()) {

      if (AdventureAddon.getInstance().configuration().price().get()) {

        ItemStack itemStack = event.itemStack();
        String itemStackName = PlainTextComponentSerializer.plainText()
            .serialize(itemStack.getDisplayName());

        if(getRepairCost(itemStack) == 0) {

          if (itemStackName.equalsIgnoreCase("Adventurer Master-Schwert")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e100 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Adventurer Master-Schaufel")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e100 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Adventurer Master-Axt")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e100 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Adventurer Master-Spitzhacke")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e100 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Adventurer Master-Bogen")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e75 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Bergkristall")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e200 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Smaragd Amulett")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e200 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Klassische Rüstung")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e10 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Klassische Schwert")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e15 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Klassische Schaufel")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e15 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Klassische Axt")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e15 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Klassische Hacke")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e15 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Community-Kiste")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e8 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Super-Unlucky Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e5 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Mega-Unlucky Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e5 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Ultra-Unlucky Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e4 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Ultra Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e10 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Mega Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e8 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Super Adventurer Luckyblock (LuckyBlock)")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e6 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Ocean Farbe")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e500 Adventure Coins"));

          }

          if (itemStackName.equalsIgnoreCase("Galaxy Farbe")) {

            event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize("§7Price§8: §e150 Adventure Coins"));

          }

        }


      }
    }
  }

  private static Integer getRepairCost(ItemStack itemStack) {

    return itemStack.getOrCreateNBTTag().getInt("RepairCost");

  }
}

