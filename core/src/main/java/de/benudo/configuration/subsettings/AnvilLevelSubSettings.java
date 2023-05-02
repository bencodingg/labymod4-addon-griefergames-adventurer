package de.benudo.configuration.subsettings;

import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.color.ColorPickerWidget.ColorPickerSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import java.awt.*;

public class AnvilLevelSubSettings extends Config {

  @ParentSwitch
  @SpriteSlot(x = 7)
  @SwitchSetting
  private ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SpriteSlot(x = 1, y = 6)
  @ColorPickerSetting
  private ConfigProperty<Integer> labyModColor = new ConfigProperty<>(
      new Color(10, 85, 165).getRGB());

  @SpriteSlot(x = 2)
  @KeyBindSetting
  private ConfigProperty<Key> keyBind = new ConfigProperty<>(Key.G);
}
