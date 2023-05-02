package de.benudo.configuration;

import de.benudo.AdventureAddon;
import de.benudo.configuration.subsettings.AdventureSubSetting;
import de.benudo.configuration.subsettings.AnvilLevelSubSettings;
import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.ButtonWidget.ButtonSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.dropdown.DropdownWidget.DropdownSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.annotation.SpriteTexture;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.Setting;
import net.labymod.api.configuration.settings.annotation.SettingSection;
import net.labymod.api.util.MethodOrder;

@SuppressWarnings("FieldMayBeFinal")
@ConfigName("settings")
@SpriteTexture(value = "settings")
public class AdventureConfiguration extends AddonConfig {

      @SpriteSlot(size = 32)
      @SwitchSetting
      public static ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

      @SettingSection("adventurer")
      @SpriteSlot(size = 32, x = 3)
      @SwitchSetting
      public static AdventureSubSetting adventureSubSettings = new AdventureSubSetting();

      @SpriteSlot(size = 32, y = 1)
      @SwitchSetting
      public static ConfigProperty<Boolean> price = new ConfigProperty<>(true);

      @SettingSection("general")
      @SpriteSlot(size = 32, x = 1)
      @SwitchSetting
      public static ConfigProperty<Boolean> vote = new ConfigProperty<>(true);

      @SpriteSlot(size = 32, x = 2 )
      @SwitchSetting
      public static AnvilLevelSubSettings subSettings = new AnvilLevelSubSettings();

  @Override
  public ConfigProperty<Boolean> enabled() {
    return enabled;
  }
}
