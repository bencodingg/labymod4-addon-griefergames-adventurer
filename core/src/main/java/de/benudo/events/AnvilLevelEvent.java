package de.benudo.events;

import de.benudo.AdventureAddon;
import de.benudo.configuration.AdventureConfiguration;
import de.benudo.configuration.subsettings.AnvilLevelSubSettings;

import net.labymod.api.client.component.serializer.plain.PlainTextComponentSerializer;
import net.labymod.api.client.world.item.ItemStack;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.world.ItemStackTooltipEvent;
import javax.inject.Singleton;

@Singleton
public class AnvilLevelEvent {

  @Subscribe
  public void onAnvil(ItemStackTooltipEvent event) {

    if(AdventureAddon.getInstance().configuration().enabled().get()) {

      if (AdventureAddon.getAnvilLevelSubSettings().enabled().get()) {

        ItemStack itemStack = event.itemStack();

        String text = "";

        if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("BLACK")) {
          text = "§0Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_BLUE")) {
          text = "§1Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_GREEN")) {
          text = "§2Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_AQUA")) {
          text = "§3Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_RED")) {
          text = "§4Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_PURPLE")) {
          text = "§5Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("GOLD")) {
          text = "§6Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("GRAY")) {
          text = "§7Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("DARK_GRAY")) {
          text = "§8Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("BLUE")) {
          text = "§9Anvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("GREEN")) {
          text = "§aAnvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("AQUA")) {
          text = "§bAnvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("RED")) {
          text = "§cAnvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("LIGHT_PURPLE")) {
          text = "§dAnvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("YELLOW")) {
          text = "§eAnvillevel: " + getRepairCost(itemStack);
        } else if (AdventureAddon.getAnvilLevelSubSettings().color().get().toString().equalsIgnoreCase("WHITE")) {
          text = "§fAnvillevel: " + getRepairCost(itemStack);
        }



        event.getTooltipLines().add(PlainTextComponentSerializer.plainText().deserialize(text));

      }

    }

  }

  private static Integer getRepairCost(ItemStack itemStack) {

    return itemStack.getOrCreateNBTTag().getInt("RepairCost");

  }

}

