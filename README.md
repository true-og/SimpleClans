[![Unions-OG Logo](https://i.imgur.com/9vgfVdX.png)](https://www.spigotmc.org/resources/simpleclans.71242/)

Unions-OG
==========

Full featured union system for PVP Minecraft servers!

[![Build Status](https://img.shields.io/jenkins/build?jobUrl=https%3A%2F%2Fci.roinujnosde.me%2Fjob%2FSimpleClans%2F)](https://ci.roinujnosde.me/job/SimpleClans/)
[![Spiget Downloads](https://img.shields.io/spiget/downloads/71242)](https://www.spigotmc.org/resources/simpleclans.71242/)
[![Issues](https://img.shields.io/github/issues/RoinujNosde/SimpleClans.svg)](https://github.com/RoinujNosde/SimpleClans/issues)
[![Crowdin](https://badges.crowdin.net/simpleclans/localized.svg)](https://crowdin.com/project/simpleclans)
[![Discord](https://img.shields.io/discord/719557355917934613?label=discord&logo=discord)](https://discord.gg/CkNwgdE)
[![bStats Servers](https://img.shields.io/bstats/servers/7131)](https://bstats.org/plugin/bukkit/SimpleClans/7131)
[![bStats Players](https://img.shields.io/bstats/players/7131)](https://bstats.org/plugin/bukkit/SimpleClans/7131)


#### Download Link

* [Download from Spigot](https://www.spigotmc.org/resources/simpleclans.71242/)

#### Documentation 

* [Documentation](https://simpleclans.gitbook.io/simpleclans/)
* Commands & Permissions
  * [Permissions](https://simpleclans.gitbook.io/simpleclans/commands-and-permissions/permissions)
  * [Commands](https://simpleclans.gitbook.io/simpleclans/commands-and-permissions/commands)
  * [Union Alliances and Rivalries](https://simpleclans.gitbook.io/simpleclans/commands-and-permissions/aliances-and-rivalries)
  * [Union Ranks with Permissions](https://simpleclans.gitbook.io/simpleclans/commands-and-permissions/ranks-with-permissions)
* How to Setup
  * [Configuration](https://simpleclans.gitbook.io/simpleclans/how-to-setup/configuration)
  * [Translation](https://simpleclans.gitbook.io/simpleclans/how-to-setup/translation)
  * [Union Member Fee](https://simpleclans.gitbook.io/simpleclans/how-to-setup/member-fee)
  * [Union Upkeep](https://simpleclans.gitbook.io/simpleclans/how-to-setup/clan-upkeep)
  * [Union name above players head](https://simpleclans.gitbook.io/simpleclans/how-to-setup/clan-below-players-name)
  * [Union name on Tablist](https://simpleclans.gitbook.io/simpleclans/how-to-setup/clan-on-tablist)
* Plugins & Development 
  * [Unions-OG API Example](https://simpleclans.gitbook.io/simpleclans/other/simpleclans-api)
  * [PlaceholderAPI Placeholders](https://simpleclans.gitbook.io/simpleclans/other/placeholderapi-support)
  * [Land Protection Plugins](https://simpleclans.gitbook.io/simpleclans/other/land-claims)
  
#### Support & Suggestions

* [Discord Support](https://discord.gg/CkNwgdE)
* [Bugs and Suggestions](https://github.com/RoinujNosde/SimpleClans/issues)

#### Current Changes over SimpleClans

* Renamed to `Unions-OG`.
* Clans renamed to unions.
* Added /union commands.
* Union tag color changes now use `/union color <color>`.
* The new permission node is `simpleclans.leader.color`.

#### Developers

Including Unions-OG with Maven:
```xml
<repositories>
    <repository>
        <id>roinujnosde-repo</id>
        <url>https://repo.roinujnosde.me/releases/</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>net.sacredlabyrinth.phaed.simpleclans</groupId>
        <artifactId>SimpleClans</artifactId>
        <version>2.19.2</version> <!-- Current stable release; master is 2.19.3-SNAPSHOT -->
        <scope>provided</scope>
    </dependency>
</dependencies>
```

Using Gradle:
```groovy
repositories {
    maven {
        url  "https://repo.roinujnosde.me/releases/" 
    }
}
dependencies {
    compileOnly "net.sacredlabyrinth.phaed.simpleclans:SimpleClans:2.19.2"
}
```

Feel free to learn our [Javadoc](https://ci.roinujnosde.me/job/SimpleClans/Javadoc/).
Compatibility note: the published Maven coordinates, package names, and permissions still use `simpleclans`.
PlaceholderAPI supports both `simpleclans` and `simpleunions`, and union aliases such as `in_union`, `union_name`, and `topunions_#_union_name` resolve under either identifier.
##### Latest version:
[![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepo.roinujnosde.me%2Freleases%2Fnet%2Fsacredlabyrinth%2Fphaed%2Fsimpleclans%2FSimpleClans%2Fmaven-metadata.xml)](https://repo.roinujnosde.me/#/releases/net/sacredlabyrinth/phaed/simpleclans/SimpleClans)
##### API Examples
* [Examples of how to use the API](https://simpleclans.gitbook.io/simpleclans/other/simpleclans-api)


[![Mikasa Host](https://mikasa.host/images/partners/banners/SimpleClans.gif)](https://mikasa.host/ref/6)
