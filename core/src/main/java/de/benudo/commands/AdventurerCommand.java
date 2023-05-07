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

        if (AdventureAddon.getInstance().configuration().enabled().get()) {

          event.setCancelled(true);
          AdventureAddon.getInstance().displayMessage("§8● §2Adventurer-Addon §8┃ §aThank you for using this addon! \n§7Here is our discord§8: §ahttps://dsc.gg/adventurer");

          }

        }

      }

    }

  }
