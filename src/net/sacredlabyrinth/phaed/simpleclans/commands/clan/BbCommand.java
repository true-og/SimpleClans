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
public class BbCommand
{
    public BbCommand()
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

        ClanPlayer cp = plugin.getClanManager().getClanPlayer(player);

        if (cp != null)
        {
            Clan clan = cp.getClan();

            if (clan.isVerified())
            {
                if (arg.length == 0)
                {
                    if (plugin.getPermissionsManager().has(player, "simpleclans.member.bb"))
                    {
                        clan.displayBb(player);
                    }
                    else
                    {
                        ChatBlock.sendMessage(player, ChatColor.RED + "Insufficient permissions");
                    }
                }
                else
                {
                    if (plugin.getPermissionsManager().has(player, "simpleclans.leader.bb"))
                    {
                        if (clan.isLeader(player))
                        {
                            String msg = Helper.toMessage(arg);
                            clan.addBb(player.getName(), player.getName() + ": " + msg);
                            plugin.getStorageManager().updateClan(clan);
                        }
                        else
                        {
                            ChatBlock.sendMessage(player, ChatColor.RED + "You do not have leader permissions");
                        }
                    }
                    else
                    {
                        ChatBlock.sendMessage(player, ChatColor.RED + "Insufficient permissions");
                    }
                }
            }
            else
            {
                ChatBlock.sendMessage(player, ChatColor.RED + "Clan is not verified");
            }
        }
        else
        {
            ChatBlock.sendMessage(player, ChatColor.RED + "You are not a member of any clan");
        }
    }
}
