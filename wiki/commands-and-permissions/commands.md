---
description: null
---

# Commands

> Required arguments are marked with `(argument)`
>
> Optional arguments are marked with `[argument]`

## Anyone Commands

| Command | Description | Verified only |  |  |  |  |  |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| `/union` | Opens the GUI or shows the help | No |  |  |  |  |  |
| `/union help` | Shows the plugin's commands | No |  |  |  |  |  |
| `/union create [tag] [name]` | Creates a new union | No |  |  |  |  |  |
| `/accept` | Accepts a request | No |  |  |  |  |  |
| `/deny` | Denies a request | No |  |  |  |  |  |
| `/more` | Shows more information | No |  |  |  |  |  |
| `/union leaderboard` | Shows the leaderboard | No |  |  |  |  |  |
| \`/union list \[name | size | kdr | founded | active\] \[asc | desc\]\` | Lists all unions | No |
| `/union rivalries` | Shows all union rivalries | No |  |  |  |  |  |
| `/union alliances` | Shows all union alliances | No |  |  |  |  |  |
| `/union lookup [player]` | Looks up your or another player's info | No |  |  |  |  |  |
| `/union profile [tag]` | Shows another union's profile | Yes\* |  |  |  |  |  |
| `/union roster [tag]` | Shows another union's roster | Yes\* |  |  |  |  |  |
| \`/union ff \(allow | auto\)\` | Toggles personal friendly fire | No |  |  |  |  |
| `/union resetkdr` | Resets your KDR | No |  |  |  |  |  |

\\* The target union

## Members Commands

### General Commands

| Command | Description | Verified only |
| :--- | :--- | :--- |
| `/union kills [player]` | Shows your or another player's kill counts | Yes |
| `/union toggle` | Toggles personal settings | Yes |
| `/union mostkilled` | Shows server-wide most killed counts | Yes |
| `/union resign` | Resigns from the union | No |
| `/union fee check` | Checks if the fee is enabled and how much it costs | Yes |
| `/union vitals` | Shows your union's vitals | Yes |
| `/union stats` | Shows your union's stats | Yes |
| `/union profile` | Shows your union's profile | Yes |
| `/union roster` | Shows your union's roster | Yes |
| `/union coords` | Shows your union's coords | Yes |

### Chat Commands

| Command | Description | Verified only |  |  |
| :--- | :--- | :--- | :--- | :--- |
| `/. (message)` | Sends a message to your union's chat | No |  |  |
| \`/. \[join | leave | mute\]\` | Joins/leaves/mutes your union's chat | No |
| `/ally (message)` | Sends a message to the ally chat | No |  |  |
| \`/ally \[join | leave | mute\]\` | Joins/leaves/mutes the ally chat | No |

## Leaders Commands

| Command | Description | Verified only |  |
| :--- | :--- | :--- | :--- |
| `/union description (description)` | Modifies the union's description | Yes |  |
| `/union invite (player)` | Invites a player | No |  |
| `/union kick (player)` | Kicks a player from the union | No |  |
| `/union trust (player)` | Sets a member as trusted | No |  |
| `/union untrust (player)` | Sets a member as untrusted | No |  |
| `/union promote (member)` | Promotes a member to leader | No |  |
| `/union demote (leader)` | Demotes a leader to member | No |  |
| `/union setbanner` | Sets the union's banner | Yes |  |
| `/union modtag (tag)` | Modifies your union's tag \(only colors and case\) |  |  |
| \`/union clanff \(allow | block\)\` | Toggles union's friendly fire | No |
| \`/union war \(start | end\) \(tag\)\` | Starts or ends a war | Yes |
| \`/union rival \(add | remove\) \(tag\)\` | Adds or removes a rival | Yes |
| \`/union ally \(add | remove\) \(tag\)\` | Adds or removes an ally | Yes |
| `/union verify` | Verifies your union | No |  |
| `/union disband` | Disbands your union | No |  |
| `/union fee set (amount)` | Sets the union's member fee | No |  |
| `/union regroup me` | Regroups your union members to your location | Yes |  |
| `/union regroup home` | Regroups your union members to your union's home | Yes |  |
| `/union home` | Teleports to your union's home | Yes |  |
| `/union home clear` | Clears your union's home | Yes |  |
| `/union home set` | Sets your union's home | Yes |  |
| `/union rank create` | Creates a rank | Yes |  |
| `/union rank setdisplayname (rank) (displayname)` | Sets the display name of the rank \(it can contain colors and multiple words\) | Yes |  |
| `/union rank assign (player) (rank)` | Assigns a user to a rank | Yes |  |
| `/union rank unassign (player)` | Unassigns a user from a rank | Yes |  |
| `/union rank delete (rank)` | Deletes a rank | Yes |  |
| `/union rank list` | Lists the union's ranks | Yes |  |
| `/union rank permissions` | Lists the available permissions for ranks | Yes |  |
| `/union rank permissions (rank)` | Lists the rank's permissions | Yes |  |
| `/union rank permissions add (rank) (permission)` | Adds a permission to the rank | Yes |  |
| `/union rank permissions remove (rank) (permission)` | Removes a permission from the rank | Yes |  |

## Mod Commands

| Command | Description |  |
| :--- | :--- | :--- |
| `/union place (player) (new union)` | Places a player in a union |  |
| `/union home set (tag)` | Sets a union's home |  |
| `/union home tp (tag)` | Teleports to a union's home |  |
| `/union ban (player)` | Bans a player from union commands |  |
| `/union unban (player)` | Unbans a player from union commands |  |
| \`/union globalff \(allow | auto\)\` | Toggles the global friendly-fire status |
| `/union verify (tag)` | Verifies a union |  |
| `/union disband (tag)` | Disbands a union |  |

## Admin Commands

| Command | Description |
| :--- | :--- |
| `/union reload` | Reloads the plugin and its configuration \(some features may need a server restart\) |
| `/union purge` | Purges a player's data |
| `/union resetkdr everyone` | Resets everyone's KDR |
| `/union resetkdr (player)` | Resets a player's KDR |
| `/union admin demote (player)` | Demotes a leader from any union |
| `/union admin promote (player)` | Promotes a member from any union |

