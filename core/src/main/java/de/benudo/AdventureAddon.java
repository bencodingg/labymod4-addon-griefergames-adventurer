package de.benudo;

import de.benudo.adventurer.AdventureEvent;
import de.benudo.adventurer.PriceEvent;
import de.benudo.commands.AdventurerCommand;
import de.benudo.commands.VoteCommand;
import de.benudo.configuration.AdventureConfiguration;
import de.benudo.configuration.subsettings.AdventureSubSetting;
import de.benudo.configuration.subsettings.AnvilLevelSubSettings;
import de.benudo.events.AnvilLevelEvent;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AdventureAddon extends LabyAddon<AdventureConfiguration> {

  private static AdventureAddon adventureAddon;
  private static AdventureSubSetting adventureSubSetting;
  private static AnvilLevelSubSettings anvilLevelSubSettings;

  @Override
  protected void enable() {
    adventureAddon = this;
    adventureSubSetting = configuration().adventureSubSettings();
    anvilLevelSubSettings = configuration().anvilLevelSubSettings();

    this.logger().info("[Adventurer] The addon was enabled!");
    this.registerSettingCategory();

    this.registerListener(new VoteCommand());
    this.registerListener(new AdventurerCommand());

    this.registerListener(new AnvilLevelEvent());
    this.registerListener(new PriceEvent());
    this.registerListener(new AdventureEvent());
  }

  @Override
  protected Class<? extends AdventureConfiguration> configurationClass() {
    return AdventureConfiguration.class;
  }

  public static AdventureAddon getInstance() {
    return adventureAddon;
  }

  public static AdventureSubSetting getAdventureSubSetting() {
    return adventureSubSetting;
  }

  public static AnvilLevelSubSettings getAnvilLevelSubSettings() {
    return anvilLevelSubSettings;
  }
}
