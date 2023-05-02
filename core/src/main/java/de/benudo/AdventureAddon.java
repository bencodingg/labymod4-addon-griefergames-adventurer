package de.benudo;

import de.benudo.commands.AdventurerCommand;
import de.benudo.commands.VoteCommand;
import de.benudo.configuration.AdventureConfiguration;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AdventureAddon extends LabyAddon<AdventureConfiguration> {

  private static AdventureAddon adventureAddon;

  @Override
  protected void enable() {
    adventureAddon = this;

    this.logger().info("[Adventurer] The addon was enabled!");

    this.registerListener(new VoteCommand());
    this.registerListener(new AdventurerCommand());

    this.registerSettingCategory();

  }

  @Override
  protected Class<AdventureConfiguration> configurationClass() {
    return AdventureConfiguration.class;
  }

  public static AdventureAddon getInstance() {
    return adventureAddon;
  }
}
