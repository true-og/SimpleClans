package net.sacredlabyrinth.phaed.simpleclans.commands.clan;

import net.sacredlabyrinth.phaed.simpleclans.ChatBlock;
import net.sacredlabyrinth.phaed.simpleclans.Clan;
import net.sacredlabyrinth.phaed.simpleclans.ClanPlayer;
import net.sacredlabyrinth.phaed.simpleclans.Helper;
import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author phaed
 */
public class KickCommand
{
    public KickCommand()
    {
    }

    /**
     * Execute the command
     * @param player
     * @param arg
     */
    public void execute(Player player, String[] arg)
    {
        SimpleClans plugin = SimpleClans.getInstance();

        if (plugin.getPermissionsManager().has(player, "simpleclans.leader.kick"))
        {
            ClanPlayer cp = plugin.getClanManager().getClanPlayer(player);

            if (cp != null)
            {
                Clan clan = cp.getClan();

                if (clan.isLeader(player))
                {
                    if (arg.length == 1)
                    {
                        Player kicked = Helper.matchOnePlayer(arg[0]);

                        if (kicked != null)
                        {
                            if (!kicked.getName().equals(player.getName()))
                            {
                                if (clan.isMember(kicked))
                                {
                                    if (!clan.isLeader(kicked))
                                    {
                                        clan.addBb(player.getName(), ChatColor.AQUA + Helper.capitalize(kicked.getName()) + " has been kicked by " + player.getName());
                                        clan.removePlayerFromClan(kicked);
                                    }
                                    else
                                    {
                                        ChatBlock.sendMessage(player, ChatColor.RED + "You cannot kick another leader");
                                    }
                                }
                                else
                                {
                                    ChatBlock.sendMessage(player, ChatColor.RED + "The player is not a member of your clan");
                                }
                            }
                            else
                            {
                                ChatBlock.sendMessage(player, ChatColor.RED + "You cannot kick yourself");
                            }
                        }
                        else
                        {
                            ChatBlock.sendMessage(player, ChatColor.RED + "No player matched");
                        }
                    }
                    else
                    {
                        ChatBlock.sendMessage(player, ChatColor.RED + "Usage: /clan kick [player]");
                    }
                }
                else
                {
                    ChatBlock.sendMessage(player, ChatColor.RED + "You do not have leader permissions");
                }
            }
            else
            {
                ChatBlock.sendMessage(player, ChatColor.RED + "You are not a member of any clan");
            }
        }
        else
        {
            ChatBlock.sendMessage(player, ChatColor.RED + "Insufficient permissions");
        }
    }
}
