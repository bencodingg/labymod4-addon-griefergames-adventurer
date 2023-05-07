package de.benudo.configuration.subsettings;

import de.benudo.configuration.AdventureEnum;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.dropdown.DropdownWidget.DropdownSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AnvilLevelSubSettings extends Config {

  @ParentSwitch
  @SpriteSlot(x = 7)
  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SpriteSlot(size = 32, y = 1, x = 2)
  @DropdownSetting
  private final ConfigProperty<AdventureEnum> color = new ConfigProperty<>(AdventureEnum.GOLD);

  public ConfigProperty<Boolean> enabled() {
    return enabled;
  }

  public ConfigProperty<AdventureEnum> color() {
    return color;
  }

}

