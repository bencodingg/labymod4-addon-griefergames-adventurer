package de.benudo.configuration.subsettings;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AdventureSubSetting extends Config {

  @ParentSwitch
  @SpriteSlot(x = 7)
  @SwitchSetting
  private ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SpriteSlot(size = 32, x = 1)
  @TextFieldSetting
  private ConfigProperty<String> text = new ConfigProperty<>("ADVENTURE ITEM");

  @SpriteSlot(size = 32, y = 1, x = 1)
  @SwitchSetting
  private ConfigProperty<Boolean> star = new ConfigProperty<>(true);

}
