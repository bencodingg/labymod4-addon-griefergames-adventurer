package de.benudo.configuration.subsettings;

import de.benudo.configuration.AdventureEnum;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.dropdown.DropdownWidget.DropdownSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AdventureSubSetting extends Config {

  @ParentSwitch
  @SpriteSlot(x = 7)
  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SpriteSlot(size = 32, x = 1)
  @TextFieldSetting
  private final ConfigProperty<String> text = new ConfigProperty<>("ADVENTURE ITEM");

  @SpriteSlot(size = 32, y = 1, x = 2)
  @DropdownSetting
  private final ConfigProperty<AdventureEnum> color = new ConfigProperty<>(AdventureEnum.GREEN);

  @SpriteSlot(size = 32, y = 1, x = 3)
  @SwitchSetting
  private final ConfigProperty<Boolean> bold = new ConfigProperty<>(true);

  @SpriteSlot(size = 32, y = 2, x = 0)
  @SwitchSetting
  private final ConfigProperty<Boolean> cursive = new ConfigProperty<>(false);

  @SpriteSlot(size = 32, y = 1, x = 1)
  @SwitchSetting
  private final ConfigProperty<Boolean> star = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> enabled() {
    return enabled;
  }

  public ConfigProperty<String> text() {
    return text;
  }

  public ConfigProperty<AdventureEnum> color() {
    return color;
  }

  public ConfigProperty<Boolean> bold() {
    return bold;
  }

  public ConfigProperty<Boolean> cursive() {
    return cursive;
  }

  public ConfigProperty<Boolean> star() {
    return star;
  }

}
