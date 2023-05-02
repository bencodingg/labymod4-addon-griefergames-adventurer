package de.benudo.commands;

import de.benudo.AdventureAddon;
import de.benudo.configuration.AdventureConfiguration;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatMessageSendEvent;

public class AdventurerCommand {

  @Subscribe
  public void onChat(ChatMessageSendEvent event) {

    if(event.isMessageCommand()) {

      if(event.getMessage().equalsIgnoreCase("/discord") || event.getMessage().equalsIgnoreCase("/adventurer")) {

        if (AdventureConfiguration.enabled.get()) {

            event.setCancelled(true);
            AdventureAddon.getInstance().displayMessage(
                "§6Link: §bhttps://minecraft-server.eu/vote/index/1A73C/"
                    + AdventureAddon.getInstance().labyAPI().getName()
                    + " \n§fFür das Voten erhälst du §5eine Vote-Kiste§f, welche du am \n§fSpawn einlösen kannst, um §5an hilfreiche Items §fzu kommen! \n§fMit §c/geschenk bekommst du §fdeine Belohnung!"
                    +
                    "\n§6Link: §bhttps://minecraft-server.eu/vote/index/1A73C/"
                    + AdventureAddon.getInstance().labyAPI().getName());

          }

        }

      }

    }

  }

}
