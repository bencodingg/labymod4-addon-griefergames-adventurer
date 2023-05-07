package de.benudo.adventurer;

import de.benudo.AdventureAddon;
import net.labymod.api.client.component.serializer.plain.PlainTextComponentSerializer;
import net.labymod.api.client.world.item.ItemStack;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.world.ItemStackTooltipEvent;
import javax.inject.Singleton;

@Singleton
public class AdventureEvent {

  @Subscribe
  public void onToolTip(ItemStackTooltipEvent event) {

    if (AdventureAddon.getInstance().configuration().enabled().get()) {

      if (AdventureAddon.getAdventureSubSetting().enabled().get()) {

        ItemStack itemStack = event.itemStack();

        String signalName = AdventureAddon.getAdventureSubSetting().text().get();
        String text = "";

        if (AdventureAddon.getAdventureSubSetting().star().get()) {

          if (AdventureAddon.getAdventureSubSetting().bold().get()) {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§6§l⭐ §0§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§6§l⭐ §1§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§6§l⭐ §2§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§6§l⭐ §3§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§6§l⭐ §4§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§6§l⭐ §5§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6§l⭐ §6§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§6§l⭐ §7§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§6§l⭐ §8§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§6§l⭐ §9§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§6§l⭐ §a§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§6§l⭐ §b§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§6§l⭐ §c§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§6§l⭐ §d§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§6§l⭐ §e§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§6§l⭐ §f§l" + signalName + " §6§l⭐";
            }

          } else {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§6§l⭐ §0" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§6§l⭐ §1" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§6§l⭐ §2" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§6§l⭐ §3" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§6§l⭐ §4" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§6§l⭐ §5" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6§l⭐ §6" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§6§l⭐ §7" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§6§l⭐ §8" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§6§l⭐ §9" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§6§l⭐ §a" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§6§l⭐ §b" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§6§l⭐ §c" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§6§l⭐ §d" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§6§l⭐ §e" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§6§l⭐ §f" + signalName + " §6§l⭐";
            }

          }

          if (AdventureAddon.getAdventureSubSetting().cursive().get()
              && AdventureAddon.getAdventureSubSetting().bold().get()) {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§6§l⭐ §0§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§6§l⭐ §1§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§6§l⭐ §2§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§6§l⭐ §3§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§6§l⭐ §4§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§6§l⭐ §5§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6§l⭐ §6§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§6§l⭐ §7§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§6§l⭐ §8§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§6§l⭐ §9§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§6§l⭐ §a§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§6§l⭐ §b§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§6§l⭐ §c§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§6§l⭐ §d§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§6§l⭐ §e§o§l" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§6§l⭐ §f§o§l" + signalName + " §6§l⭐";
            }

          } else if (AdventureAddon.getAdventureSubSetting().cursive().get()) {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§6§l⭐ §0§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§6§l⭐ §1§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§6§l⭐ §2§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§6§l⭐ §3§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§6§l⭐ §4§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§6§l⭐ §5§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6§l⭐ §6§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§6§l⭐ §7§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§6§l⭐ §8§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§6§l⭐ §9§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§6§l⭐ §a§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§6§l⭐ §b§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§6§l⭐ §c§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§6§l⭐ §d§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§6§l⭐ §e§o" + signalName + " §6§l⭐";
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§6§l⭐ §f§o" + signalName + " §6§l⭐";
            }
          }

        } else {

          if (AdventureAddon.getAdventureSubSetting().bold().get()) {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§0§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§1§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§2§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§3§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§4§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§5§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§7§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§8§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§9§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§a§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§b§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§c§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§d§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§e§l" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§f§l" + signalName;
            }

          } else {

            if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLACK")) {
              text = "§0" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_BLUE")) {
              text = "§1" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GREEN")) {
              text = "§2" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_AQUA")) {
              text = "§3" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_RED")) {
              text = "§4" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_PURPLE")) {
              text = "§5" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GOLD")) {
              text = "§6" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GRAY")) {
              text = "§7" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("DARK_GRAY")) {
              text = "§8" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("BLUE")) {
              text = "§9" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("GREEN")) {
              text = "§a" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("AQUA")) {
              text = "§b" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("RED")) {
              text = "§c" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("LIGHT_PURPLE")) {
              text = "§d" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("YELLOW")) {
              text = "§e" + signalName;
            } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                .equalsIgnoreCase("WHITE")) {
              text = "§f" + signalName;
            }

          }

          if (AdventureAddon.getAdventureSubSetting().cursive().get()) {

            if (AdventureAddon.getAdventureSubSetting().bold().get()) {

              if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("BLACK")) {
                text = "§0§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_BLUE")) {
                text = "§1§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_GREEN")) {
                text = "§2§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_AQUA")) {
                text = "§3§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_RED")) {
                text = "§4§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_PURPLE")) {
                text = "§5§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GOLD")) {
                text = "§6§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GRAY")) {
                text = "§7§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_GRAY")) {
                text = "§8§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("BLUE")) {
                text = "§9§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GREEN")) {
                text = "§a§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("AQUA")) {
                text = "§b§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("RED")) {
                text = "§c§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("LIGHT_PURPLE")) {
                text = "§d§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("YELLOW")) {
                text = "§e§l§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("WHITE")) {
                text = "§f§l§o" + signalName;
              }

            } else {

              if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("BLACK")) {
                text = "§0§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_BLUE")) {
                text = "§1§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_GREEN")) {
                text = "§2§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_AQUA")) {
                text = "§3§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_RED")) {
                text = "§4§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_PURPLE")) {
                text = "§5§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GOLD")) {
                text = "§6§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GRAY")) {
                text = "§7§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("DARK_GRAY")) {
                text = "§8§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("BLUE")) {
                text = "§9§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("GREEN")) {
                text = "§a§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("AQUA")) {
                text = "§b§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("RED")) {
                text = "§c§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("LIGHT_PURPLE")) {
                text = "§d§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("YELLOW")) {
                text = "§e§o" + signalName;
              } else if (AdventureAddon.getAdventureSubSetting().color().get().toString()
                  .equalsIgnoreCase("WHITE")) {
                text = "§f§o" + signalName;
              }

            }
          }
        }

        String itemStackName = PlainTextComponentSerializer.plainText()
            .serialize(itemStack.getDisplayName());

        if (itemStackName.equalsIgnoreCase("Adventurer Master-Schwert")
            || itemStackName.equalsIgnoreCase("Adventurer Master-Schaufel")
            || itemStackName.equalsIgnoreCase("Adventurer Master-Axt")
            || itemStackName.equalsIgnoreCase("Adventurer Master-Spitzhacke")
            || itemStackName.equalsIgnoreCase("Adventurer Master-Bogen")
            || itemStackName.equalsIgnoreCase("Bergkristall")
            || itemStackName.equalsIgnoreCase("Smaragd Amulett")
            || itemStackName.equalsIgnoreCase("Klassische Rüstung")
            || itemStackName.equalsIgnoreCase("Klassische Spitzhacke")
            || itemStackName.equalsIgnoreCase("Klassische Schaufel")
            || itemStackName.equalsIgnoreCase("Klassische Hacke")
            || itemStackName.equalsIgnoreCase("Klassisches Schwert")
            || itemStackName.equalsIgnoreCase("Klassische Axt")
            || itemStackName.equalsIgnoreCase("Community-Kiste")
            || itemStackName.equalsIgnoreCase(
            "Super-Unlucky Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase("Ultra Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase("Mega-Unlucky Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase(
            "Ultra-Unlucky Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase("Mega Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase("Super Adventurer Luckyblock (LuckyBlock)")
            || itemStackName.equalsIgnoreCase("Ocean Farbe")
            || itemStackName.equalsIgnoreCase("Quarz Rand")
            || itemStackName.equalsIgnoreCase("Erze Rand")
            || itemStackName.equalsIgnoreCase("Ruinen Rand")
            || itemStackName.equalsIgnoreCase("Eiszapfen Rand")
            || itemStackName.equalsIgnoreCase("Galaxy Rand")
            || itemStackName.equalsIgnoreCase("Graue Erleuchtung")
            || itemStackName.equalsIgnoreCase("Grauer Rand Rand")
            || itemStackName.equalsIgnoreCase("Galaxy Farbe")) {
          if (getRepairCost(itemStack) == 0) {
            event.getTooltipLines()
                .add(PlainTextComponentSerializer.plainText().deserialize(text));
          }
        }
      }

    }
  }

  private static Integer getRepairCost(ItemStack itemStack) {

    return itemStack.getOrCreateNBTTag().getInt("RepairCost");

  }
}
